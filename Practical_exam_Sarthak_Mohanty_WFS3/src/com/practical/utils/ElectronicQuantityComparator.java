package com.practical.utils;

import java.util.Comparator;

import com.practical.entity.Electronics;


public class ElectronicQuantityComparator implements Comparator<Electronics> {

	@Override
	public int compare(Electronics Electronic1, Electronics Electronic2) {
		// TODO Auto-generated method stub
		if(Electronic1.getQuantitySold()<Electronic2.getQuantitySold()) return -1;
		if(Electronic1.getQuantitySold()>Electronic2.getQuantitySold()) return 1;
		return 0;
	}

}
