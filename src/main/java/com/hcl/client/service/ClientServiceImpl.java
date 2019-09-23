package com.hcl.client.service;


import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hcl.client.model.Product;
import com.hcl.client.repository.ClientRepositorys;


@Service
public class ClientServiceImpl implements ClientServices {
   
	@Autowired
	private ClientRepositorys clientRepository;
    
	@Autowired
     private RestTemplate restTemplate;
	
	@Bean
	private RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
	@Override
	public Product createProduct(Product product) {
		
		String url1="http://localhost:7118/createProduct";
		HttpEntity<Product> entity= new HttpEntity<Product>(product);
      
       Product p= getRestTemplate().postForObject(url1, entity,Product.class);	
		return clientRepository.save(p);
	}

	

	  @Override 
	  public Product findProduct(Long productId) { // TODO Auto-generated
	
		  String url1="http://localhost:7118/getAllProduct";
			
	      
	       Product p=  this.restTemplate.getForObject(url1,Product.class);	
		  
		  return p; }
	  
	  @Override public List<Product> getAllProduct() {
		  String url1="http://localhost:7118/getAllProduct";
		
	      
	       Product p=  this.restTemplate.getForObject(url1,Product.class);	
		  
	  return  null; 
	  }
	  
	  @Override public String deleteProduct(Long productId) { // TODO
	   return null; }
	 

}
