package com.training.model;

import com.training.exceptionHandler.ApprelMaterialMisMatch;

public class Apparel extends Product {
		private String size;
		private String material;
		public Apparel() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Apparel(int itemCode, String itemName, double unitPrice, int quantity,String size,String material)throws ApprelMaterialMisMatch{
			super(itemCode, itemName, unitPrice, quantity);
			// TODO Auto-generated constructor stub
			this.size=size;
			if(material.equalsIgnoreCase("woolen")||material.equalsIgnoreCase("cotton"))
			this.material=material;
			else
				throw new ApprelMaterialMisMatch();
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
		public void setMaterial(String material) throws ApprelMaterialMisMatch{
			
			if(material.equalsIgnoreCase("woolen")||material.equalsIgnoreCase("cotton"))
				this.material=material;
				else
					throw new ApprelMaterialMisMatch();
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + ((material == null) ? 0 : material.hashCode());
			result = prime * result + ((size == null) ? 0 : size.hashCode());
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
			return true;
		}
		@Override
		public String toString() {
			return super.getItemCode()+","+super.getItemName()+","+super.getQuantity()+","+getSize()+","+getMaterial();
		}
		
		
}
