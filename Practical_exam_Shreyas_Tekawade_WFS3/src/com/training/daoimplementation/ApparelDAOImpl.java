/**
 * 
 */
package com.training.daoimplementation;
import java.util.*;
import java.util.Collection;
import java.util.List;

import com.training.entity.Apparel;
import com.training.ifaces.ApparelInterface;

/**
 * @author Shreyas S Tekawade
 * @Purpose Implementing add apparel and report of apparel in this class
 *
 */
public class ApparelDAOImpl implements ApparelInterface {
		private List<Apparel> apparelList;
		
		
		
	public ApparelDAOImpl() {
			super();
			this.apparelList = new ArrayList <Apparel>();
		}

	@Override
	public boolean addApparel(Apparel apparel) {
		
		return this.apparelList.add(apparel);
	}

	@Override
	public Collection <Apparel> ReportApparel() {
		Collections.sort(apparelList);
		return this.apparelList;
	}

}
