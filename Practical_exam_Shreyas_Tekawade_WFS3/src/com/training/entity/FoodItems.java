/*
 * @Author : Shreyas S Tekawade
 * @Purpose Defining Food Item Class
 */

package com.training.entity;

public class FoodItems {
	private int itemCode;
	private String foodName;
	private double ratePerUnit;
	private String dateOfManufacturing;
	private String dateOfExpiry;
	private boolean foodVeg;								//true if Veg else Nonveg
	private int quantity;
	
	
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FoodItems(int itemCode, String foodName, double ratePerUnit, String dateOfManufacturing, String dateOfExpiry,
			boolean foodVeg, int quantity) {
		super();
		this.itemCode = itemCode;
		this.foodName = foodName;
		this.ratePerUnit = ratePerUnit;
		this.dateOfManufacturing = dateOfManufacturing;
		this.dateOfExpiry = dateOfExpiry;
		this.foodVeg = foodVeg;
		this.quantity = quantity;
	}


	public int getItemCode() {
		return itemCode;
	}


	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}


	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	public double getRatePerUnit() {
		return ratePerUnit;
	}


	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}


	public String getDateOfManufacturing() {
		return dateOfManufacturing;
	}


	public void setDateOfManufacturing(String dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}


	public String getDateOfExpiry() {
		return dateOfExpiry;
	}


	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}


	public boolean isFoodVeg() {
		return foodVeg;
	}


	public void setFoodVeg(boolean foodVeg) {
		this.foodVeg = foodVeg;
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
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfManufacturing == null) ? 0 : dateOfManufacturing.hashCode());
		result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
		result = prime * result + (foodVeg ? 1231 : 1237);
		result = prime * result + itemCode;
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(ratePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		FoodItems other = (FoodItems) obj;
		if (dateOfExpiry == null) {
			if (other.dateOfExpiry != null)
				return false;
		} else if (!dateOfExpiry.equals(other.dateOfExpiry))
			return false;
		if (dateOfManufacturing == null) {
			if (other.dateOfManufacturing != null)
				return false;
		} else if (!dateOfManufacturing.equals(other.dateOfManufacturing))
			return false;
		if (foodName == null) {
			if (other.foodName != null)
				return false;
		} else if (!foodName.equals(other.foodName))
			return false;
		if (foodVeg != other.foodVeg)
			return false;
		if (itemCode != other.itemCode)
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(ratePerUnit) != Double.doubleToLongBits(other.ratePerUnit))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", foodName=" + foodName + ", ratePerUnit=" + ratePerUnit
				+ ", dateOfManufacturing=" + dateOfManufacturing + ", dateOfExpiry=" + dateOfExpiry + ", foodVeg="
				+ foodVeg + ", quantity=" + quantity + "]";
	}
	
	
	

}
