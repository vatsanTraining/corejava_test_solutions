/**
 * 
 */
package com.training.entity;

/**
 * @author manan
 *
 */
public class Electronic implements Comparable<Electronic>{

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int warranty;
	private int quantity;
	/**
	 * 
	 */
	public Electronic() {
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
	public Electronic(int itemCode, String itemName, double unitPrice, int warranty, int quantity) {
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
	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(Electronic electronic) {
		
		if (electronic.getQuantity() > this.getQuantity()) return -1;
		if (electronic.getQuantity() < this.getQuantity()) return 1;
		return 0;
	}
	
	
}
