/***
 * author:Raghav Kamra
 * Purpose:Main Class
 * 
 */


package com.training.services;

import java.util.TreeSet;

import com.training.models.Apparel;
import com.training.models.Electronics;
import com.training.models.FoodItems;
import com.training.utils.QuantityComparator;
import com.training.utils.QuantityComparator2;
import com.training.utils.QuantityComparator3;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FoodItems food1=new FoodItems(1001,"Biscuit",100,"08-04-20","08-10-20","Yes",50);
		
		FoodItems food2=new FoodItems(1003,"Snacks",200,"18-05-20","18-12-20","Yes",100);
		
		FoodItems food3=new FoodItems(1005,"Juice",300,"11-03-20","11-05-20","Yes",75);
		
		FoodItems food4=new FoodItems(1007,"Drinks",400,"14-02-20","14-11-20","Yes",200);
		
		TreeSet<FoodItems> treeFood=new TreeSet<FoodItems>(new QuantityComparator());
		
		Apparel app1=new Apparel(2003,"Jeans",600,30,"Cotton",100);
		
		Apparel app2=new Apparel(2006,"Sweater",1000,32,"Woolen",200);
		
		Apparel app3=new Apparel(2007,"Shirt",400,32,"Cotton",400);
		
		Apparel app4=new Apparel(2010,"Pants",700,28,"Cotton",500);
		
		TreeSet<Apparel> treeApp=new TreeSet<Apparel>(new QuantityComparator2());
		
		treeApp.add(app1);
		
		treeApp.add(app2);
		
		treeApp.add(app3);
		
		treeApp.add(app4);
		
		treeFood.add(food1);
		
		treeFood.add(food2);
		
		treeFood.add(food3);
		
		treeFood.add(food4);
		
		
		
		Electronics elec1 = new Electronics(3003,"TV",40000,24,50);
		
		Electronics elec2 = new Electronics(3005,"Fridge",30000,36,100);
		
		Electronics elec3 = new Electronics(3007,"Washing Machine",20000,60,200);
		
		Electronics elec4 = new Electronics(3010,"AC",25000,48,210);
		
		TreeSet<Electronics> treeElec=new TreeSet<Electronics>(new QuantityComparator3());
		
		
		treeElec.add(elec1);
		
		treeElec.add(elec2);
		
		treeElec.add(elec3);
		
		treeElec.add(elec4);
		
		for(FoodItems each:treeFood) {
			System.out.println(each);
		}
		
		for(Apparel each:treeApp) {
			System.out.println(each);
		}
		
		for(Electronics each:treeElec) {
			System.out.println(each);
		}
		
	}

}
