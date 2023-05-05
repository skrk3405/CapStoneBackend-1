package com.SmartInventoryManagement.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SmartInventoryManagement.entities.Godowns;
import com.SmartInventoryManagement.service.GodownService;


@RestController
@RequestMapping("/api/godowns")
public class GodownsController {
    @Autowired
    private GodownService godownsService;

    @GetMapping
	public List<Godowns> getAllGodowns() {
		return godownsService.getAllGodowns();
	}
	
	@GetMapping("/{godown_Id}")
	public ResponseEntity<Godowns> getGodownsById(@PathVariable int Id) {
		Optional<Godowns> optionalGodowns = godownsService.getGodownsById(Id);
		if (optionalGodowns.isPresent()) {
			return new ResponseEntity<>(optionalGodowns.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public void addGodowns(@RequestBody Godowns godowns) {
		godownsService.addGodowns(godowns);
	}
	
	//@PutMapping("/{godown_Id}")
	//public void updateGodowns1(@PathVariable int godown_Id, @RequestBody Godowns godowns) {
	//	godownsService.updateGodowns(godown_Id, godowns);
	//}
	
	@PatchMapping("/{Id}")
	public void updateGodowns(@PathVariable int Id, @RequestBody Godowns godowns) {
		godownsService.updateGodowns(Id, godowns);
	}
	
	@DeleteMapping("/{Id}")
	public void deleteGodowns(@PathVariable int Id) {
		godownsService.deleteGodowns(Id);
	}
}
