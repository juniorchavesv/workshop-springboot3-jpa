package com.vasconcelosjuniorweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasconcelosjuniorweb.curso.entities.Product;
import com.vasconcelosjuniorweb.curso.repositories.ProductRepository;


@Service  // ANOTAÇÃO REGISTRA SERVIÇO COMO COMPONENTE DO SPRING
public class ProductService {
	
	@Autowired // FAZ A INJEÇÃO DE DEPENDENCIA DE FORMA TRANSPARENTE
	private ProductRepository repository;
	
	//MÉTODO RETORNA TODOS OS USUÁRIOS DO BANCO
	public List<Product> findAll(){
		return repository.findAll();
		
	}
	
	//MÉTODO RETORNA TODOS OS USUÁRIOS DO BANCO PELO ID
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
	}
}
