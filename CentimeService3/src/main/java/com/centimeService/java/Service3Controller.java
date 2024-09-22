package com.centimeService.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Service3Controller {
	
	@Autowired
	Service3ServiceImpl service3ServiceImpl;
	
	private static final Logger logger=LogManager.getLogger(Service3Controller.class);
	
	@PostMapping("/postMethod")
	public String concatenatedResponse(@RequestBody Service3DTO request) throws JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(request);
	logger.info("Json printed "+json);	
		
	String str=service3ServiceImpl.concatenateResponse(request);
	return str;
		
	}

}
