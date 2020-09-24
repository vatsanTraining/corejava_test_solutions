/**
 * 
 */
package com.training;

import java.time.LocalDate;
import java.util.Scanner;

import com.training.entity.Apparel;
import com.training.entity.Electronic;
import com.training.entity.FoodItem;
import com.training.ifaces.ReportDAO;
import com.training.services.ReportDAOImplement;

/**
 * @author manan
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReportDAO dao = new ReportDAOImplement();
		String category = null;
		
		Scanner sc = new Scanner(System.in);
		String choice = null;
		int key = 0;
		String control = "y";
		
		while(control.equals("y")) {
		System.out.println("Enter you choice of Item:");
		System.out.println("FoodItem, Apparel, Electronic");
		choice = sc.next();
		
		try {
			key = dao.createItem(choice);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		switch (key) {
		case 1:
			System.out.println("Enter itemcode, itemName, unitPrice, dateOfManufacture(year-month-day), dateOfExpiry(year-month-day), vegetarian(true/false), quantity [add a space between each field]");
			dao.addFoodItem(new FoodItem(sc.nextInt(), sc.next(), sc.nextDouble(), LocalDate.parse(sc.next()), LocalDate.parse(sc.next()), sc.nextBoolean(), sc.nextInt()));
			break;

		case 2:
			System.out.println("Enter itemcode, itemName, unitPrice, size, material(cotten/woolen), quantity  [add a space between each field]");
			dao.addApparel(new Apparel(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next(), sc.nextInt()));
			break;
		case 3:
			System.out.println("Enter itemcode, itemName, unitPrice, warranty, quantity  [add a space between each field]");
			dao.addElectronic(new Electronic(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextInt()));
			break;
		default:
			sc.close();
			System.exit(0);
			break;
		}
		System.out.println("Do you want to add more y/n");
		control = sc.next();
		}
		System.out.println("Which report do you want: foodiitem , apparel , electronic ");
		category = sc.next();
		try {
			System.out.println(dao.generateReport(category));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		sc.close();
	}

}
