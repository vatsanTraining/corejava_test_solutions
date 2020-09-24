/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Objects;

/**
 *
 * @author Abhishek Agarwal
 */
public abstract class ProductCategory {
    
    protected int itemCode;
    protected String itemName;
    protected double unitPrice;
    protected int quantity;

    public ProductCategory(int itemCode, String itemName, double unitPrice, int quantity) {
        super();
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.itemCode;
        hash = 59 * hash + Objects.hashCode(this.itemName);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.unitPrice) ^ (Double.doubleToLongBits(this.unitPrice) >>> 32));
        hash = 59 * hash + this.quantity;
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
        final ProductCategory other = (ProductCategory) obj;
        if (this.itemCode != other.itemCode) {
            return false;
        }
        if (Double.doubleToLongBits(this.unitPrice) != Double.doubleToLongBits(other.unitPrice)) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductCategory{" + "itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity=" + quantity + '}';
    }

   
    
    
}
