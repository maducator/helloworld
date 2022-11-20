package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

	@GetMapping("hello")
	String hello(@RequestParam(defaultValue="world") String hello) {
		return "Hello " + hello + "!";
	}
}
