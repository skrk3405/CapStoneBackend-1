package com.SmartInventoryManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartInventoryManagement.entities.UserDetails;


@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {
	
	Optional<UserDetails> findByEmail(String email);

}
