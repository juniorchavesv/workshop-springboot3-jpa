package com.vasconcelosjuniorweb.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vasconcelosjuniorweb.curso.entities.User;
import com.vasconcelosjuniorweb.curso.repositories.UserRepository;



@Configuration  // DEFINE ESPECÍFICO DE CONFIGURAÇÃO
@Profile("test") // ESPECÍFICO DE TESTE
public class TestConfig implements CommandLineRunner{
	
	@Autowired // RESOLVE A DEPENDÊNCIA E ASSOCIA UMA INSTANCIA UserRepository
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888", "123456");
		User u2 = new User(null, "Ariane Green", "ariane@gmail.com", "97777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	} 
	
	

}
