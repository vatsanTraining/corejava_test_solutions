/**
 * 
 */
package com.training.services;

import java.util.ArrayList;
import java.util.Collections;

import com.training.entity.Apparel;
import com.training.entity.Electronic;
import com.training.entity.FoodItem;
import com.training.ifaces.ReportDAO;

/**
 * @author manan
 *
 */
public class ReportDAOImplement implements ReportDAO {

	
	private ArrayList<FoodItem> foodItems = null;
	private ArrayList<Apparel>  apparels= null;
	private ArrayList<Electronic> electronics = null;
	/**
	 * 
	 */
	public ReportDAOImplement() {
		super();
		// TODO Auto-generated constructor stub
		foodItems = new ArrayList<FoodItem>();
		apparels = new ArrayList<Apparel>();
		electronics = new ArrayList<Electronic>();
	}

	@Override
	public int createItem(String choice) throws Exception {
		// TODO Auto-generated method stub
		choice = choice.toLowerCase();
		switch (choice) {
		case "fooditem":
			return 1;
			
		case "apparel":
			return 2;
			
		case "electronics":
			return 3;
			
		default:
			throw new Exception("This category does not exist.");
		}
		
	}

	@Override
	public void addFoodItem(FoodItem foodItem) {
		// TODO Auto-generated method stub
		foodItems.add(foodItem);
	}

	@Override
	public void addElectronic(Electronic electronic) {
		// TODO Auto-generated method stub
		electronics.add(electronic);
	}

	@Override
	public void addApparel(Apparel apparel) {
		// TODO Auto-generated method stub
		apparels.add(apparel);
	}

	@Override
	public ArrayList<?> generateReport(String category) throws Exception {
		// TODO Auto-generated method stu
		category = category.toLowerCase();
		switch (category) {
		case "fooditem":
			
			Collections.sort(this.foodItems);
			return this.foodItems;
			
		case "apparel":
			Collections.sort(this.apparels);
			return this.apparels;
			
		case "electronics":
			Collections.sort(this.electronics);
			return this.electronics;
			
		default:
			throw new Exception("This category does not exist.");
		}
	}

}
