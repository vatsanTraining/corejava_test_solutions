package com.training.utils;

import java.util.Comparator;

import com.training.models.Apparel;
import com.training.models.FoodItems;

public class QuantityComparator2 implements Comparator<Apparel>{

	@Override
	public int compare(Apparel object1, Apparel object2) {
		if(object1.getQuantity()<object2.getQuantity()) return 1;
		if(object1.getQuantity()>object2.getQuantity())return -1;
		return 0;
	}

	
	
}