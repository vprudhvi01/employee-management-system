package com.example.employee.service;

import com.example.employee.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployee(Long id);
    Page<Employee> getAllEmployees(Pageable pageable);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
    Page<Employee> searchEmployees(String query, Pageable pageable);
}