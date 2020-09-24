/**
 * 
 */
package com.training.ifaces;

import java.util.Collection;

import com.training.entity.Electronics;

/**
 * @author Shreyas S Tekawade
 * @Purpose Defining interface for Electronics
 *
 */
public interface ElectronisInterface {
	
	boolean addElectronicItem(Electronics gadget);
	Collection<Electronics> ReportElectronicItems();

}
