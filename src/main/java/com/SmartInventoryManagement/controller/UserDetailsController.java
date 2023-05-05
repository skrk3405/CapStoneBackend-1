package com.SmartInventoryManagement.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SmartInventoryManagement.repository.UserRepository;

@RestController
@RequestMapping("/api/stock")
public class UserDetailsController {
	
//	@GetMapping("/tested") 
// public String getTestString() { 
//	 return "Hello World"; }
// }
//	 
	
	@Autowired
	UserRepository employeeRepository;
	
	List<com.SmartInventoryManagement.entities.UserDetails> UserDetails = new ArrayList<com.SmartInventoryManagement.entities.UserDetails>();

	
	@GetMapping(path="/UserDetails",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<com.SmartInventoryManagement.entities.UserDetails> getEmployees(@RequestHeader("Authorization")String Token) {
		//return employees;
		return employeeRepository.findAll();
	}
	@PostMapping(path="/UserDetails")
	public void addEmployee(@RequestBody com.SmartInventoryManagement.entities.UserDetails e) {
		//employees.add(e);
		employeeRepository.save(e);
	}
	@PatchMapping(path="/UserDetails")
	public void updateEmployeeSalary(@RequestBody com.SmartInventoryManagement.entities.UserDetails employee) {
		Optional<com.SmartInventoryManagement.entities.UserDetails> employeeFound=employeeRepository.findById(employee.getUserid());
		if(employeeFound.isPresent()) {
			com.SmartInventoryManagement.entities.UserDetails e = employeeFound.get();
			e.setEmail(employee.getEmail());
			e.setPassword(employee.getPassword());
			e.setUserid(employee.getUserid());
			e.setUsername(employee.getUsername());
			
			
			employeeRepository.save(e);
}
	}
		@DeleteMapping(path="/UserDetails/{Userid}")
		public void deleteEmployee(@PathVariable int Userid) {
			System.out.println("Id:"+Userid);
			employeeRepository.deleteById(Userid);
}
}