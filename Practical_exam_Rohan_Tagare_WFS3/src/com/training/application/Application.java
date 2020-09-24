
/*
 * author Rohan Tagare
 * batch WFS-3
 */


package com.training.application;

import com.training.entity.FoodItems;

import java.util.Scanner;

import com.training.dao.ProductImpl;
import com.training.entity.Apparel;
import com.training.entity.Electronics;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in); 
		
		ProductImpl service=new ProductImpl();
		
		FoodItems cake=new FoodItems(100,"cake",100.0,10,"20/4/2020","20/5/2020",true);
		FoodItems bread=new FoodItems(101,"bread",200.0,20,"21/4/2020","21/5/2020",true);
		FoodItems toast=new FoodItems(102,"toast",300.0,30,"22/4/2020","22/5/2020",true);
		FoodItems milk=new FoodItems(103,"milk",400.0,40,"23/4/2020","23/5/2020",true);
		FoodItems curd=new FoodItems(104,"curd",500.0,50,"24/4/2020","24/5/2020",true);
		
		
		Apparel shirt=new Apparel(200,"shirt",100.0,10,"small","cotton");
		Apparel tshirt=new Apparel(201,"tshirt",200.0,20,"medium","woolen");
		Apparel pant=new Apparel(202,"pant",300.0,30,"large","cotton");
		Apparel sweater=new Apparel(203,"sweater",400.0,40,"small","woolen");
		Apparel hood=new Apparel(204,"hood",500.0,50,"medium","cotton");
		
		
		Electronics tv=new Electronics(300,"tv",100.0,10,11);
		Electronics mobile=new Electronics(301,"mobile",100.0,20,12);
		Electronics laptop=new Electronics(302,"laptop",100.0,30,13);
		Electronics fridge=new Electronics(303,"fridge",100.0,40,21);
		Electronics ac=new Electronics(304,"ac",100.0,50,15);
		
		
		service.addFoodItem(cake);
		service.addFoodItem(bread);
		service.addFoodItem(toast);
		service.addFoodItem(milk);
		service.addFoodItem(curd);
		
		
		
		service.addApparel(shirt);
		service.addApparel(tshirt);
		service.addApparel(pant);
		service.addApparel(sweater);
		service.addApparel(hood);
		
		
		service.addElectronic(tv);
		service.addElectronic(mobile);
		service.addElectronic(laptop);
		service.addElectronic(fridge);
		service.addElectronic(ac);
		
		System.out.println("enter choice\nfood\napparel\nelectronics");
		String ch=sc.next();
		
		switch(ch)
		{
		case "food":
			System.out.println(service.getTopThreeFoodItems());
			break;
		case "apparel":
			System.out.println(service.getTopThreeApparel());
			break;
		case "electronics":
			System.out.println(service.getTopThreeElectronics());
			break;
		default:
			System.out.println("select from given choices");
			
			
		}
	}

}
