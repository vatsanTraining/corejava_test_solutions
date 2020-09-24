package com.training.entity;

public class FoodItems implements Comparable<FoodItems>{

	private int itemCode ;
	private String itemName;
	private double unitPrice;
	private String manufactureDate;
	private String expiryDate;
	private String vegetarian;
	private double quantity;
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodItems(int itemCode, String itemName, double unitPrice,
			String manufactureDate, String expiryDate, String vegetarian,
			double quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
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
	public String getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName
				+ ", unitPrice=" + unitPrice + ", manufactureDate="
				+ manufactureDate + ", expiryDate=" + expiryDate
				+ ", vegetarian=" + vegetarian + ", quantity=" + quantity + "]";
	}
	public int compareTo(FoodItems item) {
		if(this.getQuantity()>item.getQuantity())return -1;
		if(this.getQuantity()<item.getQuantity())return 1;
		
		return 0;
	}
	
	
}
