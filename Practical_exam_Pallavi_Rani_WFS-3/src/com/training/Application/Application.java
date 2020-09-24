/**
 * 
 */
package com.training.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;
import com.training.entity.RetailServices;
import com.training.implementation.RetailServiceImpl;

/**
 * @author Pallavi Rani
 *
 */
//This is the main method which takes input and passes the object to service class methods
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//Use of ArrayList collection class to store data
		ArrayList<FoodItems> foodList=new ArrayList<>();
		ArrayList<Apparel> apparelList=new ArrayList<>();
		ArrayList<Electronics> electronicsList=new ArrayList<>();
		
//Initializing values using constructor
		FoodItems food1=new FoodItems(1,"corn",45.00,"11-04-19","11-06-19","yes",5);
		FoodItems food2=new FoodItems(1,"corn",45.00,"11-04-19","11-06-19","yes",5);
		FoodItems food3=new FoodItems(1,"corn",45.00,"11-04-19","11-06-19","yes",5);
		FoodItems food4=new FoodItems(1,"corn",45.00,"11-04-19","11-06-19","yes",5);
		Apparel cloth1=new Apparel(11,"jeans",700.00,"small","cotton",3);
		Apparel cloth2=new Apparel(12,"top",900.00,"small","cotton",10);
		Apparel cloth3=new Apparel(13,"hoodie",70.00,"small","cotton",1);
		Apparel cloth4=new Apparel(14,"blazer",7000.00,"small","cotton",13);
		Electronics device1=new Electronics(100,"oven",2500.00,4,2);
		Electronics device2=new Electronics(101,"fridge",2500.00,4,12);
		Electronics device3=new Electronics(102,"tv",2500.00,4,20);
		Electronics device4=new Electronics(103,"heater",2500.00,4,30);
		
	List<FoodItems> foodReport=new ArrayList<>();
	List<Apparel> apparelReport=new ArrayList<>();
	List<Electronics> electronicReport=new ArrayList<>();
//use of switch case for user to choose between FoodItems, Apparels, Electronics
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
	try {
		RetailServiceImpl service=new RetailServiceImpl();
	
		switch (key) {
		
		
		case 1: service.addFood(foodList,food1 );
				service.addFood(foodList,food2 );
				service.addFood(foodList,food3 );
				service.addFood(foodList,food4 );
				foodReport=service.salesReportFood(foodList);
				break ;
		case 2: service.addApparel(apparelList,cloth1 );
				service.addApparel(apparelList,cloth2 );
				service.addApparel(apparelList,cloth3 );
				service.addApparel(apparelList,cloth4 );
				apparelReport=service.salesReportApparel(apparelList);
				break ;	
		case 3: service.addElectronics(electronicsList,device1 );
				service.addElectronics(electronicsList,device2 );
				service.addElectronics(electronicsList,device3 );
				service.addElectronics(electronicsList,device4 );
				electronicReport=service.salesReportElectronics(electronicsList);
				break ;	

		default:
			System.out.println("Wrong choice");
		}
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
