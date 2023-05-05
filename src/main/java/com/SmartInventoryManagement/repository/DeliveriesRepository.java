package com.SmartInventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartInventoryManagement.entities.deliveries;


@Repository
public interface DeliveriesRepository extends JpaRepository<deliveries, Integer > {


}
