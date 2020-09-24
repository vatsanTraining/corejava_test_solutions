package com.training.comparators;

import java.util.Comparator;

import com.training.entity.Apparel;

public class ReportApparel implements Comparator<Apparel> {

	@Override
	public int compare(Apparel o1, Apparel o2) {
		if(o1.getQuantity()>o2.getQuantity()) return -1;
		if(o1.getQuantity()<o2.getQuantity()) return 1;
		return 0;
	}

}
