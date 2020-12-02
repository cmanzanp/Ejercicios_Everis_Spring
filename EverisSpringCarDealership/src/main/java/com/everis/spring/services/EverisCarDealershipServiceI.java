package com.everis.spring.services;

import java.util.List;

import com.everis.spring.repository.EverisCar;

/**
 * Servicio: gestión de vehículos.
 * 
 * @author Everis
 *
 */
public interface EverisCarDealershipServiceI {

	/**
	 * Obtiene el listado de vehículos.
	 * 
	 * @return List<EverisCar>
	 */
	public List<EverisCar> getAllCars();

	/**
	 * Obtiene un vehículo por matrícula.
	 * 
	 * @param carRegistration
	 * @return EverisCar
	 */
	public EverisCar getCarByRegistration(final String carRegistration);

	/**
	 * Obtiene un vehículo por marca y modelo.
	 * 
	 * @param brand
	 * @param model
	 * @return List<EverisCar>
	 */
	public List<EverisCar> getCarByBrandAndModel(final String brand, final String model);

	/**
	 * Elimina un vehículo por ID.
	 * 
	 * @param carId
	 */
	public void removeCarById(final Long carId);

	/**
	 * Añade un vehículo.
	 * 
	 * @param car
	 */
	public void addCar(final EverisCar car);

	/**
	 * Actualiza un vehículo.
	 * 
	 * @param car
	 */
	public void updCar(final EverisCar car);

}
