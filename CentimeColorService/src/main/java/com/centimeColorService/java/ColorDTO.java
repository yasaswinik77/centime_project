package com.centimeColorService.java;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColorDTO {

	private long id;
	private long parentId;
	private String name;
	private String color;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ColorDTO(long id, long parentId, String name, String color) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.name = name;
		this.color = color;
	}
	public ColorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
