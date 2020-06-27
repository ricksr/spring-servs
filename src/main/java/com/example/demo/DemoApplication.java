package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(final String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/default")
	public String hello(@RequestParam(value = "name", defaultValue = "World") final String name) {
		return String.format("Hello %s!", name);
	}

	// Without Params
	@GetMapping("/no-default")
	public String hello2(final String name) {
		return String.format("No default value %s", name);
	}

}
