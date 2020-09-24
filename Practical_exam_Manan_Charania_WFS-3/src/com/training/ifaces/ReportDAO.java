/**
 * 
 */
package com.training.ifaces;

import java.util.ArrayList;

import com.training.entity.Apparel;
import com.training.entity.Electronic;
import com.training.entity.FoodItem;

/**
 * @author manan
 *
 */
public interface ReportDAO {

	String APPNAME = "Report Generator For EveryDay GoodProducts";
	
	int createItem(String choice) throws Exception;
	void addFoodItem(FoodItem foodItem);
	void addElectronic(Electronic electronic);
	void addApparel(Apparel apparel);
	ArrayList<?> generateReport(String category) throws Exception;
}
