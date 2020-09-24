/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import com.model.ProductCategory;

/**
 
 Author: Abhishek Mansih Agarwal
 Purpose: Create Electronic Attribute
  
 */
public class Electronics extends ProductCategory implements Comparable<Electronics>{
    
    
    private int warranty;

    public Electronics(int itemCode, String itemName, double unitPrice, int quantity,int warranty) {
        super(itemCode, itemName, unitPrice, quantity);
        this.warranty=warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
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
        hash = 29 * hash + this.warranty;
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
        final Electronics other = (Electronics) obj;
        if (this.warranty != other.warranty) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Electronics{"+ "itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "warranty=" + warranty + '}';
    }

    @Override
    public int compareTo(Electronics electronics) {
       if(this.quantity < electronics.quantity) return 1;
        if(this.quantity > electronics.quantity) return -1;
        return 0;
    }
    
    

    
    
    
}
