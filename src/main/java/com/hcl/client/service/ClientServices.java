package com.hcl.client.service;




import java.util.List;


import com.hcl.client.model.Product;

public interface ClientServices {

	public Product createProduct(Product product);
	
	 public Product findProduct(Long productId); 
	 public List<Product> getAllProduct(); 
	 public String deleteProduct(Long productId);
	 
	
}
