package com.centimeService.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service3ServiceImpl {
	
    public String concatenateResponse(Service3DTO req) {
		
		String str=req.getName()+" "+req.getSurName();
		return str;
		
	}


}
