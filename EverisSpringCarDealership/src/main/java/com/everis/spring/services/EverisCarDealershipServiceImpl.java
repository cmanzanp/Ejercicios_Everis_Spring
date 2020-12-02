package com.everis.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.spring.repository.EverisCar;
import com.everis.spring.repository.EverisCarRepositoryI;

/**
 * Servicio: gestión de vehículos.
 * 
 * @author Everis
 *
 */
@Service
public class EverisCarDealershipServiceImpl implements EverisCarDealershipServiceI {

	/** Repositorio: TCD_EVERIS_CAR */
	@Autowired
	private EverisCarRepositoryI carRepository;

	@Override
	public List<EverisCar> getAllCars() {
		return carRepository.findAll();
	}

	@Override
	public EverisCar getCarByRegistration(final String carRegistration) {

		// Obtención de resultado.
		final EverisCar car = carRepository.findByCarRegistration(carRegistration);

		return car;
	}

	@Override
	public List<EverisCar> getCarByBrandAndModel(final String brand, final String model) {
		return carRepository.findByBrandAndModel(brand, model);
	}

	@Override
	public void removeCarById(final Long carId) {
		carRepository.deleteById(carId);
	}

	@Override
	public void addCar(final EverisCar car) {
		carRepository.save(car);
	}

	@Override
	public void updCar(final EverisCar car) {
		carRepository.save(car);
	}

}
