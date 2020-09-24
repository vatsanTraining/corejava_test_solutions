package com.training.entity;

public class Electronic implements Comparable<Electronic>{

	//Attribute Declaration

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int warranty;
	private int quantity;
	
	//constructor of superclass
	public Electronic() {
		super();
	}
	
	//constructors using fields

	public Electronic(int itemCode, String itemName, double unitPrice, int warranty, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.warranty = warranty;
		this.quantity = quantity;
	}
	
	//setter getter methods
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
	
	public int getWarranty() {
		return warranty;
	}
	
	public void setWarranty(int warranty) {
		this.warranty = warranty;
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
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + warranty;
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
		Electronic other = (Electronic) obj;
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
	//toString method
	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + ", quantity=" + quantity + "]";
	}
	//compareTo method
	@Override
	public int compareTo(Electronic electronic) {
		
		if (electronic.getQuantity() > this.getQuantity()) return -1;
		if (electronic.getQuantity() < this.getQuantity()) return 1;
		return 0;
	}
	
	
}