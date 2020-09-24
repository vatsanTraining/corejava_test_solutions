package com.training.comparators;

import java.util.Comparator;

import com.training.entity.Electronics;

public class ReportElectronicItems implements Comparator<Electronics> {

	@Override
	public int compare(Electronics o1, Electronics o2) {
		if(o1.getQuantity()>o2.getQuantity()) return -1;
		if(o1.getQuantity()<o2.getQuantity()) return 1;
		return 0;
	}

}
