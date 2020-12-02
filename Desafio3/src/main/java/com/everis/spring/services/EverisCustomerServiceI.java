package com.everis.spring.services;

import java.util.List;

import com.everis.spring.repository.EverisCustomer;

public interface EverisCustomerServiceI {

	public List<EverisCustomer> getAllCustomers();
	
	public List<EverisCustomer> getCustomerByNameAndSurnames(final String name, final String surnames);
	
	public void removeCustomerById(final Long customerId);
	
	public void addCustomer(final EverisCustomer customer);
	
	public void updCustomer(final EverisCustomer customer);
	
}
