package com.nt.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/get")
	public String helloApi() {
		return "hello this is for docker practice";
	}

}
