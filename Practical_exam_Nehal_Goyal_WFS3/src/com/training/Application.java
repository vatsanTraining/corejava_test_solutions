package com.training;

import java.io.ObjectOutputStream.PutField;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

import com.training.daos.ProductDAOImpl;
import com.training.exceptionHandler.VegtarianWrongEntry;
import com.training.ifaces.ProductDAO;
import com.training.model.Apparel;
import com.training.model.Electronics;
import com.training.model.FoodItems;
import com.training.model.Product;
import com.training.utils.QuantityComparator;

public class Application {

	public static void main(String[] args) throws Exception {
		
		
		FoodItems foodItem1=new FoodItems(101, "chips", 20.0, "20/12/2019", "20/03/2019", "yes", 10);
		FoodItems foodItem2=new FoodItems(102,"chocolate",50,"12/03/2020","12/05/2020","no",20);
		FoodItems foodItem3=new FoodItems(103,"ferrororoccer",50,"12/03/2020","12/05/2020","no",30);
		FoodItems foodItem4=new FoodItems(104,"Parleji",50,"12/03/2020","12/05/2020","no",36);
		FoodItems foodItem5=new FoodItems(105,"PackedFood",100,"12/03/2020","12/05/2020","no",12);
		FoodItems foodItem6=new FoodItems(106,"ColdDrink",150,"12/03/2020","12/05/2020","no",19);
		ProductDAO dao=new ProductDAOImpl();
		dao.addNewItem(foodItem1, "fooditems");
		dao.addNewItem(foodItem2, "fooditems");
		dao.addNewItem(foodItem3, "fooditems");
		dao.addNewItem(foodItem4, "fooditems");
		dao.addNewItem(foodItem5, "fooditems");
		dao.addNewItem(foodItem6, "fooditems");
		putList(dao.retrieveItemList("fooditems"));
		
		Apparel apparel1=new Apparel(101, "forever21", 1000, 5, "l", "woolen");
		Apparel apparel2=new Apparel(102, "zara", 1500, 1, "xs", "cotton");
		Apparel apparel3=new Apparel(103, "gucci", 2000, 3, "xl", "woolen");
		Apparel apparel4=new Apparel(104, "puma", 1200, 6, "xxl", "cotton");
		dao.addNewItem(apparel1, "apparel");
		dao.addNewItem(apparel2, "apparel");
		dao.addNewItem(apparel3, "apparel");
		dao.addNewItem(apparel4, "apparel");
		putList(dao.retrieveItemList("apparel"));
		
		Electronics electonic1=new Electronics(101, "fan", 450, 2, 9);
		Electronics electonic2=new Electronics(102, "light", 400, 5, 7);
		Electronics electonic3=new Electronics(103, "led", 500, 1, 6);
		dao.addNewItem(electonic1, "electronic");
		dao.addNewItem(electonic2, "electronic");
		dao.addNewItem(electonic3, "electronic");
		putList(dao.retrieveItemList("electronic"));
	}
	
	public static void putList(TreeSet<?> itemList)
	{
		Iterator<?> iterator=itemList.iterator();
		int count=0;
		while(iterator.hasNext()&&count<3)
		{
			System.out.println(iterator.next());
			count++;
		}
			
	}

}
