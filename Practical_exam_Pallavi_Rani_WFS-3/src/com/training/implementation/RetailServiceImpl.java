/**
 * 
 */
package com.training.implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;
import com.training.entity.RetailServices;

/**
 * @author Pallavi Rani
 *
 */

// this is the implementation of our Retail service DAO
// It overrides all th methods of the RetailService Interface
public class RetailServiceImpl implements RetailServices {

	@Override
	public boolean addFood(ArrayList<FoodItems> list, FoodItems obj) {
		list.add(obj);
		return true;
	}
	@Override
	public boolean addApparel(ArrayList<Apparel> list, Apparel obj) {
		list.add(obj);
		return true;
	}
	@Override
	public boolean addElectronics(ArrayList<Electronics> list, Electronics obj) {
		list.add(obj);
		return true;
	}

	@Override
	public List<FoodItems> salesReportFood(List<FoodItems> foodList) {
		Collections.sort( foodList,Collections.reverseOrder());
		List<FoodItems> top3=((List) foodList).subList(foodList.size()-3,foodList.size());
		return top3;
	}

	@Override
	public List<Apparel> salesReportApparel(List<Apparel> apparelList) {
		Collections.sort(apparelList,Collections.reverseOrder());
		List<Apparel> top3=((List) apparelList).subList(apparelList.size()-3,apparelList.size());
		return top3;
	}

	@Override
	public List<Electronics> salesReportElectronics(List<Electronics> electronicList) {
		Collections.sort((List<Electronics>) electronicList,Collections.reverseOrder());
		List<Electronics> top3=((List) electronicList).subList(electronicList.size()-3,electronicList.size());
		return top3;
	}


}
