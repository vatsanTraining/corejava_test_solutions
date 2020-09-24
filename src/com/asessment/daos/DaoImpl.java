package com.asessment.daos;
import java.util.*;

import com.asessment.exceptions.ItemIDException;
import com.assessment.entity.ApparelEntity;
import com.assessment.entity.ElectronicsEntity;
import com.assessment.entity.FoodItemsEntity;
import com.assessment.ifaces.Dao;

public class DaoImpl implements Dao {
	private ArrayList<FoodItemsEntity> foodList;
	private ArrayList<ApparelEntity> apparelList;
	private ArrayList<ElectronicsEntity> elecList;
	@Override
	public boolean addFood(FoodItemsEntity food) {
		boolean result=false;
		if(!foodList.contains(food)){
		
			try {
				throw new ItemIDException("Item already exists");
			} catch (ItemIDException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				result=false;
			}
		}else{	
		result= this.foodList.add(food);}
		return result;}
	
	@Override
	public boolean addElectronice(ElectronicsEntity elec){
		// TODO Auto-generated method stub
		boolean result=false;
		if(!elecList.contains(elec)){
		
			try {
				throw new ItemIDException("Item already exists");
			} catch (ItemIDException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				result=false;
			}
		}else{	
		result= this.elecList.add(elec);}
		return result;
	}
	@Override
	public boolean addApparel(ApparelEntity apparel){
		// TODO Auto-generated method stub
		boolean result=false;
		if(!apparelList.contains(apparel)){
		
			try {
				throw new ItemIDException("Item already exists");
			} catch (ItemIDException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				result=false;
			}
		}else{	
		result= this.apparelList.add(apparel);}
		return result;
	}
	@Override
	public Collection<FoodItemsEntity> sortFood() {
		// TODO Auto-generated method stub
		Collections.sort(this.foodList);
		return this.foodList;
		
	}
	@Override
	public Collection<ElectronicsEntity> sortElectronics() {
		// TODO Auto-generated method stub
		Collections.sort(this.elecList);
		return this.elecList;
	}
	@Override
	public Collection<ApparelEntity> sortApparel() {
		// TODO Auto-generated method stub
		Collections.sort(this.apparelList);
		return this.apparelList;
	}

	@Override
	public Collection<FoodItemsEntity> findallfood() {
		// TODO Auto-generated method stub
		return this.foodList;
	}

	@Override
	public Collection<ElectronicsEntity> findallelectronics() {
		// TODO Auto-generated method stub
		return this.elecList;
	}

	@Override
	public Collection<ApparelEntity> findallApparel() {
		// TODO Auto-generated method stub
		return this.apparelList;
	}

	
	
	

}
