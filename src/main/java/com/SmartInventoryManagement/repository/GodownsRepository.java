package com.SmartInventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartInventoryManagement.entities.Godowns;


@Repository
public interface GodownsRepository extends JpaRepository<Godowns, Integer > {


}
