package com.training.entity;

public class Apparel extends Product{
	
//	Subclass of product class which has its own attributed included

	
	private double unitPrice;
	private String size;
	private String material;
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apparel(int itemCode, String itemName, long quantity,double unitPrice, String size, String material) {
		super(itemCode, itemName, quantity);
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
		// TODO Auto-generated constructor stub
	}
	public Apparel(double unitPrice, String size, String material) {
		super();
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Apparel [unitPrice=" + unitPrice + ", size=" + size + ", material=" + material + ", getItemCode()="
				+ getItemCode() + ", getItemName()=" + getItemName() + ", getQuantity()=" + getQuantity() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Apparel other = (Apparel) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
			return false;
		return true;
	}

	

}
