package com.everis.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;

import com.everis.spring.repository.EverisCar;
import com.everis.spring.services.EverisCarDealershipServiceI;

@SpringBootApplication
public class EverisCarDealershipMain implements CommandLineRunner {

	@Autowired
	private EverisCarDealershipServiceI carDealerService;

	/**
	 * MAIN
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EverisCarDealershipMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Creación de coches.
		EverisCar car1 = new EverisCar();
		car1.setCarRegistration("1234 ABC");
		car1.setBrand("Seat");
		car1.setModel("Ibiza");

		EverisCar car2 = new EverisCar();
		car2.setCarRegistration("6996 ZYW");
		car2.setBrand("Mercedes");
		car2.setModel("Benz");

		EverisCar car3 = new EverisCar();
		car3.setCarRegistration("9999 ZZZ");
		car3.setBrand("Renault");
		car3.setModel("Clio");

		EverisCar car4 = new EverisCar();
		car4.setCarRegistration("1144 ZZZ");
		car4.setBrand("Renault");
		car4.setModel("Clio");
		
		carDealerService.addCar(car1);
		carDealerService.addCar(car2);
		carDealerService.addCar(car3);
		carDealerService.addCar(car4);

		System.out.println("------------");

		// Obtención e iteración de elementos.
		final List<EverisCar> everisCarList = carDealerService.getAllCars();
		if (!CollectionUtils.isEmpty(everisCarList)) {
			for (EverisCar car : everisCarList) {
				System.out.println(car.toString());
			}
		}

		System.out.println("------------");

		// Obtención e iteración de elementos.
		final List<EverisCar> everisCarByBaM = carDealerService.getCarByBrandAndModel("Renault", "Clio");
		if (!CollectionUtils.isEmpty(everisCarByBaM)) {
			for (EverisCar car : everisCarByBaM) {
				System.out.println(car.toString());
			}
		}

		System.out.println("------------");

		// Búsqueda por matrícula.
		final EverisCar everisCarByR = carDealerService.getCarByRegistration("6996 ZYW");
		System.out.println(everisCarByR.toString());
		carDealerService.removeCarById(everisCarByR.getCarId());
		
		EverisCar car5 = new EverisCar();
		car5.setCarRegistration("0000 AAA");
		car5.setBrand("Opel");
		car5.setModel("Astra");
		
		carDealerService.addCar(car5);
		
	}

}
