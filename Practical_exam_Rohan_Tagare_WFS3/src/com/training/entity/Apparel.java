/*
 * author Rohan Tagare
 * batch WFS-3
 * 
 */

package com.training.entity;

public class Apparel extends Product {
	
	private String size;
	private String material;
	
	public Apparel(int itemCode, String itemName, double unitPrice, int quantity, String size, String material) {
		super(itemCode, itemName, unitPrice, quantity);
		this.size = size;
		this.material = material;
	}

	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apparel(int itemCode, String itemName, double unitPrice, int quantity) {
		super(itemCode, itemName, unitPrice, quantity);
		// TODO Auto-generated constructor stub
	}
	
	

}
