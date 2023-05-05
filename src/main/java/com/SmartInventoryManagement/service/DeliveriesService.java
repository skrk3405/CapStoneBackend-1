package com.SmartInventoryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.SmartInventoryManagement.entities.deliveries;
import com.SmartInventoryManagement.repository.DeliveriesRepository;


@Service
public class DeliveriesService {

	@Autowired
	private DeliveriesRepository outwardsRepository;
	
	public List<deliveries> getAllOutwards() {
		return outwardsRepository.findAll();
	}
	
	public Optional<deliveries> getOutwardsById(int Id) {
		return outwardsRepository.findById(Id);
	}
	
	public void addOutwards(deliveries Outwards) {
		outwardsRepository.save(Outwards);
	}
	
	public void updateOutwards(int Id, deliveries outwards) {
		Optional<deliveries> optionalOutwards = outwardsRepository.findById(Id);
		if (optionalOutwards.isPresent()) {
			outwards.setId(Id);
			outwardsRepository.save(outwards);
		}
	}
	
	public void deleteOutwards(int Id) {
		outwardsRepository.deleteById(Id);
	}
}
