package com.hcl.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.client.model.Product;
import com.hcl.client.service.ClientServices;

@RestController
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
public class MicroClientControllers {
	
	@Autowired
	private ClientServices clientService;
	
	@GetMapping("/")
	public String value()
	{ 
		return "Welcome to Hcl";
	}
	
	@PostMapping("/insert")
	public ResponseEntity<Product> create(@RequestBody Product product)
	{System.out.println("The Product Name is  "+product.getpName()+" "+ product.getPrice()+" ");
		return new ResponseEntity<>(clientService.createProduct(product),HttpStatus.OK);
	}

	  @PutMapping("/select/{id}") 
	 public ResponseEntity<Product> select(@PathVariable Long productId) {
		  System.out.println("The Product Id is : "+productId);
		  return new
	             ResponseEntity<>(clientService.findProduct(productId),HttpStatus.OK); 
	  }
	
	  @GetMapping("/selectAll") 
	  public ResponseEntity<List<Product>> selectAll() {
	  return new ResponseEntity<>(clientService.getAllProduct(),HttpStatus.FOUND);
	 }
	  
	/*
	 * @PostMapping("/delete/{id}") public ResponseEntity<String> delete(Long
	 * productId) { return new
	 * ResponseEntity<>(clientService.deleteProduct(productId),HttpStatus.FOUND); }
	 */
	
}
