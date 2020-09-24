/**
 * 
 */
package com.training.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Pallavi Rani
 *
 */

//this interface contains abstract methods for adding items to list and producing sales report
public interface RetailServices {

	boolean addFood(ArrayList<FoodItems> list,FoodItems obj);
	boolean addApparel(ArrayList<Apparel> list,Apparel obj);
	boolean addElectronics(ArrayList<Electronics> list,Electronics obj);
	List<FoodItems> salesReportFood(List<FoodItems>  foodList);
	List<Apparel> salesReportApparel(List<Apparel>  apparelList);
	List<Electronics> salesReportElectronics(List<Electronics>  electronicList);
	
}
