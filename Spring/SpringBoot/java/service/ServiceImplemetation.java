package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Dao;
import com.example.entity.Employee;

@Service
public class ServiceImplemetation implements Services{
	@Autowired
	Dao dao;
	
	@Override
	public String addEmployee(Employee emp) {
		
		return dao.addEmployee(emp);
	}

	@Override
	public String updateEmployee(Employee emp) {
		
		return dao.updateEmployee(emp);
	}

	@Override
	public String deleteEmployee(int empId) {
		
		return dao.deleteEmployee(empId);
	}

	@Override
	public Employee getEmployee(int empId) {
		
		return dao.getEmployee(empId);
	}

	
}
