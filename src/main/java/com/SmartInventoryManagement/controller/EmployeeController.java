package com.SmartInventoryManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SmartInventoryManagement.entities.EmployeeEntity;
import com.SmartInventoryManagement.repository.EmployeeRepository;
import com.SmartInventoryManagement.service.EmployeeService;



@RestController
@RequestMapping(value="/api/employees")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @Autowired
	EmployeeRepository employeeRepository;

	
	@GetMapping
	public List<EmployeeEntity> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable int id) {
		Optional<EmployeeEntity> optionalEmployee = employeeService.getEmployeeById(id);
		if (optionalEmployee.isPresent()) {
			return new ResponseEntity<>(optionalEmployee.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public void addEmployee(@RequestBody EmployeeEntity employee) {
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("/{id}")
	public void updateEmployee(@PathVariable int id, @RequestBody EmployeeEntity employee) {
		employeeService.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
	
}
//	@GetMapping("/{id}/login")
//    public ResponseEntity<String> employeeLogin(@PathVariable int id, @RequestParam String password) {
//        if (employeeService.employeeLogin(id, password)) {
//            return new ResponseEntity<>("1", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("0", HttpStatus.UNAUTHORIZED);
//        }
//    }
	
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.springrest.inventoryManagement.springrest.entities.Employee;
//import com.springrest.inventoryManagement.springrest.repository.EmployeeRepository;
//
//
//@RestController
//
//public class MyController {
//	@Autowired
//	EmployeeRepository employeeRepository;
//	
//	List<Employee> employees = new ArrayList<>();
//
//	
//	
//	@GetMapping(path="/employees")
//	public List<Employee> getEmployees() {
//		//return employees;
//		
//		return employeeRepository.findAll();
//	}
//	
	
//	
//	
//	@PostMapping(path="/employees")
//	public void addEmployee(@RequestBody Employee e) {
//		//employees.add(e);
//		employeeRepository.save(e);
//	}
//	@DeleteMapping(path="/employees/{id}")
//	public void deleteEmployee(@PathVariable int id) {
//		System.out.println("Id:"+id);
//		employeeRepository.deleteById(id);
//
//	}
//	@PatchMapping(path="/employees")
//	public void updateEmployee(@RequestBody Employee employee) {
//		Optional<Employee> employeeFound=employeeRepository.findById(employee.getEmployeeId());
//		if(employeeFound.isPresent()) {
//			Employee e = employeeFound.get();
//			e.setEmployeeEmail(employee.getEmployeeEmail());
//			e.setEmployeeGoDownId(employee.getEmployeeGoDownId());
//			
//			e.setEmployeePassword(employee.getEmployeePassword());
//			e.setEmployeePhoneNo(employee.getEmployeePhoneNo());
//			e.setEmployeeUserName(employee.getEmployeeUserName());
//			
//			employeeRepository.save(e);
//		}
//	
//	}	
//}