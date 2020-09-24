/**
 * 
 */
package com.shop.application;

import java.util.ArrayList;
import java.util.Collections;

import com.shop.models.Apparel;
import com.shop.models.Electronics;
import com.shop.models.FoodItems;
import com.shop.models.Items;
import com.shop.service.ShopService;

/**
 * @author Ankit Kashyap
 * This class has been created to check the implementaion of all other classes and their methods.
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<FoodItems> foods=new ArrayList<FoodItems>();
		ArrayList<Apparel> apparels =new ArrayList<Apparel>();
		ArrayList<Electronics> electronics=new ArrayList<Electronics>();
		ShopService service = new ShopService();
		
		FoodItems maggi=new FoodItems(101, "Maggi", 12, 4, "12-sept-2019", "12-sept-2021", "Yes");
		FoodItems milk=new FoodItems(121, "Amul", 22, 42, "12-sept-2019", "12-sept-2021", "Yes");
		FoodItems chicken=new FoodItems(651, "xyz", 56, 9, "12-sept-2019", "12-sept-2021", "No");
		FoodItems egg=new FoodItems(3211, "abc", 7, 49, "12-sept-2019", "12-sept-2021", "No");
		
		service.addItems(maggi);
		service.addItems(milk);
		service.addItems(egg);
		service.addItems(chicken);
		
		Apparel pant=new Apparel(111,"denim", 500, 5,48, "cotton");
		Apparel pant2=new Apparel(211,"levis", 400, 4,48, "cotton");
		Apparel pant3=new Apparel(311,"sparky", 5900, 3,41, "woolen");
		Apparel pant4=new Apparel(411,"kjhfjhf", 2500, 3,48, "cotton");
		
		service.addItems(pant);
		service.addItems(pant2);
		service.addItems(pant3);
		service.addItems(pant4);
		
		Electronics tv=new Electronics(23, "sony", 12000,3);
		Electronics tv2=new Electronics(54, "nokia", 12000,6);
		Electronics tv3=new Electronics(56, "samsung", 12000,9);
		
		service.addItems(tv);
		service.addItems(tv);
		service.addItems(tv);
		
		foods=service.retrievefood();
		apparels=service.retrieveApparel();
		electronics=service.retrieveElectronic();
		
		System.out.println(foods);
		System.out.println(apparels);
		System.out.println(electronics);
		
		System.out.println("Sorting by quantity and printing ");
		
		Collections.sort(foods);
		System.out.println(foods);
		
		
		
	}

}
