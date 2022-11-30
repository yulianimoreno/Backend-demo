package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping(value = "/carranza")
	public String demo() {
		return "Testing digital ocean from Carranza city";
	}

}
