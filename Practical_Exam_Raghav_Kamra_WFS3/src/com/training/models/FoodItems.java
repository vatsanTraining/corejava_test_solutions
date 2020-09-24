/***
 * author:Raghav Kamra
 * Purpose:Entity Class for Food Items
 * 
 */



package com.training.models;

public class FoodItems {
	
	private int itemCode;
	private String itemName;
	private int unitPrice;
	private String dateOfManufacture;
	private String dateOfExpiry;
	private String vegeterian;
	private int quantity;
	
	
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FoodItems(int itemCode, String itemName, int unitPrice, String dateOfManufacture, String dateOfExpiry,
			String vegeterian, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegeterian = vegeterian;
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


	public int getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(int unitPrice) {
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


	public String getVegeterian() {
		return vegeterian;
	}


	public void setVegeterian(String vegeterian) {
		this.vegeterian = vegeterian;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfManufacture == null) ? 0 : dateOfManufacture.hashCode());
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + quantity;
		result = prime * result + unitPrice;
		result = prime * result + ((vegeterian == null) ? 0 : vegeterian.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItems other = (FoodItems) obj;
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
		if (unitPrice != other.unitPrice)
			return false;
		if (vegeterian == null) {
			if (other.vegeterian != null)
				return false;
		} else if (!vegeterian.equals(other.vegeterian))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegeterian="
				+ vegeterian + ", quantity=" + quantity + "]";
	}
	
	

}
