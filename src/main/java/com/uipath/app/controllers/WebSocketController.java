package com.uipath.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.http.HttpHeaders;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.uipath.app.tasks.QueueProgressTrackTask;

@RestController
public class WebSocketController {

    private final SimpMessagingTemplate template;
    
    @Autowired
	private ObjectMapper mapper;
    
    @Autowired
    @Qualifier("queueProgressThreadPoolExecutor")
	private TaskExecutor threadPoolTaskExecutor;
    
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    WebSocketController(SimpMessagingTemplate template){
        this.template = template;
    }
    
    @RequestMapping("/ping")
	public String ping() {
		return "pinged";
	}

    @RequestMapping(value="/sendjobstatus", method=RequestMethod.POST)
    public void sendJobStatus(@RequestBody String jobStatusBody, @RequestHeader HttpHeaders jobStatusHeaders){
    	
    	System.out.println("jobStatusBody : "+jobStatusBody);
    	
    	for(String key : jobStatusHeaders.keySet())
    	{
    		System.out.println("Key : "+key + "Value : "+jobStatusHeaders.getFirst(key));
    	}
    	
        this.template.convertAndSend("/jobstatus",  extractStausFromResponse(jobStatusBody));
    }
    
    /*@RequestMapping(value="/sendjobstatustouser/{sessionid}", method=RequestMethod.POST)
    public void sendjobstatustouser(@RequestBody(required=false) String jobStatusBody, @RequestHeader(required=false) HttpHeaders jobStatusHeaders, @PathVariable("sessionid") String sessionid){
    	System.out.println("sessionid : "+sessionid);
        this.template.convertAndSend("/topic/jobstatus"+"-user"+sessionid,  "Test Status for sessionid : "+sessionid);
    }*/
    
    private String extractStausFromResponse(String jobStatusBody)
    {
    	try 
    	{
			JsonNode jsonNode = mapper.readTree(jobStatusBody);
			return jsonNode.get("Job").get("State").textValue();
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	return "";
    }
    
    @RequestMapping(value="/sendQueueItemAdded", method=RequestMethod.POST)
    public void sendQueueItemAdded(@RequestBody String body, @RequestHeader HttpHeaders headers){
    	String reference = extractReferenceFromNewQueueItem(body);
    	System.out.println("reference : "+reference);
        this.template.convertAndSend("/topic/jobstatus"+"-user"+reference,  "UiPath Queue Item Added");
    }
    
    private String extractReferenceFromNewQueueItem(String body)
    {
    	try 
    	{
			JsonNode jsonNode = mapper.readTree(body);
			ArrayNode arrayNode = (ArrayNode)jsonNode.get("QueueItems");
			return arrayNode.get(0).get("Reference").textValue();
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	return "";
    }
    
    @RequestMapping(value="/sendTxnItemStarted", method=RequestMethod.POST)
    public void sendTransactionItemStarted(@RequestBody String body, @RequestHeader HttpHeaders headers){
    	String str[] = extractQueueIdAndReferenceFromStartedTxnItem(body);
    	String queueItemId = str[0];
    	String reference = str[1];
    	System.out.println("reference : "+reference);
        this.template.convertAndSend("/topic/jobstatus"+"-user"+reference,  "UiPath Txn Item Started");
        
        QueueProgressTrackTask queueProgressTrackTask = applicationContext.getBean(QueueProgressTrackTask.class);
        queueProgressTrackTask.setDestination("/topic/jobstatus"+"-user"+reference);
        queueProgressTrackTask.setQueueItemId(queueItemId);
        queueProgressTrackTask.setTemplate(this.template);
        
        threadPoolTaskExecutor.execute(queueProgressTrackTask);
    }
    
    private String[] extractQueueIdAndReferenceFromStartedTxnItem(String body)
    {
    	try 
    	{
    		System.out.println("body : "+body);
			JsonNode jsonNode = mapper.readTree(body);
			String reference = jsonNode.get("QueueItem").get("Reference").textValue();
			String queueItemId = jsonNode.get("QueueItem").get("Id").intValue()+"";
			return new String[] {queueItemId, reference};
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	return null;
    }
    
    @RequestMapping(value="/sendTxnItemCompleted", method=RequestMethod.POST)
    public void sendTransactionItemCompleted(@RequestBody String body, @RequestHeader HttpHeaders headers){
    	String reference = extractReferenceFromCompletedTxnItem(body);
    	System.out.println("reference : "+reference);
        this.template.convertAndSend("/topic/jobstatus"+"-user"+reference,  "UiPath Txn Item Completed");
    }
    
    private String extractReferenceFromCompletedTxnItem(String body)
    {
    	try 
    	{
			JsonNode jsonNode = mapper.readTree(body);
			return jsonNode.get("QueueItem").get("Reference").textValue();
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	return "";
    }
    
    @RequestMapping(value="/testendpoint", method=RequestMethod.POST)
    public void testendpoint(@RequestBody String body, @RequestHeader HttpHeaders headers)
    {
    	System.out.println("body : "+body);
    	for(String key : headers.keySet())
    	{
    		System.out.println("Key : "+key + "Value : "+headers.getFirst(key));
    	}
    }
}
