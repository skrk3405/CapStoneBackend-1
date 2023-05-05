package com.SmartInventoryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SmartInventoryManagement.entities.GodownInwardsEntity;

import com.SmartInventoryManagement.repository.InwardsRepository;


@Service
public class InwardService {

	@Autowired
	private InwardsRepository inwardsRepository;
	
	public List<GodownInwardsEntity> getAllInwards() {
		return inwardsRepository.findAll();
	}
	
	public Optional<GodownInwardsEntity> getInwardsById(int id) {
		return inwardsRepository.findById(id);
	}
	
	public void addInwards(GodownInwardsEntity inwards) {
		inwardsRepository.save(inwards);
	}
	
	public void updateInwards(int id, GodownInwardsEntity inwards) {
		Optional<GodownInwardsEntity> optionalInwards = inwardsRepository.findById(id);
		if (optionalInwards.isPresent()) {
			inwards.setId(id);
			inwardsRepository.save(inwards);
		}
	}
	
	public void deleteInwards(int id) {
		inwardsRepository.deleteById(id);
	}
}
