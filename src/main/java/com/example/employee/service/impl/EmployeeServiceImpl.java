package com.example.employee.service.impl;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public Page<Employee> getAllEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existingEmployee = getEmployee(id);
        // Update fields
        existingEmployee.setTitle(employee.getTitle());
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setDesignation(employee.getDesignation());
        existingEmployee.setDateOfBirth(employee.getDateOfBirth());
        existingEmployee.setFatherName(employee.getFatherName());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setGender(employee.getGender());
        existingEmployee.setSpouseName(employee.getSpouseName());
        existingEmployee.setPermanentAddress(employee.getPermanentAddress());
        existingEmployee.setTemporaryAddress(employee.getTemporaryAddress());
        existingEmployee.setAvatarPath(employee.getAvatarPath());
        
        return employeeRepository.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> searchEmployees(String query, Pageable pageable) {
        // Implement search logic
        return employeeRepository.findAll(pageable);
    }
}