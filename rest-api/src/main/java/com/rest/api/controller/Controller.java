package com.rest.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/course")
	public ResponseEntity<String> getCourse(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {
		String respBody = cname + " by " + tname + " Fee is 7770 RS.";
		return new ResponseEntity<>(respBody, HttpStatus.OK);
	}
	
	@GetMapping("/book/{bname}")
	public ResponseEntity<String> getBookPrice(@PathVariable String bname){
		String respBody = bname + " price is 400 RS.";
		return new ResponseEntity<>(respBody, HttpStatus.OK);
	}
	
	@GetMapping("/book/name/{bname}/tname/{tname}")
	public ResponseEntity<String> getBook(@PathVariable("bname") String bookName, @PathVariable("tname") String trainerName){
		String respBody = bookName + " by " + trainerName + " is out of stock.";
		return new ResponseEntity<String>(respBody, HttpStatus.OK);
	}
}
