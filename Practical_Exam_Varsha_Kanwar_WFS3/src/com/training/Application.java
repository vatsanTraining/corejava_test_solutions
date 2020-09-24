package com.training;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.training.daos.DaoImplementation;
import com.training.entity.*;
import com.training.interfaces.ProductsDAO;

public class Application {
	
	
	public static void main(String[] args) {
	
		FoodItems milk = new FoodItems(101, "milk", 50," 07/07/20", "08/07/20", "yes", 10);
		FoodItems curd = new FoodItems(102, "curd", 60," 07/08/20", "08/08/20", "yes", 15);
		FoodItems cake = new FoodItems(103, "cake", 100," 07/07/20", "08/09/20", "no", 25);
		
		Apparel shirt = new Apparel(101,"shirt", 300,"small", "cotton",5);
		Apparel sweater = new Apparel(102,"sweator", 600,"small", "wool",15);
		Apparel tShirt = new Apparel(103,"T-shirt", 200,"medium", "silk",10);
		
		
		Electronics tv = new Electronics(123, "tv", 10000, 12,2);
		Electronics mobile = new Electronics(133, "mobile", 15000, 2,5);
		Electronics watch = new Electronics(126, "watch", 1000, 10,8);
		
		ProductsDAO service = new DaoImplementation();
		service.add(milk);
		service.add(curd);
		service.add(cake);
		service.add(shirt);
		service.add(sweater);
		service.add(tShirt);
		service.add(tv);
		service.add(mobile);
		service.add(watch);
		
		System.out.println("Enter the category for which you want the report: ");
		System.out.println("1.FoodItems  2.Apparel  3.Electronics");
		Scanner scanner = new Scanner(System.in);
		int category = scanner.nextInt();
		service.getReport(category);
		
		
		
	   
	}

}
