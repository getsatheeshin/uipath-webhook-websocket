package com.uipath.app.controllers;

import java.security.cert.X509Certificate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ExternalAuthentication 
{
	@Autowired
	private ObjectMapper mapper;
	
    @RequestMapping("/ping/ea")
	public String ping(HttpServletRequest request, HttpServletResponse response) {
    	if(request == null)
    	{
    		System.out.println("null");
    	}
    	else
    	{
    		System.out.println(request);
    		
    		X509Certificate[] certs = (X509Certificate[])request.getAttribute("javax.servlet.request.X509Certificate");
    		
    		System.out.println(certs == null);
    	}
		return "pingedEA";
	}

    @RequestMapping(value="/rest/1.0/credentials", method=RequestMethod.POST)
    public ResponseEntity<String> externalAuthentication(@RequestBody String eaBody, @RequestHeader HttpHeaders eaHeaders)
    {
    	ResponseEntity<String> ret = null;
    	try 
    	{
			System.out.println("jobStatusBody : "+eaBody);
			
			for(String key : eaHeaders.keySet())
			{
				System.out.println("Key : "+key + "Value : "+eaHeaders.getFirst(key));
			}
			
			JsonNode jsonNode = mapper.readTree(eaBody);
			if(jsonNode.get("password")!= null && jsonNode.get("password").asText().equals("XXXXX"))
			{
				ret = ResponseEntity.status(HttpStatus.OK).body("{\"forcePasswordChange\":\"false\"}");
			}
			else
			{
				ret = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"errorCode\":\"CC0193\",\"errorStack\":null,\"messages\":[{\"code\":\"CC0193\",\"message\":\"CC0193: Invalid Credentials. (msg.id=47DA6F1A)\",\"property\":null}]}");
			}
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	
    	return ret;
    }
    
    @RequestMapping(value="/rest/1.0/webhook", method=RequestMethod.POST)
    public ResponseEntity<String> webhook(@RequestBody String eaBody, @RequestHeader HttpHeaders eaHeaders)
    {
    	ResponseEntity<String> ret = null;
    	try 
    	{
			System.out.println("jobStatusBody : "+eaBody);
			
			for(String key : eaHeaders.keySet())
			{
				System.out.println("Key : "+key + "Value : "+eaHeaders.getFirst(key));
			}
			
			/*request.getattr
			
			X509Certificate[] certs = (X509Certificate[])HttpServletRequest.getAttribute("javax.servlet.request.X509Certificate");*/
			
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	
    	return ret;
    }
    
    @RequestMapping(value="/rest/1.0/credentials/userAttributes/{loginName}", method=RequestMethod.GET)
    public ResponseEntity<String> getUserInfo(@RequestHeader HttpHeaders eaHeaders)
    {
    	return ResponseEntity.status(HttpStatus.OK).body("{\"forcePasswordChange\":\"false\"}");
    }
}
