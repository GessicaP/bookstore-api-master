package com.gessica.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gessica.bookstore.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public void instanciaBaseDeDados() throws Exception {
		
		System.out.println("aqui");
		this.dbService.instanciaBaseDeDados();
	}

}
