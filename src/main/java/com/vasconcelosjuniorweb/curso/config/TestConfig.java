package com.vasconcelosjuniorweb.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vasconcelosjuniorweb.curso.entities.Order;
import com.vasconcelosjuniorweb.curso.entities.User;
import com.vasconcelosjuniorweb.curso.entities.enums.OrderStatus;
import com.vasconcelosjuniorweb.curso.repositories.OrderRepository;
import com.vasconcelosjuniorweb.curso.repositories.UserRepository;



@Configuration  // DEFINE ESPECÍFICO DE CONFIGURAÇÃO
@Profile("test") // ESPECÍFICO DE TESTE
public class TestConfig implements CommandLineRunner{
	
	@Autowired // RESOLVE A DEPENDÊNCIA E ASSOCIA UMA INSTANCIA UserRepository
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888", "123456");
		User u2 = new User(null, "Ariane Green", "ariane@gmail.com", "97777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		
	} 
	
	

}
