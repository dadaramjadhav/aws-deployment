package com.accenture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSController {
	
	@GetMapping(value = {"/", "/home", "/welcome", "/index" })
	public String welcome() {
		return "welcome to aws deployment";
	}
}
