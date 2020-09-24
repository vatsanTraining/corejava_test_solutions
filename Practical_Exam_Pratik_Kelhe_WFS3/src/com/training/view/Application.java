//Main function to rerieve report

/**
 * 
 */
package com.training.view;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeSet;

import com.training.dao.ProductFactory;
import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;
import com.training.ifaces.Product;

/**
 * @author Pratik Kelhe
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int category;
		TreeSet<Product> report = new TreeSet<Product>();
		
		ProductFactory GoodProducts = new ProductFactory();
		
		FoodItems apple = new FoodItems(100, "apple", 30, "20/9/2020", "25/9/2020", "yes");
		GoodProducts.addFoodItems(apple);
		Electronics tv = new Electronics(102, "sharp", 40000, 24, 100);
		GoodProducts.addElectronics(tv);
		Apparel shirt = new Apparel(103, "polo", 1000, "medium", "nylon", 300);
		GoodProducts.addApparel(shirt);
		Product product = null;
		
		try {
			
			//Retrieving report based on choice
			System.out.println("Please select a category");
			System.out.println("1.FoodItems \n2.Apparel \n3.Electronics");
			
			category = input.nextInt();
			
//			product = GoodProducts.getProduct(category);
			if(category == 1) {
			report = GoodProducts.retrieveReport("foodItems");
			}else if(category == 2) {
				report = GoodProducts.retrieveReport("electronics");
			}else if(category == 2) {
				report = GoodProducts.retrieveReport("apparel");
			}
			System.out.println("Report for prodcut of category" + category + "is " + report );
		}catch(NoSuchElementException e) {
			System.out.println("Reports are not available");
		} 
		catch (NullPointerException e) {
			
			System.out.println("Data trying to access is not present");
		}	catch (Exception e) {
			System.out.println("Invalid operation");
		}
		
		
	}

}
