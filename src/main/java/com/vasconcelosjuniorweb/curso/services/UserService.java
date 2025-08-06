package com.vasconcelosjuniorweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.vasconcelosjuniorweb.curso.entities.User;
import com.vasconcelosjuniorweb.curso.repositories.ProductRepository;
import com.vasconcelosjuniorweb.curso.repositories.UserRepository;
import com.vasconcelosjuniorweb.curso.services.exceptions.DatabaseException;
import com.vasconcelosjuniorweb.curso.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service // ANOTAÇÃO REGISTRA SERVIÇO COMO COMPONENTE DO SPRING
public class UserService {

	private final ProductRepository productRepository;

	@Autowired // FAZ A INJEÇÃO DE DEPENDENCIA DE FORMA TRANSPARENTE
	private UserRepository repository;

	UserService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	// MÉTODO RETORNA TODOS OS USUÁRIOS DO BANCO
	public List<User> findAll() {
		return repository.findAll();

	}

	// MÉTODO RETORNA TODOS OS USUÁRIOS DO BANCO PELO ID
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));

	}

	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User update(Long id, User obj) {
		try {
			User entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(e.getMessage());
		}

	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}

}
