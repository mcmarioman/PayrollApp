package com.revature.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employee")
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employeeid")
	private Integer employeeId;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@OneToMany( fetch = FetchType.LAZY, mappedBy="employee", cascade = CascadeType.ALL)
	private Set<EmployeeRole> employeeRole;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="employee",cascade = CascadeType.ALL)
	private Set<Department> department;
	
	
}
