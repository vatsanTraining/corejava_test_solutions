/**
 * 
 */
package com.training.entity;

/**
 * @author Shreyas S Tekawade
 * @Purpose Defining Electronics class
 *
 */
public class Electronics {
	
	private int itemCode;
	private String gadgetName;
	private double ratePerUnit;
	private int warrantyMonths;
	private int quantity;
	
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronics(int itemCode, String gadgetName, double ratePerUnit, int warrantyMonths, int quantity) {
		super();
		this.itemCode = itemCode;
		this.gadgetName = gadgetName;
		this.ratePerUnit = ratePerUnit;
		this.warrantyMonths = warrantyMonths;
		this.quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getGadgetName() {
		return gadgetName;
	}

	public void setGadgetName(String gadgetName) {
		this.gadgetName = gadgetName;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public int getWarrantyMonths() {
		return warrantyMonths;
	}

	public void setWarrantyMonths(int warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
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
		result = prime * result + ((gadgetName == null) ? 0 : gadgetName.hashCode());
		result = prime * result + itemCode;
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(ratePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + warrantyMonths;
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
		if (gadgetName == null) {
			if (other.gadgetName != null)
				return false;
		} else if (!gadgetName.equals(other.gadgetName))
			return false;
		if (itemCode != other.itemCode)
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(ratePerUnit) != Double.doubleToLongBits(other.ratePerUnit))
			return false;
		if (warrantyMonths != other.warrantyMonths)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", gadgetName=" + gadgetName + ", ratePerUnit=" + ratePerUnit
				+ ", warrantyMonths=" + warrantyMonths + ", quantity=" + quantity + "]";
	}
	
	

}
