package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String get() {
		return "get Spring Boot";
	}
	
	@GetMapping("/login")
	public String login(@RequestParam String login, @RequestParam String senha) {
		return "Login: " + login + " Senha: " + senha;
	}
	
	
}
