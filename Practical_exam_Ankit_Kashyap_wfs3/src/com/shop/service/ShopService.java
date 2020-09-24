/**
 * This is aservice class used for implementing methods declared in interface shopDAO.
 */
package com.shop.service;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.shop.DAO.ShopDAO;
import com.shop.models.Apparel;
import com.shop.models.Electronics;
import com.shop.models.FoodItems;
import com.shop.models.Items;


/**
 * @author ankit
 *
 */
public class ShopService implements ShopDAO {
	ArrayList<FoodItems> foodList=new ArrayList<FoodItems>();
	
	ArrayList<Apparel> apparelList=new ArrayList<Apparel>();
	
	ArrayList<Electronics> electronicsList=new ArrayList<Electronics>();
	
	public Items getProduct(int key ) {
		switch(key) {
		
		case 1:
			return new FoodItems();
		case 2:
			return new Apparel();
		case 3: 
			return new Electronics();
		default:
			return null;
		
		}
	}

	@Override
	public boolean addItems(FoodItems items) {
		
		try {
			if(foodList.contains(items))
			{
				System.out.println("cannot add repeated items");
			}
			return foodList.add(items);
			
		} catch (Exception e) {
			e.getMessage();
		}
		return foodList.add(items);
		
	}
	@Override
	public boolean addItems(Apparel items) {
		try {
			if(apparelList.contains(items))
			{
				System.out.println("cannot add ");
			}
			return apparelList.add(items);
		}  catch (Exception e) {
			e.getMessage();
		}
		return apparelList.add(items);
	}

	@Override
	public boolean addItems(Electronics items) {
	
		return electronicsList.add(items);
	}

	@Override
	public ArrayList<FoodItems> retrievefood() {
		// TODO Auto-generated method stub
		return foodList;
	}

	@Override
	public ArrayList<Apparel> retrieveApparel() {
		// TODO Auto-generated method stub
		return apparelList;
	}

	@Override
	public ArrayList<Electronics> retrieveElectronic() {
		// TODO Auto-generated method stub
		return electronicsList;
	}

//	public Collection<Items> sortedByQuantity(int key) {
//		if(key==1) {
//			Collections.sort(foodList[0]);
//		}
//		if(key==2)
//		{
//			
//		}
//		 
//	}
   
	

}
