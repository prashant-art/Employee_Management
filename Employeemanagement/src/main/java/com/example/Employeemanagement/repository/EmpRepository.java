package com.example.Employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employeemanagement.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}