/**
 * 
 */
package com.training.ifaces;

import java.util.Collection;

import com.training.entity.Apparel;

/**
 * @author Shreyas S Tekawade
 * @Purpose nterface defined for FoodItems separately
 *
 */
public interface ApparelInterface {

	boolean addApparel(Apparel apparel);
	Collection <Apparel> ReportApparel();
}
