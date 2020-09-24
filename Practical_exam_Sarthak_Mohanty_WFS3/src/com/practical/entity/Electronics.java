//Author: Sarthak Mohanty
//model for electronics


package com.practical.entity;

import java.util.Date;

public class Electronics {

	private double unitPrice;
	private String warranty;
	private int itemCode;
	private String itemName;
	private int quantitySold;
	public Electronics(double unitPrice, String warranty, int itemCode, String itemName, int quantitySold) {
		super();
		this.unitPrice = unitPrice;
		this.warranty = warranty;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantitySold = quantitySold;
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
	public String getWarranty() {
		return warranty;
	}
	/**
	 * @param warranty the warranty to set
	 */
	public void setWarranty(String warranty) {
		this.warranty = warranty;
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
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + quantitySold;
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((warranty == null) ? 0 : warranty.hashCode());
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
		Electronics other = (Electronics) obj;
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
		if (warranty == null) {
			if (other.warranty != null)
				return false;
		} else if (!warranty.equals(other.warranty))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Electronics [unitPrice=" + unitPrice + ", warranty=" + warranty + ", itemCode=" + itemCode
				+ ", itemName=" + itemName + ", quantitySold=" + quantitySold + "]";
	}

	
}
