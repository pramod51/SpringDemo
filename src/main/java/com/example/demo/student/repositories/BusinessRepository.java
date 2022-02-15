package com.example.demo.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.student.models.AddBusiness;


@Repository
public interface BusinessRepository extends JpaRepository<AddBusiness,String>{

	@Query(value= "SELECT * FROM Add_Business where id=:id", nativeQuery = true)
	public AddBusiness findBusinessById(String id);
	 
}
