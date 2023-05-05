package com.SmartInventoryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SmartInventoryManagement.entities.products;


@Repository
public interface ProductsRepository extends JpaRepository<products, Integer > {


}
