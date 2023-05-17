package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String get() {
		return "get Spring Boot";
	}

	@GetMapping("/login/{login}/senha/{senha}")
	public String login(@PathVariable("login") String login, @PathVariable("senha") String senha) {
		return "Login: " + login + " Senha: " + senha;
	}
	
	@GetMapping("/carro/{id}")
	public String carrosById(@PathVariable("id") Long id) {
		return ("Carro " + id);
	}
	
	@GetMapping("/carro/tipo/{tipo}")
	public String carroByTipo(@PathVariable("tipo") String tipo) {
		return("Lista de carros " + tipo);
	}

}
