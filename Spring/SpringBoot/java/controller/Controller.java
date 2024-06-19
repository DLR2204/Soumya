package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.Services;

@RestController
@RequestMapping("/employee")
public class Controller {

	@Autowired
	Services service;
	
	@PostMapping("/addemp") //http://localhost:1915/employee/addemp
	public String insertEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	@PutMapping("/updateemp")
	public String updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	@DeleteMapping("/deleteemp/{eid}")
	public String deleteEmployee(@PathVariable("eid") int empId) {
		return service.deleteEmployee(empId);
	}
	
	@GetMapping("/getemp/{eid}") //http://localhost:1915/employee/getemp/eid
	public Employee getEmployee(@PathVariable("eid") int empId) {
		return service.getEmployee(empId);
	}
	
}

