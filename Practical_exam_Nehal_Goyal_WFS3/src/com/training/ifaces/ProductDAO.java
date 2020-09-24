package com.training.ifaces;

import java.util.Collection;
import java.util.TreeSet;

import com.training.exceptionHandler.ItemMisMatchException;
import com.training.model.Product;

public interface ProductDAO {
		boolean addNewItem(Product item,String typeOfItem)throws ItemMisMatchException;
		TreeSet<?> retrieveItemList(String typeOfItem)throws ItemMisMatchException;
}
