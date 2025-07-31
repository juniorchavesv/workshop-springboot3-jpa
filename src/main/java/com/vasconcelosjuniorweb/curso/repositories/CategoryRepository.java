package com.vasconcelosjuniorweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasconcelosjuniorweb.curso.entities.Category;

// INSTANCIA UM OBJETO PRODUCT
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
