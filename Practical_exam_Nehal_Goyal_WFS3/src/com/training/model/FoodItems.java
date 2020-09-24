package com.training.model;

import com.training.exceptionHandler.VegtarianWrongEntry;

public class FoodItems extends Product {

	 
	 private String dateOfManufacture;
	 private String dateOfExpiry;
	 private String vegetarian;
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodItems(int itemCode, String itemName, double unitPrice, String dateOfManufacture, String dateOfExpiry,
			String vegetarian, int quantity)throws VegtarianWrongEntry {
		super(itemCode,itemName,unitPrice,quantity);
		
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		if(vegetarian.equalsIgnoreCase("no")||vegetarian.equalsIgnoreCase("yes")) {
		this.vegetarian = vegetarian;}
		else
			throw new VegtarianWrongEntry();
		
	}
	
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public String getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(String vegetarian)throws VegtarianWrongEntry {
		if(vegetarian.equalsIgnoreCase("no")||vegetarian.equalsIgnoreCase("yes"))
		{
			this.vegetarian = vegetarian;
			}
			else {
				throw new VegtarianWrongEntry();}
	}
		
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfManufacture == null) ? 0 : dateOfManufacture.hashCode());
		result = prime * result + ((vegetarian == null) ? 0 : vegetarian.hashCode());
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
		if (dateOfExpiry == null) {
			if (other.dateOfExpiry != null)
				return false;
		} else if (!dateOfExpiry.equals(other.dateOfExpiry))
			return false;
		if (dateOfManufacture == null) {
			if (other.dateOfManufacture != null)
				return false;
		} else if (!dateOfManufacture.equals(other.dateOfManufacture))
			return false;
		if (vegetarian == null) {
			if (other.vegetarian != null)
				return false;
		} else if (!vegetarian.equals(other.vegetarian))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return super.getItemCode()+","+super.getItemName()+","+super.getQuantity()+","+getVegetarian();
	}
	
	
	
	
	
	
	 
	
}
