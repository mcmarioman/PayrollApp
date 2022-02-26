package com.revature.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Department;
import com.revature.services.DepartmentService;

@RestController
@RequestMapping(value="department")
public class DepartmentController {
	
	Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	private DepartmentService departmentService;
	
	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
		
	}
	
	@GetMapping
	public List<Department> getAllDepartments() {
		logger.info("returning all " + departmentService.getAllDepartments());
		return departmentService.getAllDepartments();
		
	}
	@PostMapping
	public ResponseEntity<Department> addDapartment(@RequestBody Department department) {
		departmentService.addDepartment(department);
		logger.info("returning all " + ResponseEntity.status(200).build());
		return ResponseEntity.status(200).build();
	}
}
