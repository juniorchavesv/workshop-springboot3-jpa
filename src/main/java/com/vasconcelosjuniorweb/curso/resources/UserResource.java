package com.vasconcelosjuniorweb.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasconcelosjuniorweb.curso.entities.User;

@RestController
@RequestMapping(value = "/users") // nome do recurso

public class UserResource {
	
	// Método endpoint para acessar usuários
	
	
	@GetMapping // RESPONDE A REQUISIÇÃO GET DO HTTP
	public ResponseEntity<User> findAll(){ // método retorna usuarios
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345" );
		return ResponseEntity.ok().body(u);
	}
	

}
