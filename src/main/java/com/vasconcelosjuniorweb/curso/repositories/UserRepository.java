package com.vasconcelosjuniorweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasconcelosjuniorweb.curso.entities.User;

// INSTANCIA UM OBJETO REPOSITORY
public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
