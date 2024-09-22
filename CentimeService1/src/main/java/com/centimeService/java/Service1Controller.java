package com.centimeService.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
	
	
	@Autowired
	Service1ServiceImpl service1ServiceImpl;
	
	@GetMapping("/status")
	public String getServiceStatus() {
		
		return "Up";
	}
	
	@PostMapping("/updatedResponse")
	public String getCombinedResponse(@RequestBody Service1DTO request ) {
		
		String str=service1ServiceImpl.getCombinedResponse(request);
		
		return str;
		
	}

}
