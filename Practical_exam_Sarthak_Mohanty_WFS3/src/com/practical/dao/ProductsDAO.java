//Author: Sarthak Mohanty
//interface for the application

package com.practical.dao;

import java.util.Collection;

import com.practical.entity.Apparel;
import com.practical.entity.Electronics;
import com.practical.entity.FoodItems;


public interface ProductsDAO {

	Collection<FoodItems> getTopFoodItems();
	Collection<Apparel> getTopApparel();
	Collection<Electronics> getTopElectronics();
	
	boolean addApparel(Apparel apparel);
	boolean addElectronics(Electronics electronics);
	boolean addFoodItems(FoodItems foodItems);
}
