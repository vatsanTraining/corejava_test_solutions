/*
 * author Rohan Tagare
 * batch WFS-3
 * 
 */

package com.training.entity;

public class Electronics extends Product {

	private int warranty;

	//some properties from parent
	public Electronics(int itemCode, String itemName, double unitPrice, int quantity, int warranty) {
		super(itemCode, itemName, unitPrice, quantity);
		this.warranty = warranty;
	}

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronics(int itemCode, String itemName, double unitPrice, int quantity) {
		super(itemCode, itemName, unitPrice, quantity);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
