package com.vasconcelosjuniorweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasconcelosjuniorweb.curso.entities.Category;
import com.vasconcelosjuniorweb.curso.repositories.CategoryRepository;


@Service  // ANOTAÇÃO REGISTRA SERVIÇO COMO COMPONENTE DO SPRING
public class CategoryService {
	
	@Autowired // FAZ A INJEÇÃO DE DEPENDENCIA DE FORMA TRANSPARENTE
	private CategoryRepository repository;
	
	//MÉTODO RETORNA TODOS OS USUÁRIOS DO BANCO
	public List<Category> findAll(){
		return repository.findAll();
		
	}
	
	//MÉTODO RETORNA TODOS OS USUÁRIOS DO BANCO PELO ID
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}
}
