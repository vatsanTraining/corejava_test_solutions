package com.assessment.entity;

import java.io.Serializable;
import java.util.Comparator;

public class FoodItemsEntity implements Comparable<FoodItemsEntity>, Serializable {
	
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private String vegeterian;
	private long quantity;
	public FoodItemsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodItemsEntity(int itemCode, String itemName, double unitPrice, String vegeterian, long quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
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
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getVegeterian() {
		return vegeterian;
	}
	public void setVegeterian(String vegeterian) {
		this.vegeterian = vegeterian;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "FoodItemsEntity [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", vegeterian=" + vegeterian + ", quantity=" + quantity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + (int) (quantity ^ (quantity >>> 32));
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		FoodItemsEntity other = (FoodItemsEntity) obj;
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
		if (vegeterian == null) {
			if (other.vegeterian != null)
				return false;
		} else if (!vegeterian.equals(other.vegeterian))
			return false;
		return true;
	}
	@Override
	public int compareTo(FoodItemsEntity otherObj) {
		// TODO Auto-generated method stub
		if(this.quantity<otherObj.quantity){
			return -1;
		}
		if(this.quantity>otherObj.quantity) return 1;
		return 0;

	}


	

}
