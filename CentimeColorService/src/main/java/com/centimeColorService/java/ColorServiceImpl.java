package com.centimeColorService.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorServiceImpl {
	
	@Autowired
	ColorRepository repo;
	
	@Autowired
	MainDTO mainDTO;
	
	@LogMethodParam
	public String fillDataToDB(List<ColorDTO> requestList) {
			
		for(ColorDTO req:requestList) {
			ColorEntity entity =new ColorEntity();
			entity.setParentId(req.getParentId());
			entity.setName(req.getName());
			entity.setColor(req.getColor());
			repo.save(entity);
		}
		
		return "DB data inserted successfully";
	}
	
	public ColorDTO fetchRecordById(long id) {
		ColorEntity cEntity;
		ColorDTO dto=new ColorDTO();;
		Optional<ColorEntity> obj=repo.findById(id);
		ColorEntity colorEntity = obj.orElseThrow(() -> 
        new EntityNotFoundException("ColorEntity with id " + id + " not found"));
//		if(obj.gisPresent()) {
//		cEntity=obj.get();
//		}else {
//			throw new RuntimeException("No such element found in database");
//			
//		}
		BeanUtils.copyProperties(colorEntity,dto);
		return dto;
	}
	

	public List<MainDTO> fetchListOfRecords(){
		
		
		List<ColorEntity> listEntity=repo.findAll();
		
		List<MainDTO> rootClasses=new ArrayList<>();
		
		Map<Long, MainDTO> allMap=new HashMap<>();
		
		for (ColorEntity colorEntity : listEntity) {
			MainDTO mainDTO=new MainDTO(colorEntity.getName(),new ArrayList<MainDTO>());
			allMap.put(colorEntity.getId(), mainDTO);
		}
		
		for (ColorEntity colorEntity : listEntity) {
			MainDTO mainDTO=allMap.get(colorEntity.getId());
            if (colorEntity.getParentId() == 0) {
            	
                rootClasses.add(mainDTO);  // Root class (no parent)
            } else {
            	MainDTO parent = allMap.get(colorEntity.getParentId());
            	if (parent != null) {
                    parent.addSubClass(mainDTO);  // Add this DTO as a subclass to its parent
                }  
            }
        }
		return rootClasses;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





}
