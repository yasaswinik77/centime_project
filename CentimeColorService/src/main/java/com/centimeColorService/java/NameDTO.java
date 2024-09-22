package com.centimeColorService.java;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Component
@Setter
@Getter
public class NameDTO {
	String name;

	public NameDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameDTO(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "NameDTO [name=" + name + "]";
	}

}
