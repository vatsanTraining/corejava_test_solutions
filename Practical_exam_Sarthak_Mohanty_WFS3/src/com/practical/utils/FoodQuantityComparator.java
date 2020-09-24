package com.practical.utils;

import java.util.Comparator;

import com.practical.entity.FoodItems;



public class FoodQuantityComparator implements Comparator<FoodItems> {

	@Override
	public int compare(FoodItems FoodItems1, FoodItems FoodItems2) {
		// TODO Auto-generated method stub
		if(FoodItems1.getQuantitySold()<FoodItems2.getQuantitySold()) return -1;
		if(FoodItems1.getQuantitySold()>FoodItems2.getQuantitySold()) return 1;
		return 0;
	}

}
