package com.training.comparators;

import java.util.Comparator;

import com.training.entity.FoodItems;

public class ReportFoodItem implements Comparator<FoodItems> {

	@Override
	public int compare(FoodItems o1, FoodItems o2) {
		if(o1.getQuantity()>o2.getQuantity()) return -1;
		if(o1.getQuantity()<o2.getQuantity()) return 1;
		return 0;
	}

}
