package com.SmartInventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartInventoryManagement.entities.UserDetails;


@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {

}
