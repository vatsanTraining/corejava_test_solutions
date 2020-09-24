package com.assessment.entity;

import java.io.Serializable;
import java.util.Comparator;

public class ElectronicsEntity implements Comparable<ElectronicsEntity>, Serializable {
	
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int warranty;
	private int quantity;
	
	public ElectronicsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectronicsEntity(int itemCode, String itemName, double unitPrice, int warranty, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.warranty = warranty;
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
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	@Override
	public String toString() {
		return "ElectronicsEntity [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + warranty;
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
		ElectronicsEntity other = (ElectronicsEntity) obj;
		if (itemCode != other.itemCode)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
			return false;
		if (warranty != other.warranty)
			return false;
		return true;
	}
	@Override
	public int compareTo(ElectronicsEntity otherObj) {
		// TODO Auto-generated method stub
		if(this.quantity<otherObj.quantity){
			return -1;
		}
		if(this.quantity>otherObj.quantity) return 1;
		return 0;
	}
}
	

