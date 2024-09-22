package com.centimeService.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Service
public class Service1ServiceImpl {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${microservice1.url}")
	String serviceUrl;
	
	@Value("${microservice2.url}")
	String url;

	
	public String getServiceStatus() {
		
		return "up";
	}
	
	public String getCombinedResponse( Service1DTO request ) {
		
		String str=restTemplate.getForObject(serviceUrl, String.class);
		
		String str2=restTemplate.postForObject(url, request, String.class);
		
		String s3=str+" "+str2;
		
		return s3;
	}
}
