/**
 * 
 */
package com.training.ifaces;

import java.util.Collection;

import com.training.entity.FoodItems;

/**
 * @author Shreyas Tekawade
 *@Purpose Interface defined for FoodItems separately
 */
public interface FoodItemsInterface {
	
	boolean addFoodItem(FoodItems fooditem);
	Collection <FoodItems> ReportFoodItem();

}
