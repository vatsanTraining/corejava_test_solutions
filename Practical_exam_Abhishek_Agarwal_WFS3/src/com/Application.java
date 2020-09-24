/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.DAlayer.ProductDAOImpl;
import com.entity.FoodItems;
import com.entity.Electronics;
import com.entity.Apparel;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Abhishek Agarwal
 */
public class Application {
    
    public static void printList(Collection<?> invList)
    {
        Iterator<?> itr= invList.iterator();
         int count = 0;
        while(itr.hasNext() && count<3)
        {
            System.out.println(itr.next());
            count++;
                    
        }
    }
    public static void main(String[] args) {
        
        
        FoodItems food1= new FoodItems("1-1-1", "2-2-2", true, 100, "Chips", 50, 100);
        FoodItems food2= new FoodItems("1-1-1", "2-2-2", true, 101, "Biscuit", 20, 500);
        FoodItems food3= new FoodItems("1-1-1", "2-2-2", true, 102, "Popcorn", 10, 300);
        FoodItems food4= new FoodItems("1-1-1", "2-2-2", true, 103, "Cheese", 100, 10);
        
        
        Apparel app1= new Apparel(200, "Shirt", 500, 'M', "cotton", 37);
        Apparel app2= new Apparel(201, "TShirt", 5000, 'L', "woolen", 10);
        Apparel app3= new Apparel(202, "Jacket", 2500, 'M', "cotton", 70);
        Apparel app4= new Apparel(203, "Pant", 1500, 'S', "woolen", 100);
        
        
        Electronics elec1= new Electronics(300, "TV", 5000, 100, 12);
        Electronics elec2= new Electronics(301, "Watch", 15000, 50, 6);
        Electronics elec3= new Electronics(302, "Mobile", 58000, 70, 60);
        Electronics elec4= new Electronics(303, "Geyser", 25000, 5, 24);
        
        
        
        ProductDAOImpl pImpl= new ProductDAOImpl();
        
        boolean result;
        result=pImpl.addFoodItems(food1,food2,food3,food4);
        System.out.println(result);
        result=pImpl.addApparel(app1,app2,app3,app4);
        System.out.println(result);
        result=pImpl.addElectonics(elec1,elec2,elec3,elec4);
        System.out.println(result);
        
        
        pImpl.sortAll();
        
        
        Collection<?> list= pImpl.fetchResult("FoodItems");
        printList(list);
        
        
        
        
    }
    
}
