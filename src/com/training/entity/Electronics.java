package com.training.entity;

public class Electronics extends Product{
	
//	Subclass of product class which has its own attributed included


	private int warranty;
	private int costPerItem;
	public Electronics(int itemCode, String itemName, long quantity,int warranty,int costPerItem) {
		super(itemCode, itemName, quantity);
		this.warranty = warranty;
		this.costPerItem=costPerItem;
		// TODO Auto-generated constructor stub
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + ", costPerItem=" + costPerItem + ", getItemCode()=" + getItemCode()
				+ ", getItemName()=" + getItemName() + ", getQuantity()=" + getQuantity() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Electronics other = (Electronics) obj;
		if (warranty != other.warranty)
			return false;
		return true;
	}

}
