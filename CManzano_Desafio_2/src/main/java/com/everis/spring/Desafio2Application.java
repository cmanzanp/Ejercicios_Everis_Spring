package com.everis.spring;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.spring.repository.EverisOrder;
import com.everis.spring.repository.EverisProduct;
import com.everis.spring.services.everisOrderManagementServiceI;

@SpringBootApplication
public class Desafio2Application implements CommandLineRunner {
	
	@Autowired
	@Qualifier("peninsula")
	everisOrderManagementServiceI everisOrderPeninsula;
	
	@Autowired
	@Qualifier("noPeninsula")
	everisOrderManagementServiceI everisOrderNoPeninsula;

	public static void main(String[] args) {
		SpringApplication.run(Desafio2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/** Inserto un salto de línea para que se vea más claro la ejecución del código en la consola */
		System.out.println();

		EverisOrder order_1 = everisOrderPeninsula.createOrder("S01", "Calle Diamante, 47", "Cristian Manzano Pineda");
		EverisOrder order_2 = everisOrderNoPeninsula.createOrder("S02", "Calle Rubí, 80", "Javier Carande Cabeza");
		
		EverisProduct product_1 = new EverisProduct("P01", "Ordenador DELL", 500);
		EverisProduct product_2 = new EverisProduct("P02", "Ordenador Huawei", 650);
		
		everisOrderPeninsula.addProduct(order_1, product_1);
		everisOrderPeninsula.addProduct(order_1, product_2);
		everisOrderPeninsula.showOrder(order_1);
		
		everisOrderNoPeninsula.addProduct(order_2, product_1);
		everisOrderNoPeninsula.addProduct(order_2, product_2);
		everisOrderNoPeninsula.showOrder(order_2);
		
	}

}
