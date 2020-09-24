/**
 * 
 */
package com.training.entity;

/**
 * @author manan
 *
 */
public class Apparel implements Comparable<Apparel>{

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private double size;
	private String material;
	private int quantity;
	/**
	 * 
	 */
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param itemCode
	 * @param itemName
	 * @param unitPrice
	 * @param size
	 * @param material
	 * @param quantity
	 */
	public Apparel(int itemCode, String itemName, double unitPrice, double size, String material, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
		this.quantity = quantity;
	}
	/**
	 * @return the itemCode
	 */
	public int getItemCode() {
		return itemCode;
	}
	/**
	 * @param itemCode the itemCode to set
	 */
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}
	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(unitPrice);
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
		Apparel other = (Apparel) obj;
		if (itemCode != other.itemCode)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", size="
				+ size + ", material=" + material + ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(Apparel apparel) {
		
		if (apparel.getQuantity() > this.getQuantity()) return -1;
		if (apparel.getQuantity() < this.getQuantity()) return 1;
		return 0;
	}
	
	
}
