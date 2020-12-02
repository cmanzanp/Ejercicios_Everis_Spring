package com.everis.spring;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.spring.repository.EverisCustomer;
import com.everis.spring.services.EverisCustomerServiceI;

@SpringBootApplication
public class Desafio3Application implements CommandLineRunner {
	
	@Autowired
	private EverisCustomerServiceI customerService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		EverisCustomer everisCustomer1 = new EverisCustomer();
		everisCustomer1.setName("Cristian");
		everisCustomer1.setSurnames("Manzano Pineda");
		everisCustomer1.setBirthDate("1998-01-28");
		everisCustomer1.setDocumentId("12345678D");
		
		EverisCustomer everisCustomer2 = new EverisCustomer();
		everisCustomer2.setName("Antonio");
		everisCustomer2.setSurnames("Pérez Rodríguez");
		everisCustomer2.setBirthDate("2000-05-20");
		everisCustomer2.setDocumentId("12345678A");
		
		customerService.addCustomer(everisCustomer1);
		customerService.addCustomer(everisCustomer2);
		
		System.out.println();
		System.out.println(customerService.getAllCustomers());
		System.out.println(customerService.getCustomerByNameAndSurnames("Cristian","Manzano Pineda"));
		
		everisCustomer1.setName("Paco");
		customerService.updCustomer(everisCustomer1);
		
		System.out.println(customerService.getAllCustomers());
		
	}

}
