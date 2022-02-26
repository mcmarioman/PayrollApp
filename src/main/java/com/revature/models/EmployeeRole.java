package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employeerole")
public class EmployeeRole {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employeeroleId")
	private Integer employeeRoleId;
	
	@Column(name="title")
	private String title;
	
}
