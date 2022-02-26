package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repositories.RoleDAO;

@Service
public class RoleService {
	
	
	private RoleDAO roleDAO;
	
	@Autowired
	public RoleService(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}
	
	
	
}
