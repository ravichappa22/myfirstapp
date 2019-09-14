package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyReactRestController {
	
	@GetMapping("/hello/{name}")
	public String sampleName(@PathVariable String name) {
		return "Hello "+name;
	}

}
