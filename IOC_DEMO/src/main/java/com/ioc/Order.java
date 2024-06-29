package com.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

private int oid;
// @Autowired--------------------->field level injection              
	private Product product;
	//@Autowired                     //--------------------->constructor level injection 
	public Order(Product product) {
		this.product=product;
	}
	
	
	
//	public Order() {
//		
//	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Product getProduct() {
		return product;
	}
//	@Autowired --------------------->setter level injection 
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", product=" + product + "]";
	}
	
}
