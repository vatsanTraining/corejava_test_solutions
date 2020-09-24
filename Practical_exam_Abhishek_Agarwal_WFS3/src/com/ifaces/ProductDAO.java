/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifaces;

import com.entity.FoodItems;
import com.entity.Electronics;
import com.entity.Apparel;
import java.util.Collection;
import javafx.print.Collation;

/**
 *
 * @author Abhishek Agarwal
 */
public interface ProductDAO {
    
    boolean addFoodItems(FoodItems ...foodItems);
    boolean addElectonics(Electronics ...electronics);
    boolean addApparel(Apparel ...apparel);
    void sortAll();
    Collection<?> fetchResult(String productType);
    
    
}
