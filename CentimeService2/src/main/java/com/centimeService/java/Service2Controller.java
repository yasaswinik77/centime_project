package com.centimeService.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
	@Autowired
	Service2ServiceImpl service2ServiceImpl;
	
	
	@GetMapping("/getString")
	public ResponseEntity<String> fetchHello(){
		String str=service2ServiceImpl.fetchStringHello();
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

}
