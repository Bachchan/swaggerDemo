package com.example.swaggerDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.swaggerDemo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}