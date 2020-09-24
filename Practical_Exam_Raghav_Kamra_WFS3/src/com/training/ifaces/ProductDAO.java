/***
 * author:Raghav Kamra
 * Purpose:Interface  for all the method declarations
 * 
 */

package com.training.ifaces;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import com.training.models.Apparel;
import com.training.models.Electronics;
import com.training.models.FoodItems;

public interface ProductDAO {
	
	boolean addNewFood(FoodItems food);
	boolean addNewApparel(Apparel app);
	boolean addNewElectronics(Electronics elec);
	
	Set<Apparel> getApparel();
	Set<Electronics> getElectronics();
	Set<FoodItems> getFood();

}