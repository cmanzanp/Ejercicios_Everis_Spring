package com.everis.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.spring.repository.EverisBuilding;
import com.everis.spring.repository.EverisPerson;
import com.everis.spring.services.EverisBuildingManagementServiceI;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner{
	
	@Autowired
	private EverisBuildingManagementServiceI buildingService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		EverisBuilding everisBuilding = buildingService.createBuilding("Edificio 1");
		
		EverisPerson person1 = new EverisPerson("Cristian", "Manzano", "Pineda");
		EverisPerson person2 = new EverisPerson("Pepe", "Martínez", "Rodríguez");
		EverisPerson person3 = new EverisPerson("Macarena", "Sánchez", "Ballesteros");
		
		buildingService.addPerson(everisBuilding, person1, 1, 3);
		buildingService.addPerson(everisBuilding, person2, 4, 7);

		buildingService.showPeople(everisBuilding);
		
		buildingService.findPerson(everisBuilding, person1);
		buildingService.findPerson(everisBuilding, person3);
		
	}

}
