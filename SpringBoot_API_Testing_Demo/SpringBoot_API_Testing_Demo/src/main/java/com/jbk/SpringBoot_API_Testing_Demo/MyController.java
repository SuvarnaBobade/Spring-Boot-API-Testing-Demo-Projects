package com.jbk.SpringBoot_API_Testing_Demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Amazon")
public class MyController {
	@GetMapping("/electronics")
	public String Electronics() {
		return "It is the Electronics Section......!";
		
	}
	@PutMapping("/clothing")
	public String Clothing() {
		return "It is the Clothing Section......!";
		
	}
	@PostMapping("/books")
	public String Books() {
		return "It is the Books Section......!";
		
	}
	@DeleteMapping("/child")
	public String Child() {
		return "It is the Child Section......!";
		
	}

}
