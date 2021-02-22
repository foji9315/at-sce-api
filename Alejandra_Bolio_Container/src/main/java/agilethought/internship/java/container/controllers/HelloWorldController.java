package agilethought.internship.java.container.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "message", defaultValue = " this is my first spring boot application") String message) {
	return String.format("Hello, %s!", message);
	}
}
