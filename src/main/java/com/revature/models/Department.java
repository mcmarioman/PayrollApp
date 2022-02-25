package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Department {

	
	@Id
	@GeneratedValue
	private int departmentId;
	private String deparmentName;
	
	public Department(int departmentId, String deparmentName) {
		super();
		this.departmentId = departmentId;
		this.deparmentName = deparmentName;
	}

	
}
