/***
 * author:Raghav Kamra
 * Purpose:Implementation Class for All Methods
 * 
 */


package com.training.services;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.training.ifaces.ProductDAO;
import com.training.models.Apparel;
import com.training.models.Electronics;
import com.training.models.FoodItems;

public class ProductDaoImpl implements ProductDAO {
	
	private TreeSet<Apparel> app;
	private TreeSet<FoodItems> foodItems;
	private TreeSet<Electronics> elec;
	
	

	public ProductDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean addNewApparel(Apparel app) {
		// TODO Auto-generated method stub
		return this.app.add(app);
	}
//
	@Override
	public boolean addNewElectronics(Electronics elec) {
		// TODO Auto-generated method stub
		return this.elec.add(elec);
	}

	@Override
	public boolean addNewFood(FoodItems food) {
		// TODO Auto-generated method stub
		return this.foodItems.add(food);
	}

	@Override
	public TreeSet<Apparel> getApparel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeSet<Electronics> getElectronics() {
		// TODO Auto-generated method stub
		return null;
	}

	public TreeSet<FoodItems> getFood() {
		// TODO Auto-generated method stub
		return null;
	}

}
