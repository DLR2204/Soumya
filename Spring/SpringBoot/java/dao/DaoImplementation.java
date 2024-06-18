package com.example.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

@Transactional
@Repository
public class DaoImplementation implements Dao{
	
	@PersistenceContext
	EntityManager em;
	

	@Override
	public String addEmployee(Employee emp) {
		
		em.persist(emp);
		
		return "Employee data is inserted successfully";
	}

	@Override
	public String updateEmployee(Employee emp) {
		
		em.merge(emp);
		
		return "Employee data is updated successfully";
	}

	@Override
	public String deleteEmployee(int empId) {
		
		Employee emp = em.find(Employee.class,empId);
		
		em.remove(emp);
		return "Employee data is deleted successfully";
	}

	@Override
	public Employee getEmployee(int empId) {
		
		return em.find(Employee.class,empId);
	}

}
