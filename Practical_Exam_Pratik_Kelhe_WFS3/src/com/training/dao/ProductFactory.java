/**
 * Name - Pratik Kelhe
 */
// To add and retrieve product reports

package com.training.dao;

import java.util.NoSuchElementException;
import java.util.TreeSet;

import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;
import com.training.ifaces.Product;

/**
 * @author Pratik Kelhe
 *
 */
public class ProductFactory {
	
	TreeSet<Product> dataFoodItems = new TreeSet<Product>();
	TreeSet<Product> dataApparel = new TreeSet<Product>();
	TreeSet<Product> dataElectronics = new TreeSet<Product>();
	
	public Product getProduct(int key) {
		
		switch (key) {
		case 1:
			
			return new FoodItems();

		case 2:
			return new Apparel();
		case 3:
			return new Electronics();
		default:
			
			return null;
		}

	}
	public void addFoodItems(Product food) {

		dataFoodItems.add(food);

	}
	public void addElectronics(Product electronics) {
		
		dataElectronics.add(electronics);

	}
	public void addApparel(Product apparel) {
		
		dataElectronics.add(apparel);

	}
	
	public TreeSet<Product>  retrieveReport(String input) throws NoSuchElementException {
		if(input.equalsIgnoreCase("foodItem")) {
			return dataFoodItems;
		}else if(input.equalsIgnoreCase("electronics"))  {
			return dataElectronics;
		}else if(input.equalsIgnoreCase("apparel")) {
			return dataElectronics;
		} else {
			return null;
		}
		
	}
	
}