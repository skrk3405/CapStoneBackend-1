package com.SmartInventoryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SmartInventoryManagement.entities.Godowns;
import com.SmartInventoryManagement.repository.GodownsRepository;

import ch.qos.logback.core.net.SyslogOutputStream;


@Service
public class GodownService {

	@Autowired
	private GodownsRepository godownsRepository;
	
	public List<Godowns> getAllGodowns() {
		return godownsRepository.findAll();
	}
	
	public Optional<Godowns> getGodownsById(int godownId) {
		return godownsRepository.findById(godownId);
	}
	
	public void addGodowns(Godowns godowns) {
		try {
			godownsRepository.save(godowns);
		} catch (Exception e) {
				System.out.print(e);
		}
	
	}
	
	public void updateGodowns(int godownId, Godowns godowns) {
		Optional<Godowns> optionalGodowns = godownsRepository.findById(godownId);
		if (optionalGodowns.isPresent()) {
			godowns.setGodownid(godownId);
			godownsRepository.save(godowns);
		}
	}
	
	public void deleteGodowns(int godownId) {
		godownsRepository.deleteById(godownId);
	}
}
