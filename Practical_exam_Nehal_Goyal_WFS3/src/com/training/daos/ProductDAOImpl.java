package com.training.daos;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import com.training.exceptionHandler.ItemMisMatchException;
import com.training.ifaces.ProductDAO;
import com.training.model.Apparel;
import com.training.model.Electronics;
import com.training.model.FoodItems;
import com.training.model.Product;
import com.training.utils.QuantityComparator;

public class ProductDAOImpl implements ProductDAO {

	private TreeSet<FoodItems> fooditemList;
	private TreeSet<Apparel> aaparelList;
	private TreeSet<Electronics> electronicsList;
	
	
	
	public ProductDAOImpl() {
		super();
		this.fooditemList=new TreeSet<>(new QuantityComparator());
		this.aaparelList=new TreeSet<>(new QuantityComparator());
		this.electronicsList=new TreeSet<>(new QuantityComparator());
		
	}
	

	@Override
	public boolean addNewItem(Product item, String typeOfItem)throws ItemMisMatchException {
		if(typeOfItem.equalsIgnoreCase("fooditems"))
		{
			this.fooditemList.add((FoodItems)item);
			return true;
		}
		else if(typeOfItem.equalsIgnoreCase("apparel"))
		{
			this.aaparelList.add((Apparel)item);
			return true;
		}
		else if(typeOfItem.equalsIgnoreCase("electronics")) {
			this.electronicsList.add((Electronics)item);
			return true;
		}
		else
			throw new ItemMisMatchException();
		
	}

	@Override
	public TreeSet<?> retrieveItemList(String typeOfItem)throws ItemMisMatchException {
		// TODO Auto-generated method stub
		if(typeOfItem.equalsIgnoreCase("fooditems"))
		{
			return this.fooditemList;
		}
		else if(typeOfItem.equalsIgnoreCase("apparel"))
		{
			return this.aaparelList;
		}
		else if(typeOfItem.equalsIgnoreCase("electronics")) {
			return this.electronicsList;
		}
		else
			throw new ItemMisMatchException();
	}

}
