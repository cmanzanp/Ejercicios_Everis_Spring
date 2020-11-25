package com.everis.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.everis.spring.repository.EverisBuilding;
import com.everis.spring.repository.EverisPerson;

@Service
public class EverisBuildingManagementServiceImpl implements EverisBuildingManagementServiceI {

	@Override
	public EverisBuilding createBuilding(final String buildingId) {
		
		final EverisBuilding everisBuilding = new EverisBuilding();
		everisBuilding.setBuildingId(buildingId);
		
		return everisBuilding;
		
	}
	
	@Override
	public boolean addPerson(EverisBuilding everisBuilding, EverisPerson person, Integer plantaNumber,
			Integer apartmentNumber) {
		
		if (everisBuilding.addPerson(person, plantaNumber, apartmentNumber)) {
			System.out.println("Persona añadida en la planta " + plantaNumber + " y apartamento " + apartmentNumber);
			return true;
		} else {
			System.out.println("No se ha añadido correctamente la persona.");
			return false;
		}
		
	}

	@Override
	public void showPeople(final EverisBuilding everisBuilding) {
		
		List<EverisPerson> listaPersonas = everisBuilding.showPeople();
		
		if (!listaPersonas.isEmpty()) {
			System.out.println("Lista de personas: ");
			
			for (EverisPerson everisPerson : listaPersonas) {
				System.out.println("Nombre: " + everisPerson.getName() + " " + everisPerson.getLast_name_one()
				+ " " + everisPerson.getLast_name_two());
			}
		} else {
			System.out.println("No se encontró ninguna persona en el edificio.");
		}	
		
	}

	@Override
	public boolean findPerson(EverisBuilding everisBuilding, EverisPerson person) {
		
		if(everisBuilding.findPerson(person)) {
			System.out.println("Se encontró la persona con el nombre: " + person.getName()
			+ " " + person.getLast_name_one() + " " + person.getLast_name_two());
		} else {
			System.out.println("No se encontró a la persona.");
		}
		
		return false;
	}







	
	
	
	

}
