package com.everis.spring.services;

import com.everis.spring.repository.EverisOrder;
import com.everis.spring.repository.EverisProduct;

public interface everisOrderManagementServiceI {
	
	public EverisOrder createOrder(final String everisOrderId, final String deliveryAddress, final String addressee);
	
	public void addProduct(final EverisOrder order, final EverisProduct product);
	
	public void showOrder(final EverisOrder order);

}