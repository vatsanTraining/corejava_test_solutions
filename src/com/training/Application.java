package com.training;

import java.util.ArrayList;
import java.util.Collection;

import com.training.daos.ProductDaoImpl;
import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;

public class Application {
	
//	method to print the top three items of a list
	public static void printList(ArrayList<?> list){
		for(int i=list.size()-1;i>=list.size()-3;i--){
			System.out.println(list.get(i));
		}
	}
	
	
	public static void main(String args[]){
		FoodItems milk= new FoodItems(101, "milk", 32, 20, "yes");
		FoodItems curd= new FoodItems(102, "curd", 20, 50, "YEs");
		FoodItems cake=new FoodItems(111, "Cake", 200, 20, "no");
		Apparel shirt=new Apparel(201, "shirt", 30, 2000, "Medium", "Cotton");
		Apparel tshirt=new Apparel(202,"T-shirt",20,600,"Medium","Cotton");
		Apparel sweater = new Apparel(203,"Sweater",13,5000,"Large","Woolen");
		Electronics tv= new Electronics(301, "TV", 40, 10,20000);
		Electronics mobile=new Electronics(304, "Mobile", 23, 24,30000);
		Electronics watch=new Electronics(305, "Watch", 40,18,23000);
		
		ProductDaoImpl service= new ProductDaoImpl();
		service.addApparel(sweater);service.addApparel(tshirt);service.addApparel(shirt);
		service.addElectronics(watch);service.addElectronics(mobile);service.addElectronics(tv);
		service.addFood(cake);service.addFood(curd);service.addFood(milk);
		
		service.sort();
		
		ArrayList<?> list1= service.returnAll("food items");
		printList(list1);
		
		ArrayList<?> list2=service.returnAll("electronics");
		printList(list2);
		
	}
}
