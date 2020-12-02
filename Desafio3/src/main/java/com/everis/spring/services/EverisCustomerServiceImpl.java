package com.everis.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.spring.repository.EverisCustomer;
import com.everis.spring.repository.EverisCustomerRepositoryI;

@Service
public class EverisCustomerServiceImpl implements EverisCustomerServiceI {

	@Autowired
	private EverisCustomerRepositoryI customerRepository;
	
	@Override
	public List<EverisCustomer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public List<EverisCustomer> getCustomerByNameAndSurnames(final String name, String surnames) {
		return customerRepository.findByNameAndSurnames(name, surnames);
	}

	@Override
	public void removeCustomerById(Long customerId) {
		customerRepository.deleteById(customerId);
	}

	@Override
	public void addCustomer(EverisCustomer customer) {
		customerRepository.save(customer);		
	}

	@Override
	public void updCustomer(EverisCustomer customer) {
		customerRepository.save(customer);
	}

}
