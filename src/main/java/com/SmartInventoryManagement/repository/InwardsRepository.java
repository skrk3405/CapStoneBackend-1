package com.SmartInventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartInventoryManagement.entities.GodownInwardsEntity;

@Repository
public interface InwardsRepository extends JpaRepository<GodownInwardsEntity, Integer > {


}
