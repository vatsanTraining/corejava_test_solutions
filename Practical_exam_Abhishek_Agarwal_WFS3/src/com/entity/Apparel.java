/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import com.model.ProductCategory;
import java.util.Objects;

/**
 
 Author: Abhishek Mansih Agarwal
 Purpose: Create Apparel Attribute
  
 */
public class Apparel extends ProductCategory implements Comparable<Apparel>{


    protected char size;
    protected String material;
    public Apparel(int itemCode, String itemName, double unitPrice, char size,String material,int quantity) {
        super(itemCode, itemName, unitPrice, quantity);
        this.size= size;
        this.material=material;
                
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.size;
        hash = 37 * hash + Objects.hashCode(this.material);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Apparel other = (Apparel) obj;
        if (this.size != other.size) {
            return false;
        }
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Apparel{" + "itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity=" + quantity+ "size=" + size + ", material=" + material + '}';
    }

    @Override
    public int compareTo(Apparel apparel) {
        if(this.quantity < apparel.quantity) return 1;
        if(this.quantity > apparel.quantity) return -1;
        return 0;
    }

    
    
    
}
