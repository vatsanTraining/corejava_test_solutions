package com.training.daos;

import java.util.*;

import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;
import com.training.ifaces.ProductDao;

public class ProductDaoImpl implements ProductDao {
	
//	using hashset from collection to eliminate duplications
	
	HashSet<Electronics> electronicSet = new HashSet<Electronics>();
	HashSet<FoodItems> foodSet=new HashSet<FoodItems>();
	HashSet<Apparel> apparelSet= new HashSet<Apparel>();
	
	ArrayList<Apparel> appList=null;
	ArrayList<FoodItems> foodList=null;
	ArrayList<Electronics> elecList=null;
	
	
	@Override
	public boolean addFood(FoodItems food) {
		// TODO Auto-generated method stub
		return foodSet.add(food);
	}
	@Override
	public boolean addApparel(Apparel apparel) {
		// TODO Auto-generated method stub
		return apparelSet.add(apparel);
	}
	@Override
	public boolean addElectronics(Electronics electronics) {
		// TODO Auto-generated method stub
		return electronicSet.add(electronics);
	}
	
//	Coverting the hashset to arraylist so that sort from collections class can be used
	
	@Override
	public void sort(){
		foodList= new ArrayList<FoodItems>(foodSet);
		elecList= new ArrayList<Electronics>(electronicSet);
		appList= new ArrayList<Apparel>(apparelSet);
		Collections.sort(foodList);
		Collections.sort(elecList);
		Collections.sort(appList);		
	}
	
//	method to return any type of list asked by the user
	
	@Override
	public ArrayList<?> returnAll(String prod) {
		if(prod.equalsIgnoreCase("Food items")){
			return foodList;
		}else if(prod.equalsIgnoreCase("Electronics")){
			return elecList;
		}else if(prod.equalsIgnoreCase("Apparel")){
			return appList;
		}
		return null;
	}
	

}
