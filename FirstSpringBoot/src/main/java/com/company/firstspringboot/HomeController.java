package com.company.firstspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/")
	public static String welcome() {

		return "Welcome to Spring Boot";
	}
}