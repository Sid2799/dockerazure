package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.enitity.Employee;

@Repository
public interface repo extends JpaRepository<Employee,Integer> {

}
