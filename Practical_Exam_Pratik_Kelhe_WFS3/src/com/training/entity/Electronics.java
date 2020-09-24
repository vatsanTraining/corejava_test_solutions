/*
 * Name - Pratik Kelhe
 * 
 */
//ELectronics class 
package com.training.entity;

import java.util.Comparator;

import com.training.ifaces.Product;

public class Electronics implements Product, Comparator<Product> {

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int warranty;
	private int quantity;
	
	
	
	
	/**
	 * 
	 */
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	/**
	 * @param itemCode
	 * @param itemName
	 * @param unitPrice
	 * @param warranty
	 * @param quantity
	 */
	public Electronics(int itemCode, String itemName, double unitPrice, int warranty, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.warranty = warranty;
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
	 * @return the warranty
	 */
	public int getWarranty() {
		return warranty;
	}




	/**
	 * @param warranty the warranty to set
	 */
	public void setWarranty(int warranty) {
		this.warranty = warranty;
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

	



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + warranty;
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
		Electronics other = (Electronics) obj;
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
		if (warranty != other.warranty)
			return false;
		return true;
	}

	




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + ", quantity=" + quantity + "]";
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
