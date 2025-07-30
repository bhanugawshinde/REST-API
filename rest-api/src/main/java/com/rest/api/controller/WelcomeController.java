package com.rest.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelocme(){
		String respPayload = "Welcome to rest api";
		return new ResponseEntity<>(respPayload, HttpStatus.OK);
	}
}
