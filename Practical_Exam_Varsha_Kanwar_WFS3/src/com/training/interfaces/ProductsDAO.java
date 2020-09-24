package com.training.interfaces;
import java.util.Collection;

import com.training.entity.*;

public interface ProductsDAO {
	
	boolean add(FoodItems entity);
	boolean add(Apparel entity);
	boolean add(Electronics entity);
	
	Collection<FoodItems> getAllFoodItems();
	Collection<Apparel> getAllApparel();
	Collection<Electronics> getAllElectronics();
	
	void getReport(int key);
	

}