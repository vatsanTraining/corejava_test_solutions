//Author: Sarthak Mohanty
//model for FoodItems


package com.practical.entity;

import java.util.Date;

public class FoodItems {
	
	String dateOfManufacture;
	String dateOfExpiry;
	String vegetarian;
	double unitPrice;
	private int itemCode;
	private String itemName;
	private int quantitySold;
	public FoodItems(String dateOfManufacture, String dateOfExpiry, String vegetarian, double unitPrice, int itemCode,
			String itemName, int quantitySold) {
		super();
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
		this.unitPrice = unitPrice;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantitySold = quantitySold;
	}
	/**
	 * @return the dateOfManufacture
	 */
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	/**
	 * @param dateOfManufacture the dateOfManufacture to set
	 */
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	/**
	 * @return the dateOfExpiry
	 */
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	/**
	 * @param dateOfExpiry the dateOfExpiry to set
	 */
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	/**
	 * @return the vegetarian
	 */
	public String getVegetarian() {
		return vegetarian;
	}
	/**
	 * @param vegetarian the vegetarian to set
	 */
	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * @return the itemCode
	 */
	public int getItemCode() {
		return itemCode;
	}
	/**
	 * @param itemCode the itemCode to set
	 */
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the quantitySold
	 */
	public int getQuantitySold() {
		return quantitySold;
	}
	/**
	 * @param quantitySold the quantitySold to set
	 */
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfManufacture == null) ? 0 : dateOfManufacture.hashCode());
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + quantitySold;
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((vegetarian == null) ? 0 : vegetarian.hashCode());
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
		if (quantitySold != other.quantitySold)
			return false;
		if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
			return false;
		if (vegetarian == null) {
			if (other.vegetarian != null)
				return false;
		} else if (!vegetarian.equals(other.vegetarian))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FoodItems [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarian="
				+ vegetarian + ", unitPrice=" + unitPrice + ", itemCode=" + itemCode + ", itemName=" + itemName
				+ ", quantitySold=" + quantitySold + "]";
	}

	
	
	
}
