package com.asessment;

import java.util.Collection;
import java.util.Iterator;

import com.asessment.daos.DaoImpl;
import com.assessment.entity.ApparelEntity;
import com.assessment.entity.ElectronicsEntity;
import com.assessment.entity.FoodItemsEntity;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodItemsEntity milk= new FoodItemsEntity(101, "Milk", 50, "Yes", 40);
		FoodItemsEntity curd= new FoodItemsEntity(102, "curd",40, "Yes",20);
		FoodItemsEntity cake=new FoodItemsEntity(111, "Cake", 200, "no", 12);
		ApparelEntity shirt=new ApparelEntity(222, "Shirt",400, "Large", "silk", 50);
		ApparelEntity tshirt=new ApparelEntity(432,"T-shirt",600,"Medium","Cotton",32);
		ApparelEntity sweater = new ApparelEntity(325,"Sweater",549,"Large","Woolen",20);
		ElectronicsEntity tv= new ElectronicsEntity(1013, "TV", 40000, 10,100);
		ElectronicsEntity mobile=new ElectronicsEntity(1026, "Mobile", 23452, 24, 97);
		ElectronicsEntity watch=new ElectronicsEntity(1114, "Watch", 40000, 18,54);
		DaoImpl service= new DaoImpl();
		service.addFood(cake);
		service.addFood(curd);
		service.addFood(milk);
		service.addElectronice(watch);
		service.addElectronice(mobile);
		service.addElectronice(tv);
		service.addApparel(sweater);
		service.addApparel(tshirt);
		service.addApparel(shirt);
		service.sortFood();
		service.sortElectronics();
		service.sortApparel();
		Collection<FoodItemsEntity> foodList= service.findallfood();
		Collection<ElectronicsEntity>elecList=service.findallelectronics();
		Collection<ApparelEntity>apparelList=service.findallApparel();
		Iterator<FoodItemsEntity> iterator=foodList.iterator();
		while(iterator.hasNext()){
			FoodItemsEntity food=iterator.next();
			System.out.println(food);
		}
		Iterator<ElectronicsEntity> iterator1=elecList.iterator();
		while(iterator1.hasNext()){
			FoodItemsEntity elec=iterator.next();
			System.out.println(elec);
		}
		Iterator<ApparelEntity> iterator2=apparelList.iterator();
		while(iterator.hasNext()){
			FoodItemsEntity apparel=iterator.next();
			System.out.println(apparel);
		}
		
		
		

	}

}
