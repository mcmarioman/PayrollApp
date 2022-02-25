package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Department;

@Repository
public interface DepartmentDAO extends JpaRepository<Department, Integer>{

}
