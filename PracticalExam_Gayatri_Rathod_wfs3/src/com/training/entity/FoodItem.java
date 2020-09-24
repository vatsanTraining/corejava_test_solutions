package com.training.entity;

import java.time.LocalDate;

public class FoodItem implements Comparable<FoodItem>{

	//Attribute Declaration
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private LocalDate dateOfManufacture;
	private LocalDate dateOfExpiry;
	private boolean vegetarian;
	private int quantity;
	
	//constructor of superclass
	public FoodItem() {
		super();
	}
	
	//constructors using fields
	public FoodItem(int itemCode, String itemName, double unitPrice, LocalDate dateOfManufacture,
			LocalDate dateOfExpiry, boolean vegetarian, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
		this.quantity = quantity;
	}
	
	//setter and getter methods
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
	
	public LocalDate getDateOfManufacture() {
		return dateOfManufacture;
	}
	
	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	
	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}
	
	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	//hash code method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfManufacture == null) ? 0 : dateOfManufacture.hashCode());
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (vegetarian ? 1231 : 1237);
		return result;
	}
	
	//equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItem other = (FoodItem) obj;
		if (dateOfExpiry == null) {
			if (other.dateOfExpiry != null)
				return false;
		} else if (!dateOfExpiry.equals(other.dateOfExpiry))
			return false;
		if (dateOfManufacture == null) {
			if (other.dateOfManufacture != null)
				return false;
		} else if (!dateOfManufacture.equals(other.dateOfManufacture))
			return false;
		if (itemCode != other.itemCode)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
			return false;
		if (vegetarian != other.vegetarian)
			return false;
		return true;
	}
	
	//toString method
	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarian="
				+ vegetarian + ", quantity=" + quantity + "]";
	}
	
	//compareTo method
	@Override
	public int compareTo(FoodItem foodItem) {
		
		if (foodItem.getQuantity() > this.getQuantity()) return -1;
		if (foodItem.getQuantity() < this.getQuantity()) return 1;
		return 0;
	}
	
	
}