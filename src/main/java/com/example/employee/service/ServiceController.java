package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.enitity.Employee;
import com.example.employee.repository.repo;

@Service
public class ServiceController {
	 
	@Autowired
	private repo repository;
	
	public Employee addEmployee(Employee e) {
		return repository.save(e);
	}
	
	public List<Employee> getallEmployee(){
		return repository.findAll();
	}
	
	public Employee getEmployee(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Employee deleted id="+id;
	}
	
	public Employee editEmploye(Employee e) {
		Employee s= repository.findById(e.getId()).orElse(null);
		s.setName(e.getName());
		s.setSalary(e.getSalary());
		return s;
	}
}
