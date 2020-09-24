package com.practical.utils;

import java.util.Comparator;

import com.practical.entity.Apparel;


public class ApparelQuantityComparator implements Comparator<Apparel> {

	@Override
	public int compare(Apparel apparel1, Apparel apparel2) {
		// TODO Auto-generated method stub
		if(apparel1.getQuantitySold()<apparel2.getQuantitySold()) return -1;
		if(apparel1.getQuantitySold()>apparel2.getQuantitySold()) return 1;
		return 0;
	}

}
