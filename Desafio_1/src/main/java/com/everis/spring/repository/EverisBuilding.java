package com.everis.spring.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public class EverisBuilding implements Serializable {
	
	private EverisPerson[][] personas = new EverisPerson[10][10];
	
	private String buildingId;
	
	public boolean addPerson(final EverisPerson person, final Integer plantaNumber, final Integer apartmentNumber) {
		
		boolean addResult = Boolean.TRUE;
		
		if (person != null && plantaNumber != null && apartmentNumber != null) {
			// Insercción de persona
			personas[plantaNumber][apartmentNumber] = person;
		} else {
			addResult = Boolean.FALSE;
		}

		return addResult;
		
	}
	
	public List<EverisPerson> showPeople() {
		
		List<EverisPerson> listaPersonas = new ArrayList<EverisPerson>();
		
		for (int i = 0; i < personas.length; i++) {
			for (int j = 0; j < personas[i].length; j++) {
				
				if (personas[i][j] != null) {
					listaPersonas.add(personas[i][j]);
				}
				
			}
		}
		
		return listaPersonas;
		
	}
	
	public boolean findPerson(EverisPerson person) {
		
		for (int i = 0; i < personas.length; i++) {
			for (int j = 0; j < personas[i].length; j++) {
				
				if (person == personas[i][j]) {
					return true;
				}
				
			}
		}
		
		return false;
		
		
	}

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
	
	
	

}
