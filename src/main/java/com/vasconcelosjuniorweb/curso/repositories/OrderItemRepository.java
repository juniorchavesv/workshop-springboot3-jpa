package com.vasconcelosjuniorweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vasconcelosjuniorweb.curso.entities.OrderItem;

// INSTANCIA UM OBJETO REPOSITORY
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
