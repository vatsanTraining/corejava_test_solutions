package com.training.ifaces;
import java.util.*;

import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;

public interface ProductDao {
	
	boolean addFood(FoodItems food);
	boolean addApparel(Apparel apparel);
	boolean addElectronics(Electronics electronics);
	void sort();
	ArrayList<?> returnAll(String prod);

}
