package com.example.demo.student.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.student.models.AddBusiness;
import com.example.demo.student.repositories.BusinessRepository;
@Service
public class AddBusinessService {
	
	@Autowired
	private BusinessRepository businessRepository;
	
	public String saveBusinessDetais(AddBusiness addBusiness) {
		businessRepository.save(addBusiness);
		
		
		return "Business Saved!";
	}
	
	public AddBusiness getBusinessDetails(String id) {
		
		
		return businessRepository.findBusinessById(id);
	}

}
