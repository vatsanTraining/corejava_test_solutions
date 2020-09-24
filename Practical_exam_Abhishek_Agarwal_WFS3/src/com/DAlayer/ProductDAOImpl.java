/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAlayer;

import com.ifaces.ProductDAO;
import com.entity.FoodItems;
import com.entity.Electronics;
import com.entity.Apparel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * Author: Abhishek Manish Agarwal
 */
public class ProductDAOImpl implements ProductDAO{
    
    private List<FoodItems> foodList;
    private List<Apparel> appList;
    private List<Electronics> elecList;

    public ProductDAOImpl() {
        this.foodList = new ArrayList<>();
        this.appList = new ArrayList<>();
        this.elecList = new ArrayList<>();
    }
    
    

    @Override
    public boolean addFoodItems(FoodItems... foodItems) {
        
        boolean result =false;
        
        for(FoodItems f: foodItems)
        {
            this.foodList.add(f);
            result=true;
        }
            return result;
            
    }

    @Override
    public boolean addElectonics(Electronics... electronics) {
        
        boolean result =false;
        
        for(Electronics e: electronics)
        {
            this.elecList.add(e);
            result=true;
        }
            return result;
    }

    @Override
    public boolean addApparel(Apparel... apparel) {
        boolean result =false;
        
        for(Apparel a: apparel)
        {
            this.appList.add(a);
            result=true;
        }
            return result;
    }

    @Override
    public void sortAll() {
        
        Collections.sort(this.foodList);
        Collections.sort(this.appList);
        Collections.sort(this.elecList);
    }

    @Override
    public Collection<?> fetchResult(String productType) {
        
        if(productType.equalsIgnoreCase("FoodItems"))
            return this.foodList;
        else
            if(productType.equalsIgnoreCase("Apparel"))
                return this.appList;
        else
                if(productType.equalsIgnoreCase("Electronics"))
                    return this.elecList;
        
        return null;
    }
    
}
