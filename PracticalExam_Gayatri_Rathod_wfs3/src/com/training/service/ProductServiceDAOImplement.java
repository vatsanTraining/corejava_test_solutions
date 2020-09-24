package com.training.service;

import java.util.ArrayList;
import java.util.Collections;

import com.training.entity.Apparel;
import com.training.entity.Electronic;
import com.training.entity.FoodItem;
import com.training.ifaces.ProductServiceDAO;


public class ProductServiceDAOImplement implements ProductServiceDAO {

	
	private ArrayList<FoodItem> foodItems = null;
	private ArrayList<Apparel>  apparels= null;
	private ArrayList<Electronic> electronics = null;
	
	public ProductServiceDAOImplement() {
		super();
		
		foodItems = new ArrayList<FoodItem>();
		apparels = new ArrayList<Apparel>();
		electronics = new ArrayList<Electronic>();
	}

	@Override
	public int createItemList(String choice) throws Exception {
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
			throw new Exception("Choose category from list: 1 , 2 or 3 ");
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
			throw new Exception("Choose category from list: 1 , 2 or 3 ");
		}
	}

}