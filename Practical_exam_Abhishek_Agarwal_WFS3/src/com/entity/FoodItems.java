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
 Purpose: Create FoodItems Attribute
  
 */
public class FoodItems extends ProductCategory implements Comparable<FoodItems>{
    
    
    
    protected String dateOfManufacture;
    protected String dateOfExpiry;
    protected boolean isVegeterian;

    
    public FoodItems(String dateOfManufacture, String dateOfExpiry, boolean isVegeterian, int itemCode, String itemName, double unitPrice, int quantity) {
        super(itemCode, itemName, unitPrice, quantity);
        this.dateOfManufacture = dateOfManufacture;
        this.dateOfExpiry = dateOfExpiry;
        this.isVegeterian = isVegeterian;
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

    public boolean isIsVegeterian() {
        return isVegeterian;
    }

    public void setIsVegeterian(boolean isVegeterian) {
        this.isVegeterian = isVegeterian;
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
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.dateOfManufacture);
        hash = 29 * hash + Objects.hashCode(this.dateOfExpiry);
        hash = 29 * hash + (this.isVegeterian ? 1 : 0);
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
        final FoodItems other = (FoodItems) obj;
        if (this.isVegeterian != other.isVegeterian) {
            return false;
        }
        if (!Objects.equals(this.dateOfManufacture, other.dateOfManufacture)) {
            return false;
        }
        if (!Objects.equals(this.dateOfExpiry, other.dateOfExpiry)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FoodItems{"+ "itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", isVegeterian=" + isVegeterian + '}';
    }

    @Override
    public int compareTo(FoodItems foodItems) {
        if(this.quantity < foodItems.quantity) return 1;
        if(this.quantity > foodItems.quantity) return -1;
        return 0;
    }

    
       
    
    
    
    
}
