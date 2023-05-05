package com.SmartInventoryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.SmartInventoryManagement.entities.Returns;
import com.SmartInventoryManagement.repository.ReturnRepository;


@Service
public class ReturnService {

	@Autowired
	private ReturnRepository returnRepository;
	
	public List<Returns> getAllReturns() {
		return returnRepository.findAll();
	}
	
	public Optional<Returns> getReturnById(int Id) {
		return returnRepository.findById(Id);
	}
	
	public void addReturns(Returns returns) {
		returnRepository.save(returns);
	}
	
	public void updateReturns(int Id, Returns returns) {
		Optional<Returns> optionalReturn = returnRepository.findById(Id);
		if (optionalReturn.isPresent()) {
			returns.setId(Id);
			returnRepository.save(returns);
		}
	}
	
	public void deleteReturns(int Id) {
		returnRepository.deleteById(Id);
	}
}
