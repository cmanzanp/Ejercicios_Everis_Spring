package com.everis.spring.repository;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TCD_EVERIS_CUSTOMER")
public class EverisCustomer implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private long customerId;
	
	private String name;
	
	private String surnames;
	
	private String birthDate;
	
	private String documentId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "SURNAMES", nullable = false)
	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	
	@Column(name = "BIRTHDATE", nullable = false)
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "DOCUMENT_ID", nullable = false, unique = true)
	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	@Override
	public String toString() {
		return "EverisCustomer [customerId=" + customerId + ", name=" + name + ", surnames=" + surnames + ", birthDate="
				+ birthDate + ", documentId=" + documentId + "]";
	}

}
