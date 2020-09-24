/**
 * 
 */
package com.training.daoimplementation;
import java.util.*;

import com.training.entity.FoodItems;
import com.training.ifaces.FoodItemsInterface;

/**
 * @author Shreyas S Tekawade
 * @Purpose add a food item and report of food item is implemented
 *
 */
public class FoodItemsDAOImpl implements FoodItemsInterface {
	
	List<FoodItems> foodItemList;
	
	

	public FoodItemsDAOImpl() {
		super();
		this.foodItemList = new ArrayList <FoodItems>();
		
	}

	@Override
	public boolean addFoodItem(FoodItems fooditem) {
		
		return this.foodItemList.add(fooditem);
	}

	@Override
	public Collection<FoodItems> ReportFoodItem() {
		
		Collections.sort((List<FoodItems>) foodItemList);
		return this.foodItemList;
	}

}
