package com.SmartInventoryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.SmartInventoryManagement.entities.EmployeeEntity;
import com.SmartInventoryManagement.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<EmployeeEntity> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Optional<EmployeeEntity> getEmployeeById(int id) {
		return employeeRepository.findById(id);
	}
	
	public void addEmployee(EmployeeEntity employee) {
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(int id, EmployeeEntity employee) {
		Optional<EmployeeEntity> optionalEmployee = employeeRepository.findById(id);
		if (optionalEmployee.isPresent()) {
			employee.setId(id);
			employeeRepository.save(employee);
		}
	}
	
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
//	public boolean employeeLogin(int id, String password) {
//        Optional<Employee> employeeFound = employeeRepository.findById(id);
//        if (employeeFound.isPresent()) {
//            Employee employee = employeeFound.get();
//            if (employee.getPassword().equals(password)) {
//                return true;
//            }
//        }
//        return false;
//    }

}
