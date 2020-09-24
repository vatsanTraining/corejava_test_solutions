package com.training.utils;

import java.util.Comparator;

import com.training.models.Electronics;
import com.training.models.FoodItems;

public class QuantityComparator3 implements Comparator<Electronics>{

	@Override
	public int compare(Electronics object1, Electronics object2) {
		if(object1.getQuantity()<object2.getQuantity()) return 1;
		if(object1.getQuantity()>object2.getQuantity())return -1;
		return 0;
	}

	
	
}