package com.rest.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/course")
	public ResponseEntity<String> getCourse(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {
		String respBody = cname + " by " + tname + " Fee is 7770 RS.";
		return new ResponseEntity<>(respBody, HttpStatus.OK);
	}
}
