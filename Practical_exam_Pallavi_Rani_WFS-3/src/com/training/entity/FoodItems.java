package com.training.entity;

/**
 * @author Pallavi Rani
 *
 */

//This is the entity class for Food Items


public class FoodItems {

	
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private String dateOfManufacture;
	private String dateOfExpiry;
	private String vegetarian;
	private int quantity;
	
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FoodItems(int itemCode, String itemName, double unitPrice, String string,
			String string2, String vegetarian, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateOfManufacture = string;
		this.dateOfExpiry = string2;
		this.vegetarian = vegetarian;
		this.quantity = quantity;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", vegetarian=" + vegetarian + ", quantity=" + quantity + "]";
	}
	
	
	
}
