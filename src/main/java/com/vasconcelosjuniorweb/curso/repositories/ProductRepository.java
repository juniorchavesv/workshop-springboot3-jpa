package com.vasconcelosjuniorweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasconcelosjuniorweb.curso.entities.Product;

// INSTANCIA UM OBJETO CATEGORY
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
