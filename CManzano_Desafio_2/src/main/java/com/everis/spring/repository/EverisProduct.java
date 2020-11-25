package com.everis.spring.repository;

import java.io.Serializable;

public class EverisProduct implements Serializable {

	/** Serial */
	private static final long serialVersionUID = 1L;
	
	/** Identificador del producto */
	private String everisProductId;
	
	/** Nombre del producto */
	private String productName;
	
	/** Precio PVP del producto */
	private double productPricePVP;
	
	/** Precio del producto sin impuestos */
	private double productPriceNoTaxes;
	
	public EverisProduct(String everisProductId, String productName, double productPriceNoTaxes) {
		this.everisProductId = everisProductId;
		this.productName = productName;
		this.productPriceNoTaxes = productPriceNoTaxes;
	}

	public String getEverisProductId() {
		return everisProductId;
	}

	public void setEverisProductId(String everisProductId) {
		this.everisProductId = everisProductId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPricePVP() {
		return productPricePVP;
	}

	public void setProductPricePVP(double productPricePVP) {
		this.productPricePVP = productPricePVP;
	}

	public double getProductPriceNoTaxes() {
		return productPriceNoTaxes;
	}

	public void setProductPriceNoTaxes(double productPriceNoTaxes) {
		this.productPriceNoTaxes = productPriceNoTaxes;
	}

	@Override
	public String toString() {
		return "EverisProduct [everisProductId=" + everisProductId + ", productName=" + productName
				+ ", productPricePVP=" + productPricePVP + ", productPriceNoTaxes=" + productPriceNoTaxes + "]";
	}
	
	
}
