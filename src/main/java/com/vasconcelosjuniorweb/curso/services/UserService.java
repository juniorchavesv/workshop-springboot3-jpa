package com.vasconcelosjuniorweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasconcelosjuniorweb.curso.entities.User;
import com.vasconcelosjuniorweb.curso.repositories.UserRepository;


@Service  // ANOTAÇÃO REGISTRA SERVIÇO COMO COMPONENTE DO SPRING
public class UserService {
	
	@Autowired // FAZ A INJEÇÃO DE DEPENDENCIA DE FORMA TRANSPARENTE
	private UserRepository repository;
	
	//MÉTODO RETORNA TODOS OS USUÁRIOS DO BANCO
	public List<User> findAll(){
		return repository.findAll();
		
	}
	
	//MÉTODO RETORNA TODOS OS USUÁRIOS DO BANCO PELO ID
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
}
