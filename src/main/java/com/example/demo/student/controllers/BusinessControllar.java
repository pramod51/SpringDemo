package com.example.demo.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.models.AddBusiness;
import com.example.demo.student.services.AddBusinessService;
@RestController
public class BusinessControllar {
	
	
	@Autowired
	private AddBusinessService addBusinessService;
	
	
	@PostMapping("/addBusiness")
	public String postAddBusiness(AddBusiness addBusiness) {
		return addBusinessService.saveBusinessDetais(addBusiness);
		
	}
	
	@GetMapping("/getBusiness/{id}")
	public AddBusiness getBusiness(@PathVariable String id) {
	
		
		return addBusinessService.getBusinessDetails(id);
	}
	

}
