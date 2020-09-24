/*
 * Name - Pratik Kelhe
 * 
 */
//FoodItems class


package com.training.entity;

import java.util.Comparator;
import java.util.TreeSet;

import com.training.ifaces.Product;

/**
 * @author Pratik Kelhe
 *
 */
public class FoodItems implements Product, Comparator<Product> {
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private String dateOfmanufacture;
	private String dateOfExpiry;
	private String vegetarian;
	private int quantity;
	
	
	
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param itemCode
	 * @param itemName
	 * @param unitPrice
	 * @param dateOfmanufacture
	 * @param dateOfExpiry
	 * @param vegetarian
	 */
	public FoodItems(int itemCode, String itemName, double unitPrice, String dateOfmanufacture, String dateOfExpiry,
			String vegetarian) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateOfmanufacture = dateOfmanufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
	}

	
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	 * @return the dateOfmanufacture
	 */
	public String getDateOfmanufacture() {
		return dateOfmanufacture;
	}

	/**
	 * @param dateOfmanufacture the dateOfmanufacture to set
	 */
	public void setDateOfmanufacture(String dateOfmanufacture) {
		this.dateOfmanufacture = dateOfmanufacture;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfmanufacture == null) ? 0 : dateOfmanufacture.hashCode());
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((vegetarian == null) ? 0 : vegetarian.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
		if (dateOfmanufacture == null) {
			if (other.dateOfmanufacture != null)
				return false;
		} else if (!dateOfmanufacture.equals(other.dateOfmanufacture))
			return false;
		if (itemCode != other.itemCode)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
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
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", dateOfmanufacture=" + dateOfmanufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarian="
				+ vegetarian + "]";
	}


	@Override
	public int compare(Product product1, Product product2) {
		if(product1.getProductQuantity() < product2.getProductQuantity()) return -1;
		if(product1.getProductQuantity() > product2.getProductQuantity()) return 1;
		
		return 0;
	}




	@Override
	public int getProductQuantity() {
		// TODO Auto-generated method stub
		return this.getQuantity();
	}	
	
	
	
}
