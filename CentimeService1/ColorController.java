package com.centimeService.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {
	
	@Autowired
	ColorServiceImpl colorServiceImpl;
	
	
	@PostMapping("/createdDBData")
	public String fillDataToDB(@RequestBody List<ColorDTO> request) {
		
		
		String str=colorServiceImpl.fillDataToDB(request);
		return str;
	}

}
