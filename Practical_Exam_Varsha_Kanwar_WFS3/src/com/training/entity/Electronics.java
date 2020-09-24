package com.training.entity;

public class Electronics implements Comparable<Electronics>{
   
	private int itemCode ;
	private String itemName;
	private double unitPrice;
	private int warranty;
	private double quantity;
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronics(int itemCode, String itemName, double unitPrice,
			int warranty, double quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.warranty = warranty;
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
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName
				+ ", unitPrice=" + unitPrice + ", warranty=" + warranty
				+ ", quantity=" + quantity + "]";
	}
	public int compareTo(Electronics item) {
		if(this.getQuantity()>item.getQuantity())return -1;
		if(this.getQuantity()<item.getQuantity())return 1;
		return 0;
	}
	
	
}
