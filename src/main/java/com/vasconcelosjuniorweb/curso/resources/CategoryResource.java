package com.vasconcelosjuniorweb.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasconcelosjuniorweb.curso.entities.Category;
import com.vasconcelosjuniorweb.curso.services.CategoryService;

@RestController
@RequestMapping(value = "/categories") // nome do recurso
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	
	@GetMapping // RESPONDE A REQUISIÇÃO GET DO HTTP
	public ResponseEntity<List<Category>> findAll(){ // método retorna usuarios
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	 
	

}
