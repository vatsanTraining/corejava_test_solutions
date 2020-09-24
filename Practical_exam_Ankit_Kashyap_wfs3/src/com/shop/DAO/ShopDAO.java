/**
 * @author Ankit kashyap
 *
 *this is the interface for the shop which has abstract methods.
 */
package com.shop.DAO;

import java.util.ArrayList;

import com.shop.models.Apparel;
import com.shop.models.Electronics;
import com.shop.models.FoodItems;
import com.shop.models.Items;


public interface ShopDAO {
	boolean addItems(FoodItems items);
	boolean addItems(Apparel items);
	boolean addItems(Electronics items);
	ArrayList<FoodItems> retrievefood();
	ArrayList<Apparel>retrieveApparel();
	ArrayList<Electronics>retrieveElectronic();
	

}
