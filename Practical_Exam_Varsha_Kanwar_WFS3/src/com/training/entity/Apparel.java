package com.training.entity;

public class Apparel implements Comparable<Apparel>{

	private int itemCode ;
	private String itemName;
	private double unitPrice;
	private String size;
	private String material;
	private double quantity;
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apparel(int itemCode, String itemName, double unitPrice,
			String size, String material, double quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
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
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName
				+ ", unitPrice=" + unitPrice + ", size=" + size + ", material="
				+ material + ", quantity=" + quantity + "]";
	}
	public int compareTo(Apparel item) {
		if(this.getQuantity()>item.getQuantity())return -1;
		if(this.getQuantity()<item.getQuantity())return 1;
		return 0;
	}
	
	
}
