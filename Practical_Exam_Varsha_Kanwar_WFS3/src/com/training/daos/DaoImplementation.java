package com.training.daos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;
import com.training.interfaces.ProductsDAO;

public class DaoImplementation implements ProductsDAO {
	 
	private List<FoodItems> FoodItemsList;
	private List<Apparel> ApparelList;
	private List <Electronics> ElectronicsList;
	

	public DaoImplementation() {
		super();
		this.FoodItemsList = new ArrayList<FoodItems>();
		this.ApparelList = new ArrayList<Apparel>();
		this.ElectronicsList = new ArrayList<Electronics>();
		
	}

	public boolean add(FoodItems entity) {
		try{
			if(FoodItemsList.contains(entity))
				throw new Exception();
			
		} 
		catch(Exception e){
			System.out.println("Duplicate Record !");
			e.printStackTrace();
		}
		
		return this.FoodItemsList.add(entity);
	}

	public boolean add(Apparel entity) {
		// TODO Auto-generated method stub
		try{
			if(ApparelList.contains(entity))
				throw new Exception();
			
		} 
		catch(Exception e){
			System.out.println("Duplicate Record !");
			e.printStackTrace();
		}
		return this.ApparelList.add(entity);
	}

	public boolean add(Electronics entity) {
		// TODO Auto-generated method stub
		try{
			if(ElectronicsList.contains(entity))
				throw new Exception();
			
		} 
		catch(Exception e){
			System.out.println("Duplicate Record !");
			e.printStackTrace();
		}
		return this.ElectronicsList.add(entity);
	}

	public Collection<FoodItems> getAllFoodItems() {
		// TODO Auto-generated method stub
		return this.FoodItemsList;
	}

	public Collection<Apparel> getAllApparel() {
		// TODO Auto-generated method stub
		return this.ApparelList;
	}

	public Collection<Electronics> getAllElectronics() {
		// TODO Auto-generated method stub
		return this.ElectronicsList;
	}

	public void getReport(int key) {
		int j =0;
		try{
		switch (key) {
		case 1:
			 Collections.sort(this.FoodItemsList);
			 List<FoodItems> FoodItemsReport = new ArrayList<FoodItems>();
			
			for(FoodItems eachFoodItems: this.FoodItemsList)
			{
				while(j<3)
				{
					System.out.println(eachFoodItems);
					j++;
				}
			} 
			
			break;

		case 2:
			Collections.sort(this.ApparelList);
			 List<Apparel> ApparelReport = new ArrayList<Apparel>();
			for(Apparel eachApparel: this.ApparelList)
			{
				while(j<3)
				{
					System.out.println(eachApparel);
					j++;
				}
			} 
			break;
		case 3:
			Collections.sort(this.ElectronicsList);
			List<Electronics> electronicsReport = new ArrayList<Electronics>();
			for(Electronics eachElectronic : this.ElectronicsList)
			{
				while(j<3)
				{	System.out.println(eachElectronic);
					j++;
				}
			} 
			break;
		default:
			throw new Exception();
			
		} 
		}
		catch(Exception e)
		{
			System.out.println("No such Category");
			e.printStackTrace();
		}
	 
	

	
	}

	
	
	

}
