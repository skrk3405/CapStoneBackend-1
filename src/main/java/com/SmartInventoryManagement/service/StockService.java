package com.SmartInventoryManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.SmartInventoryManagement.entities.products;
import com.SmartInventoryManagement.repository.ProductsRepository;



@Service
public class StockService {

	@Autowired
	private ProductsRepository stockRepository;
	
	public List<products> getAllStocks() {
		return stockRepository.findAll();
	}
	
	public Optional<products> getStockById(int id) {
		return stockRepository.findById(id);
	}
	
	public void addStock(products stock) {
		stockRepository.save(stock);
	}
	
	public void updateStock(int id, products stock) {
		Optional<products> optionalStock = stockRepository.findById(id);
		if (optionalStock.isPresent()) {
			stock.setId(id);
			stockRepository.save(stock);
		}
	}
	
	public void deleteStock(int id) {
		stockRepository.deleteById(id);
	}
}
