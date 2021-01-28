package com.uipath.app;

import java.security.MessageDigest;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uipath.restapi.model.AjaxResponse;
import com.uipath.restapi.model.LoginModel;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
    
    /*public static void main(String[] args) 
    {
		try 
		{
			MessageDigest md = MessageDigest.getInstance("SHA-256"); 
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}*/
}
