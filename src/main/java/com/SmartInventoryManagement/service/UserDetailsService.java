/*package com.SmartInventoryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.SmartInventoryManagement.entities.EmployeeEntity;
import com.SmartInventoryManagement.entities.UserDetails;
import com.SmartInventoryManagement.repository.EmployeeRepository;
import com.SmartInventoryManagement.repository.UserRepository;

@Service
public class UserDetailsService {
	@Autowired
	UserRepository UserDetailsRepository;
	

	//RestTemplate restTemplate;

	public List<UserDetails> getAll() {
		return UserDetailsRepository.findAll();

	}

	public UserDetails isTokenValid(String jwtToken) {

		HttpHeaders headers = new HttpHeaders();

		headers.set("Authorization", jwtToken);

		HttpEntity entity = new HttpEntity(headers);

		try {

			ResponseEntity<UserDetails> result = this.restTemplate.exchange(

					"http://localhost:8001/pm/user-management/token/validate", HttpMethod.GET, entity,
					UserDetails.class);

			return result.getBody();

		} catch (Exception e) {

			return new UserDetails();

		}

	}

}*/
