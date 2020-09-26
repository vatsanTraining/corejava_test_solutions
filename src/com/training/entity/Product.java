package com.training.entity;

abstract class Product implements Comparable<Product> {

	private int itemCode;
	private String itemName;
	private long quantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int itemCode, String itemName, long quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
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
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", quantity=" + quantity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + (int) (quantity ^ (quantity >>> 32));
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
		Product other = (Product) obj;
		if (itemCode != other.itemCode)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	
//	Common method for sorting so that subclass can inherit it 
	
	@Override
	public int compareTo(Product otherObj) {
		if(this.getQuantity()<otherObj.getQuantity())return -1;
		else if(this.getQuantity()>otherObj.getQuantity())return 1;
		return 0;
	}
	
	
}
