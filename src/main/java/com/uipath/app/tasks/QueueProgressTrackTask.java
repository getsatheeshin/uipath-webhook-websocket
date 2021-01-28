package com.uipath.app.tasks;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class QueueProgressTrackTask implements Runnable 
{
	@Autowired
	private ObjectMapper mapper;
	
	private SimpMessagingTemplate template;
	private String destination;
	private String queueItemId;
	
	public void setTemplate(SimpMessagingTemplate template) {
		this.template = template;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setQueueItemId(String queueItemId) {
		this.queueItemId = queueItemId;
	}

	public QueueProgressTrackTask()
	{
		
	}
	
	@Override
	public void run() 
	{
		String progress = null;
		try 
		{
			while(true)
			{
				Thread.sleep(2000);
				progress = getQueueItemProgress();
				if(progress != null)
				{
					this.template.convertAndSend(this.destination,  "UiPath Txn Item Progress : " + progress);
					if("100%".equals(progress))
					{
						break;
					}
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public String getQueueItemProgress() throws JsonProcessingException, IOException
	{

		String authToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IlJUTkVOMEl5T1RWQk1UZEVRVEEzUlRZNE16UkJPVU00UVRRM016TXlSalUzUmpnMk4wSTBPQSJ9.eyJodHRwczovL3VpcGF0aC9lbWFpbCI6InN1aml2aXN2YUBnbWFpbC5jb20iLCJodHRwczovL3VpcGF0aC9lbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6Ly9hY2NvdW50LnVpcGF0aC5jb20vIiwic3ViIjoiYXV0aDB8NWNlNzdkNDQ0MWJkNjYwZjdjNTJkMzExIiwiYXVkIjpbImh0dHBzOi8vb3JjaGVzdHJhdG9yLmNsb3VkLnVpcGF0aC5jb20iLCJodHRwczovL3VpcGF0aC5ldS5hdXRoMC5jb20vdXNlcmluZm8iXSwiaWF0IjoxNTY3MTQ4MzUzLCJleHAiOjE1NjcyMzQ3NTMsImF6cCI6IjV2N1BtUEpMNkZPR3U2UkI4STFZNGFkTEJoSXdvdlFOIiwic2NvcGUiOiJvcGVuaWQgcHJvZmlsZSBlbWFpbCBvZmZsaW5lX2FjY2VzcyJ9.GeBqn1YLiKOvp02clF2mMkfZ_KAlB7DrMZ0E165Rs38SpPEkfge7C56ziiO4wsKxm8BFBxuPpYtJy0KcakdgcidpCD5IW9-iPrGN3gp7xoLiAt_myTbt9yA4MxG07CxMgwWIiMJw3UOagQUH_ccke0itUayZ96MNCV89WJlesXRN8v74al4iAXtPCw135gKrfUrN1fKAXnaub6KNU3v3n6oDAfS4n3EAPC7vsFvMJT2wsNeu1x5D_KKuW4pvkVbv5dQ-HeVKw28HglZpWioG-BG5Myx5Pjf4jmYv7mx8W5fu3i-vGsAjUhxVxiHyUneudNfT3avxqN357EhX47ECrg";
		
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders httpHeaders = new HttpHeaders();
		//httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		httpHeaders.set("Authorization", "Bearer " + authToken);
		
		//httpHeaders.set("Accept", "application/json");
		
		httpHeaders.set("X-UIPATH-TenantName", "SujithTenanq4ca71710");
		httpHeaders.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");


	    HttpEntity<String> entity = new HttpEntity<String>("parameters", httpHeaders);

		String uri = "https://platform.uipath.com/SujithTenant/SujithTenanq4ca71710/odata/QueueItems("+this.queueItemId+")";
		
		System.out.println("uri : "+uri);
		
		ResponseEntity<String> rspEntity= restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		String queueItemRsp = rspEntity.getBody();
		HttpStatus httpStatus= rspEntity.getStatusCode();
				
		System.out.println("queueItemRsp : "+queueItemRsp);
		System.out.println("httpStatus : "+httpStatus.value());
		 
		JsonNode jsonNode = mapper.readTree(queueItemRsp);
		return jsonNode.get("Progress").textValue();
	}
	
	public static void main(String[] args) 
	{
		try
		{
			QueueProgressTrackTask progressTrackTask = new QueueProgressTrackTask();
			progressTrackTask.setQueueItemId("21563510");
			System.out.println(progressTrackTask.getQueueItemProgress());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}