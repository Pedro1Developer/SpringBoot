package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String helloSpringBoot() {
		return "Olá Spring Boot";
	}
	
	@GetMapping("/barra")
	public String testeBarra() {
		return "Teste concluido";
	}

}
