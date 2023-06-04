package com.amigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication
@ComponentScan(basePackages = "amigo")
@Configuration
@EnableAutoConfiguration
@RestController
public class AmigosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosApplication.class, args);
		
	}
	@GetMapping("/greet")
	public GreetResponse greet(){
		
		return new GreetResponse("Hello world");

	}
	record GreetResponse(String greet){}


}
