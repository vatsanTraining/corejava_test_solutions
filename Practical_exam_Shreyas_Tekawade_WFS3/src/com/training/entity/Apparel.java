/**
 * 
 */
package com.training.entity;

/**
 * @author Shreyas S Tekawade
 * @Purpose  Defining Apparel Class
 *
 */
public class Apparel {
	
	private int itemCode;
	private String apparelName;
	private double ratePerUnit;
	private int size;
	private String apparelMaterial;
	private int quantity;
	
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apparel(int itemCode, String apparelName, double ratePerUnit, int size, String apparelMaterial,
			int quantity) {
		super();
		this.itemCode = itemCode;
		this.apparelName = apparelName;
		this.ratePerUnit = ratePerUnit;
		this.size = size;
		this.apparelMaterial = apparelMaterial;
		this.quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getApparelName() {
		return apparelName;
	}

	public void setApparelName(String apparelName) {
		this.apparelName = apparelName;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getApparelMaterial() {
		return apparelMaterial;
	}

	public void setApparelMaterial(String apparelMaterial) {
		this.apparelMaterial = apparelMaterial;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apparelMaterial == null) ? 0 : apparelMaterial.hashCode());
		result = prime * result + ((apparelName == null) ? 0 : apparelName.hashCode());
		result = prime * result + itemCode;
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(ratePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + size;
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
		Apparel other = (Apparel) obj;
		if (apparelMaterial == null) {
			if (other.apparelMaterial != null)
				return false;
		} else if (!apparelMaterial.equals(other.apparelMaterial))
			return false;
		if (apparelName == null) {
			if (other.apparelName != null)
				return false;
		} else if (!apparelName.equals(other.apparelName))
			return false;
		if (itemCode != other.itemCode)
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(ratePerUnit) != Double.doubleToLongBits(other.ratePerUnit))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", apparelName=" + apparelName + ", ratePerUnit=" + ratePerUnit
				+ ", size=" + size + ", apparelMaterial=" + apparelMaterial + ", quantity=" + quantity + "]";
	}
	
	
	

}
