package com.everis.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EverisCustomerRepositoryI extends JpaRepository<EverisCustomer, Long> {

	public List<EverisCustomer> findByNameAndSurnames(final String name, final String surnames);
	
}
