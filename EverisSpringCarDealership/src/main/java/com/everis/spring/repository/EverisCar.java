package com.everis.spring.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tabla: TCD_EVERIS_CAR.
 * 
 * @author Everis
 *
 */
@Entity
@Table(name = "TCD_EVERIS_CAR")
public class EverisCar implements Serializable {

	/** SERIAL ID */
	private static final long serialVersionUID = 1L;

	/** Identificador del vehículo (PK) */
	private Long carId;

	/** Matrícula del vehículo */
	private String carRegistration;

	/** Marca del vehículo */
	private String brand;

	/** Modelo del vehículo */
	private String model;

	/**
	 * @return the carId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCarId() {
		return carId;
	}

	/**
	 * @param carId
	 *            the carId to set
	 */
	public void setCarId(Long carId) {
		this.carId = carId;
	}

	/**
	 * @return the carRegistration
	 */
	@Column(name = "REGISTRATION", nullable = false, unique = true)
	public String getCarRegistration() {
		return carRegistration;
	}

	/**
	 * @param carRegistration
	 *            the carRegistration to set
	 */
	public void setCarRegistration(String carRegistration) {
		this.carRegistration = carRegistration;
	}

	/**
	 * @return the brand
	 */
	@Column(name = "BRAND", nullable = false)
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	@Column(name = "MODEL", nullable = false)
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "EverisCar [carId=" + carId + ", carRegistration=" + carRegistration + ", brand=" + brand + ", model=" + model + "]";
	}

}
