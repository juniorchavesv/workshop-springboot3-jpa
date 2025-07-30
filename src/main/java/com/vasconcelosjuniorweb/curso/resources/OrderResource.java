package com.vasconcelosjuniorweb.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasconcelosjuniorweb.curso.entities.Order;
import com.vasconcelosjuniorweb.curso.services.OrderService;

@RestController
@RequestMapping(value = "/orders") // nome do recurso
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	
	@GetMapping // RESPONDE A REQUISIÇÃO GET DO HTTP
	public ResponseEntity<List<Order>> findAll(){ // método retorna usuarios
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	 
	

}
