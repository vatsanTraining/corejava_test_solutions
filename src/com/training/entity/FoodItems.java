package com.training.entity;

public class FoodItems extends Product{
	private double unitPrice;
	private String vegeterian;
	
//	Subclass of product class which has its own attributed included
	
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodItems(int itemCode, String itemName, long quantity,double unitPrice, String vegeterian) {
		super(itemCode, itemName, quantity);
		this.unitPrice = unitPrice;
		this.vegeterian = vegeterian;
		// TODO Auto-generated constructor stub
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
	
	
	@Override
	public String toString() {
		return "FoodItems [unitPrice=" + unitPrice + ", vegeterian=" + vegeterian + ", getItemCode()=" + getItemCode()
				+ ", getItemName()=" + getItemName() + ", getQuantity()=" + getQuantity() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItems other = (FoodItems) obj;
		if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
			return false;
		if (vegeterian == null) {
			if (other.vegeterian != null)
				return false;
		} else if (!vegeterian.equals(other.vegeterian))
			return false;
		return true;
	}

}
