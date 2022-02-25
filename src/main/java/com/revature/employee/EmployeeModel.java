package com.revature.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Data
@Table(name="payrollemployee")
public class EmployeeModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employeeid")
	private Integer userId;
	
	
}
