package com.hcl.client.service;




import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.client.model.Product;

@Service
public interface ClientServices {

	public Product createProduct(Product product);
	
	 public Product findProduct(Long productId); 
	 public List<Product> getAllProduct(); 
	 public String deleteProduct(Long productId);
	 
	
}
