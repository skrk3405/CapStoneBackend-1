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


import com.SmartInventoryManagement.entities.deliveries;
import com.SmartInventoryManagement.service.DeliveriesService;


@RestController
@RequestMapping("/api/outwards")
public class DeliveriesController {
    @Autowired
    private DeliveriesService outwardService;
    @GetMapping
	public List<deliveries> getAllOutwards() {
		return outwardService.getAllOutwards();
	}
	
	@GetMapping("/{outward_Id}")
	public ResponseEntity<deliveries> getOutwardsById(@PathVariable int outward_Id) {
		Optional<deliveries> optionalOutwards = outwardService.getOutwardsById(outward_Id);
		if (optionalOutwards.isPresent()) {
			return new ResponseEntity<>(optionalOutwards.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public void addOutwards(@RequestBody deliveries outwards) {
		outwardService.addOutwards(outwards);
	}
	
	@PutMapping("/{outward_Id}")
	public void updateOutwards(@PathVariable int outward_Id, @RequestBody deliveries outwards) {
		outwardService.updateOutwards(outward_Id, outwards);
	}
	
	@DeleteMapping("/{outward_Id}")
	public void deleteOutwards(@PathVariable int outward_Id) {
		outwardService.deleteOutwards(outward_Id);
	}
}