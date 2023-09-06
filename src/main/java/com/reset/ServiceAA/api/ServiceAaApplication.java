package com.reset.ServiceAA.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/serviceAA")
@SpringBootApplication
public class ServiceAaApplication {

	@GetMapping("/dataAA")
	public ResponseEntity<String> getDataFromAA(){
		return ResponseEntity.ok("Hello from ServiceAA.");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceAaApplication.class, args);
	}

}
