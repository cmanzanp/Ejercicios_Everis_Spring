package com.everis.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EverisCarRepositoryI extends JpaRepository<EverisCar, Long> {

	/**
	 * Obtiene un vehículo por matrículo
	 * 
	 * @param carRegistration
	 * @return EverisCar
	 */
	public EverisCar findByCarRegistration(final String carRegistration);

	/**
	 * Obtiene un vehículo por marca y modelo.
	 * 
	 * @param brand
	 * @param model
	 * @return List<EverisCar>
	 */
	public List<EverisCar> findByBrandAndModel(final String brand, final String model);

}
