package com.everis.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.everis.spring.repository.EverisOrder;
import com.everis.spring.repository.EverisProduct;

@Service
@Qualifier("peninsula")
public class everisOrderManagementServicePeninsulaImpl implements everisOrderManagementServiceI {

	@Override
	public EverisOrder createOrder(String everisOrderId, String deliveryAddress, String addressee) {

		final EverisOrder everisOrder = new EverisOrder();
		
		everisOrder.setEverisOrderId(everisOrderId);
		everisOrder.setDeliveryAddress(deliveryAddress);
		everisOrder.setAddressee(addressee);
		everisOrder.setExceptionalAddress(false);
		
		return everisOrder;
	}

	@Override
	public void addProduct(EverisOrder order, EverisProduct product) {
		
		List<EverisProduct> productsList = order.getProductsList();
		product.setProductPricePVP(product.getProductPriceNoTaxes()*1.21);
		productsList.add(product);
		order.setProductsList(productsList);
		
	}

	@Override
	public void showOrder(EverisOrder order) {
		
		System.out.println("***Datos del pedido*** ");
		System.out.println("Identificador del pedido: " + order.getEverisOrderId());
		System.out.println("Destinatario: " + order.getAddressee());
		System.out.println("Dirección de entrega: " + order.getDeliveryAddress());
		System.out.println("Pedido para dentro de la península");
		System.out.println("Cantidad de productos: " + order.getProductsList().size());
		System.out.println("Lista de productos: ");
		
		List<EverisProduct> productsList = order.getProductsList();
		
		double precioTotal = 0;
		
		for (EverisProduct everisProduct : productsList) {
			System.out.println("ID del producto: " + everisProduct.getEverisProductId() + ", Nombre del producto: "
					+ everisProduct.getProductName() + ", PVP del producto: " + everisProduct.getProductPricePVP()
					+ ", Precio del producto sin impuestos: " + everisProduct.getProductPriceNoTaxes() + ".");
			precioTotal += everisProduct.getProductPricePVP();
		}
		
		System.out.println("Precio total del pedido " + order.getEverisOrderId() + ": " + precioTotal);
		
		System.out.println("----------");
	}



}
