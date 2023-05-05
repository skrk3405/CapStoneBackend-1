package com.SmartInventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartInventoryManagement.entities.Returns;


@Repository
public interface ReturnRepository extends JpaRepository<Returns, Integer > {


}
