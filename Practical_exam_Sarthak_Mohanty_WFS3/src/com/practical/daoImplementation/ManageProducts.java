//Author: Sarthak Mohanty
//Contains all the methods

package com.practical.daoImplementation;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import com.practical.dao.ProductsDAO;
import com.practical.entity.Apparel;
import com.practical.entity.Electronics;
import com.practical.entity.FoodItems;
import com.practical.utils.ApparelQuantityComparator;
import com.practical.utils.ElectronicQuantityComparator;
import com.practical.utils.FoodQuantityComparator;


public class ManageProducts implements ProductsDAO {

	
	private TreeSet<Apparel>apparelList=new TreeSet<Apparel>(new ApparelQuantityComparator());
	private TreeSet<Electronics>electronicsList=new TreeSet<Electronics>(new ElectronicQuantityComparator());
	private TreeSet<FoodItems>foodList=new TreeSet<FoodItems>(new FoodQuantityComparator());
	
	@Override
	public Collection<FoodItems> getTopFoodItems() {
		// TO get top three food items		
		TreeSet<FoodItems>food = new TreeSet<FoodItems>();
        int value=0;
        Iterator<FoodItems> iterator = foodList.iterator();
        while (iterator.hasNext() && value<3) {
        	food.add(foodList.first());
        	value++;
        }
            
		return food;
	}
	@Override
	public Collection<Apparel> getTopApparel() {
		// TO get top three apparel items
		TreeSet<Apparel>apparel =new TreeSet<Apparel>();
        Iterator<Apparel> iterator = apparelList.iterator();
        int value=0;
        while (iterator.hasNext() && value<3) {
        	apparel.add(apparelList.first());
        	value++;
        }
            
		return apparel;
	}
	@Override
	public Collection<Electronics> getTopElectronics() {
		// TO get top three electronics items
		TreeSet<Electronics>electronic = new TreeSet<Electronics>();
        int value=0;
        Iterator<Electronics> iterator = electronicsList.iterator();
        while (iterator.hasNext() && value<3) {
        	electronic.add(electronicsList.first());
        	value++;
        }
            
		return electronic;
	}
	@Override
	public boolean addApparel(Apparel apparel) {
		// TO add arranged in value quantity apparels
		boolean check=false;
		if(apparel!=null){
			apparelList.add(apparel);
			check=true;
		}
		
		return check;
	}
	@Override
	public boolean addElectronics(Electronics electronics) {
		// TO add arranged in value quantity electronics
		boolean check=false;
		if(electronics!=null){
			electronicsList.add(electronics);
			check=true;
		}
		
		return check;
	}
	@Override
	public boolean addFoodItems(FoodItems foodItems) {
		// TO add arranged in value quantity food items
		boolean check=false;
		if(foodItems!=null){
			foodList.add(foodItems);
			check=true;
		}
		return check;
	}
	
}
