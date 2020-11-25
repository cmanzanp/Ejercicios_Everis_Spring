package com.everis.spring.services;

import org.springframework.stereotype.Service;

import com.everis.spring.repository.EverisBuilding;
import com.everis.spring.repository.EverisPerson;

public interface EverisBuildingManagementServiceI {
	
	public EverisBuilding createBuilding(final String buildingId);
	
	public boolean addPerson(final EverisBuilding everisBuilding, final EverisPerson person, final Integer plantaNumber, final Integer apartmentNumber);
	
	public void showPeople(final EverisBuilding everisBuilding);
	
	public boolean findPerson(final EverisBuilding everisBuilding, EverisPerson person);

}
