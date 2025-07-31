package com.rest.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.been.Product;

@RestController
public class ProductRestController {

	@GetMapping(
			value = "/product",
			produces = {
				"application/json",
				"application/xml"
			}
	)
	public ResponseEntity<Product> getProduct(){
		Product p = new Product(1, "name", 400);
		return new ResponseEntity<>(p, HttpStatus.OK);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getproducts(){
		Product p1 = new Product(1, "p1", 10);
		Product p2 = new Product(2, "p2", 20);
		Product p3 = new Product(3, "p3", 30);
		
		return new ResponseEntity<>(List.of(p1,p2,p3), HttpStatus.OK);
	}
	
	@PostMapping(
			value = "/product",
			consumes = {"application/json",
					"application/xml"}
			)
	public ResponseEntity<String> postProduct(@RequestBody Product product){
		System.out.println(product);
		//logic to store product in db.
		String respPayload = "Product stored..";
		return new ResponseEntity<String>(respPayload,HttpStatus.OK);
	}
	
}
