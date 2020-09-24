package com.training.ifaces;

import java.util.ArrayList;

import com.training.entity.Apparel;
import com.training.entity.Electronic;
import com.training.entity.FoodItem;


public interface ProductServiceDAO {

	String APPNAME = "Report Generator System";
	
	
	void addFoodItem(FoodItem foodItem);
	
	void addElectronic(Electronic electronic);
	
	void addApparel(Apparel apparel);
	
	int createItemList(String choice) throws Exception;
	
	ArrayList<?> generateReport(String category) throws Exception;
}