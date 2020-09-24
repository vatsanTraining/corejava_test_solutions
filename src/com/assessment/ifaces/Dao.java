package com.assessment.ifaces;

import java.util.*;
import java.util.Collection;

import com.asessment.exceptions.ItemIDException;
import com.assessment.entity.ApparelEntity;
import com.assessment.entity.ElectronicsEntity;
import com.assessment.entity.FoodItemsEntity;


public interface Dao {

	boolean addFood(FoodItemsEntity food);
	boolean addElectronice(ElectronicsEntity elec);
	boolean addApparel(ApparelEntity apparel);
	Collection<FoodItemsEntity>sortFood();
	Collection<ElectronicsEntity>sortElectronics();
	Collection<ApparelEntity>sortApparel();
	Collection<FoodItemsEntity>findallfood();
	Collection<ElectronicsEntity>findallelectronics();
	Collection<ApparelEntity>findallApparel();
}
