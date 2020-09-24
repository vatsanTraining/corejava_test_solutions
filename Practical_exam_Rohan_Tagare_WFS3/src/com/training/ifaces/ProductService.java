/*
 * author Rohan Tagare
 * batch WFS-3
 * 
 */

package com.training.ifaces;
import java.util.*;

import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;
import com.training.entity.Product;


public interface ProductService {
	
	/*
	 * interface to provide services
	 */
	
	public Collection<Electronics> getTopThreeElectronics();
	public Collection<FoodItems> getTopThreeFoodItems();
	public Collection<Apparel> getTopThreeApparel();
	public void addFoodItem(FoodItems food);
	public void addApparel(Apparel apparel);
	public void addElectronic(Electronics electronice);
	

}
