package com.SmartInventoryManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SmartInventoryManagement.entities.GodownInwardsEntity;
import com.SmartInventoryManagement.service.InwardService;


@RestController
@RequestMapping("/api/inwards")
public class InwardsController {
    @Autowired
    private InwardService inwardservice;
    
    @GetMapping
	public List<GodownInwardsEntity> getAllInwards() {
		return inwardservice.getAllInwards();
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<GodownInwardsEntity> getInwardsById(@PathVariable int Id) {
		Optional<GodownInwardsEntity> optionalInwards = inwardservice.getInwardsById(Id);
		if (optionalInwards.isPresent()) {
			return new ResponseEntity<>(optionalInwards.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public void addInwards(@RequestBody GodownInwardsEntity inwards) {
		inwardservice.addInwards(inwards);
	}
	
	@PutMapping("/{Id}")
	public void updateInwards(@PathVariable int Id, @RequestBody GodownInwardsEntity inwards) {
		inwardservice.updateInwards(Id, inwards);
	}
	
	@DeleteMapping("/{Id}")
	public void deleteInwards(@PathVariable int Id) {
		inwardservice.deleteInwards(Id);
	}
}