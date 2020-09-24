/**
 * 
 */
package com.training.application;

import java.util.Scanner;

import com.training.daoimplementation.ApparelDAOImpl;
import com.training.daoimplementation.ElectronicsDAOImpl;
import com.training.daoimplementation.FoodItemsDAOImpl;
import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;

/**
 * @author Shreyas S Tekawade
 * @Purpose Testing and checking the add and sort functions of the classes
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Electronics tv = new Electronics(101, "TV", 22, 10, 1000);
		Electronics fan = new Electronics(102, "FAN", 22, 10, 10002);
		Electronics ac = new Electronics(103, "AC", 22, 10, 31000);
		ElectronicsDAOImpl eleDoa = new ElectronicsDAOImpl();
		eleDoa.addElectronicItem(ac);
		eleDoa.addElectronicItem(fan);
		eleDoa.addElectronicItem(tv);
		
		
		Apparel jeans = new Apparel(101, "jeans", 1000, 38, "woolen", 1000);
		Apparel shirt = new Apparel(102, "shirt", 1000, 38, "woolen", 41000);
		Apparel top = new Apparel(103, "top", 1000, 38, "woolen", 12000);
		ApparelDAOImpl apaDoa = new ApparelDAOImpl();
		apaDoa.addApparel(top);
		apaDoa.addApparel(shirt);
		apaDoa.addApparel(jeans);
		
		FoodItems cake = new FoodItems(101, "cake", 2000, "09/19", "09/20", false, 1000);
		FoodItems pizza = new FoodItems(102, "pizza", 2000, "09/19", "09/20", false, 15000);
		FoodItems tea = new FoodItems(103, "tea", 2000, "09/19", "09/20", true, 12000);
		FoodItemsDAOImpl foodDoa = new FoodItemsDAOImpl();
		foodDoa.addFoodItem(tea);
		foodDoa.addFoodItem(pizza);
		foodDoa.addFoodItem(cake);
		
		
		Scanner sck = new Scanner(System.in);
		System.out.println("Press 1 for Electronics Report");
		System.out.println("Press 2 for Fooditem Report");
		System.out.println("Press 3 for Apparel Report");
		
		int key = sck.nextInt();
		switch (key) {
		case 1:
			System.out.println(eleDoa.ReportElectronicItems());
			break;
		case 2:
			System.out.println(foodDoa.ReportFoodItem());
			break;
		case 3:
			System.out.println(apaDoa.ReportApparel());
			break;

		default:
			System.out.println("Wrong Input Please Try Later");
			break;
		}
	}

}
