
package com.centimeColorService.java;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MainDTO {
	
	private String Name;
	private List<MainDTO> SubClasses;
	public MainDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MainDTO(String name, List<MainDTO> subClasses) {
		super();
		Name = name;
		this.SubClasses = new ArrayList<>();
	}
	public String getName() {
		return Name;
	}
	@Override
	public String toString() {
		return "MainDTO [Name=" + Name + ", SubClasses=" + SubClasses + "]";
	}
	public void setName(String name) {
		Name = name;
	}
	public List<MainDTO> getSubClasses() {
		return SubClasses;
	}
	public void setSubClasses(List<MainDTO> subClasses) {
		SubClasses = subClasses;
	}
	void addSubClass(MainDTO subClass) {
        this.SubClasses.add(subClass);
    }
	
	

}
