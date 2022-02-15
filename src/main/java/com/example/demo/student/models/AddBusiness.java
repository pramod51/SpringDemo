package com.example.demo.student.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Add_Business")
public class AddBusiness {
	

	
	@Id
	String id;
	
	String name;
	
	String description;
	
	int category;
	String number;
	int cancellicationAvailable;
	int[][] timeTable;
	int type;
	
	
	
	
	public AddBusiness() {
		super();
	}
	public AddBusiness(String  id, String name, String description, int category, String number,
			int cancellicationAvailable,int[][] timeTable, int type) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.number = number;
		this.cancellicationAvailable = cancellicationAvailable;
		this.timeTable = timeTable;
		this.type = type;
	}
	public String  getId() {
		return id;
	}
	public void setId(String  id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getCancellicationAvailable() {
		return cancellicationAvailable;
	}
	public void setCancellicationAvailable(int cancellicationAvailable) {
		this.cancellicationAvailable = cancellicationAvailable;
	}
	public int[][] getTimeTable() {
		return timeTable;
	}
	public void setTimeTable(int[][] timeTable) {
		this.timeTable = timeTable;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
	
	
	

}
