package com.revature.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Department;
import com.revature.services.DepartmentService;

@RestController
@RequestMapping(value="department")
public class DepartmentController {
	
	
	private DepartmentService departmentService;
	
	public DepartmentController() {
		this.departmentService = departmentService;
	}
	
	@GetMapping
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}
	
	
}
