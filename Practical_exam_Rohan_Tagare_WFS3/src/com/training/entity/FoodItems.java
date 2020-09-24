/*
 * author Rohan Tagare
 * batch WFS-3
 * 
 */

package com.training.entity;

public class FoodItems extends Product {
	
	private String dateOfManufacture;
	private String dateOfExpiry;
	private boolean vegetarian;
	
	public FoodItems(int itemCode, String itemName, double unitPrice, int quantity, String dateOfManufacture,
			String dateOfExpiry, boolean vegetarian) {
		super(itemCode, itemName, unitPrice, quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
	}

	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItems(int itemCode, String itemName, double unitPrice, int quantity) {
		super(itemCode, itemName, unitPrice, quantity);
		// TODO Auto-generated constructor stub
	}
	
	

}
