package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.enitity.Employee;
import com.example.employee.service.ServiceController;

@RestController
public class Controller {
	
	@Autowired
	private ServiceController controller;
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee e) {
		return controller.addEmployee(e);
	}
	
	@GetMapping("/employees/{id}")
	public Employee getById(@PathVariable int id) {
		return controller.getEmployee(id);	
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return controller.getallEmployee();
	}
	
	@PutMapping("/employees")
	public Employee editEmployee(@RequestBody Employee e) {
		return controller.editEmploye(e);	
	}

	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return controller.deleteEmployee(id);
	}
}

