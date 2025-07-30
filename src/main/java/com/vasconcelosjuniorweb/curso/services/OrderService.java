package com.vasconcelosjuniorweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasconcelosjuniorweb.curso.entities.Order;
import com.vasconcelosjuniorweb.curso.repositories.OrderRepository;



@Service  // ANOTAÇÃO REGISTRA SERVIÇO COMO COMPONENTE DO SPRING
public class OrderService {
	
	@Autowired // FAZ A INJEÇÃO DE DEPENDENCIA DE FORMA TRANSPARENTE
	private OrderRepository repository;
	
	//MÉTODO RETORNA TODOS OS USUÁRIOS DO BANCO
	public List<Order> findAll(){
		return repository.findAll();
		
	}
	
	//MÉTODO RETORNA TODOS OS USUÁRIOS DO BANCO PELO ID
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}
}
