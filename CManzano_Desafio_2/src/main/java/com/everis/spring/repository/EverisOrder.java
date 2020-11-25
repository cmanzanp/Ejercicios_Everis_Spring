package com.everis.spring.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EverisOrder implements Serializable {
	
	/** SERIAL */
	private static final long serialVersionUID = 1L;
	
	/** Identificador del pedido */
	private String everisOrderId;
	
	/** Dirección de entrega del pedido */
	private String deliveryAddress;
	
	/** Destinatario del pedido */
	private String addressee;
	
	/** Indicador de si la entrega es a Melilla, Ceuta o Canarias */
	private Boolean exceptionalAddress;
	
	/** Lista de productos que se encuentran en un pedido */
	private List<EverisProduct> productsList = new ArrayList<EverisProduct>();

	public String getEverisOrderId() {
		return everisOrderId;
	}

	public void setEverisOrderId(String everisOrderId) {
		this.everisOrderId = everisOrderId;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getAddressee() {
		return addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	public Boolean getExceptionalAddress() {
		return exceptionalAddress;
	}

	public void setExceptionalAddress(Boolean exceptionalAddress) {
		this.exceptionalAddress = exceptionalAddress;
	}

	public List<EverisProduct> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<EverisProduct> productsList) {
		this.productsList = productsList;
	}

	@Override
	public String toString() {
		return "EverisOrder [everisOrderId=" + everisOrderId + ", deliveryAddress=" + deliveryAddress + ", addressee="
				+ addressee + ", exceptionalAddress=" + exceptionalAddress + ", productsList=" + productsList + "]";
	}
	

}
