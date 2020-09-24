package com.training.utils;

import java.util.Comparator;

import com.training.model.Product;

public class QuantityComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getQuantity()<p2.getQuantity())return 1;
		else if(p1.getQuantity()>p2.getQuantity())return -1;
		return 0;
	}

}
