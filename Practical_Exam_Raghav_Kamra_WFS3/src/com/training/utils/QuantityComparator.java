package com.training.utils;

import java.util.Comparator;

import com.training.models.FoodItems;

public class QuantityComparator implements Comparator<FoodItems>{

	@Override
	public int compare(FoodItems object1, FoodItems object2) {
		if(object1.getQuantity()<object2.getQuantity()) return 1;
		if(object1.getQuantity()>object2.getQuantity())return -1;
		return 0;
	}

	
	
}