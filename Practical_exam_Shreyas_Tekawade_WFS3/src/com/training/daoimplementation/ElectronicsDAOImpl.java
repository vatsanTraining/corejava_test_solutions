/**
 * 
 */
package com.training.daoimplementation;

import java.util.Collection;
import java.util.*;

import com.training.entity.Electronics;
import com.training.ifaces.ElectronisInterface;

/**
 * @author Shreyas S Tekawade
 * @Purpose Implementing add gadget and report of electronic items in this class
 *
 */
public class ElectronicsDAOImpl implements ElectronisInterface {
	
	private List<Electronics> electronicList;
	
	

	public ElectronicsDAOImpl() {
		super();
		this.electronicList = new ArrayList <Electronics>();
	}

	@Override
	public boolean addElectronicItem(Electronics gadget) {
		
		return this.electronicList.add(gadget);
	}

	@Override
	public Collection<Electronics> ReportElectronicItems() {
		Collections.sort(this.electronicList);
		return this.electronicList;
	}

}
