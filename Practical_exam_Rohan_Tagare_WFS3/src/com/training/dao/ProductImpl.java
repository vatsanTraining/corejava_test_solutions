/*
 * author Rohan Tagare
 * batch WFS-3
 * 
 */

package com.training.dao;

import java.util.*;

import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;
import com.training.entity.Product;
import com.training.ifaces.ProductService;


//provides method body
public class ProductImpl implements ProductService {
	
	private Collection<FoodItems> foodItems;
	private Collection<Electronics> electronics;
	private Collection<Apparel> apparels;
	
	public ProductImpl() {
		super();
		// TODO Auto-generated constructor stub
		
		
		//Storing the objects as arraylist collection
		foodItems=new ArrayList<>();
		electronics=new ArrayList<>();
		apparels=new ArrayList<>();
		
	}

	@Override
	public Collection<Electronics> getTopThreeElectronics() {
		// TODO Auto-generated method stub
		
		
		//top 3 objects
		Electronics ele1=new Electronics();
		Electronics ele2=new Electronics();
		Electronics ele3=new Electronics();
		Collection<Electronics> elect =new ArrayList<>();
		
		
		
		try
		{
			if (electronics.size()<3)
			{
				throw new Exception("less than 3 elements present");
			}
			else
			{
				int max=0;
				//first
				for(Electronics ele:electronics)
				{
					if(ele.getQuantity()>max)
					{
						max=ele.getQuantity();
						ele1=ele;
					}
				}
				
				max=0;
				//second
				for(Electronics ele:electronics)
				{
					if(ele.getQuantity()>max&&!ele.equals(ele1))
					{
						max=ele.getQuantity();
						ele2=ele;
					}
				}
				
				max=0;	
				//third
				for(Electronics ele:electronics)
				{
					if(ele.getQuantity()>max && !ele.equals(ele1) && !ele.equals(ele2))
					{
						max=ele.getQuantity();
						ele3=ele;
					}
				}
				
				elect.add(ele1);
				elect.add(ele2);
				elect.add(ele3);
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		return elect;
	}


	@Override
	public Collection<FoodItems> getTopThreeFoodItems() {
		// TODO Auto-generated method stub
		
		
		//top 3 objects
		FoodItems food1=new FoodItems();
		FoodItems food2=new FoodItems();
		FoodItems food3=new FoodItems();
		Collection<FoodItems> foods =new ArrayList<>();
		

		try
		{
			if(foodItems.size()<3)
			{
				throw new Exception("less then 3 elements present");
			}
			else
			{
				int max=0;
				//first
				for(FoodItems food:foodItems)
				{
					if(food.getQuantity()>max)
					{
						max=food.getQuantity();
						food1=food;
					}
				}
				
				max=0;
				
				//second
				for(FoodItems food:foodItems)
				{
					if(food.getQuantity()>max&&!food.equals(food1))
					{
						max=food.getQuantity();
						food2=food;
					}
				}
				
				max=0;
				
				//third
				for(FoodItems food:foodItems)
				{
					if(food.getQuantity()>max && !food.equals(food1) && !food.equals(food2))
					{
						max=food.getQuantity();
						food3=food;
					}
				}
				
				foods.add(food1);
				foods.add(food2);
				foods.add(food3);				
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		return foods;
		
		
	}

	@Override
	public Collection<Apparel> getTopThreeApparel() {
		// TODO Auto-generated method stub
		
		
		//3 objects to store top 3
		Apparel app1=new Apparel();
		Apparel app2=new Apparel();
		Apparel app3=new Apparel();
		Collection<Apparel> apps =new ArrayList<>();
		
		

		try
		{
			if(apparels.size()<3)
			{
				throw new Exception("less then 3 elements present");
			}
			else
			{
				int max=0;
				//first
				for(Apparel app:apparels)
				{
					if(app.getQuantity()>max)
					{
						max=app.getQuantity();
						app1=app;
					}
				}
				
				max=0;
				
				//second 
				for(Apparel app:apparels)
				{
					if(app.getQuantity()>max&&!app.equals(app1))
					{
						max=app.getQuantity();
						app2=app;
					}
				}
				
				max=0;
				
				//third
				for(Apparel app:apparels)
				{
					if(app.getQuantity()>max && !app.equals(app1) && !app.equals(app2))
					{
						max=app.getQuantity();
						app3=app;
					}
				}
				
				apps.add(app1);
				apps.add(app2);
				apps.add(app3);
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		return apps;
		
		
	}

	@Override
	public void addFoodItem(FoodItems food) {
		// TODO Auto-generated method stub
		foodItems.add(food);
	}

	@Override
	public void addApparel(Apparel apparel) {
		// TODO Auto-generated method stub
		apparels.add(apparel);
		
	}

	@Override
	public void addElectronic(Electronics electronice) {
		// TODO Auto-generated method stub
		electronics.add(electronice);
		
	}
	
	
	
	
	
	
	

}
