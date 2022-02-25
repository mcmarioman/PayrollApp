package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Department;
import com.revature.repositories.DepartmentDAO;

@Service
public class DepartmentService {

	private DepartmentDAO departmentDAO;
	
	@Autowired
	public DepartmentService(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}
	
	public List<Department> getAllDepartments() {
		return departmentDAO.findAll();
	}
	
	public void addDepartment(Department department) {
		departmentDAO.save(department);
	}
	
}
