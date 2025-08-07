package com.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rest.api.controller.BookController;
import com.rest.api.restTemplate.RestTemplateCode;
import com.rest.api.services.BookClient;
import com.rest.api.webClient.WebClientCode;

@SpringBootApplication
public class RestApiApplication {

    private final BookController bookController;
	

    RestApiApplication(BookController bookController) {
        this.bookController = bookController;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
		WebClientCode webClientCode = new WebClientCode();
		RestTemplateCode restTemplateCode = new RestTemplateCode();
		
	}

}
