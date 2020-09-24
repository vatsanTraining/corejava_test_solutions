package com.training.Application;

import java.time.LocalDate;
import java.util.Scanner;

import com.training.entity.Apparel;
import com.training.entity.Electronic;
import com.training.entity.FoodItem;
import com.training.ifaces.ProductServiceDAO;
import com.training.service.ProductServiceDAOImplement;

public class Application {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductServiceDAO dao = new ProductServiceDAOImplement();
		
		Scanner sc = new Scanner(System.in);
		String choice = null , category = null;
		int key = 0;
		String control = "yes";
		
		while(control.equals("yes")) {
		System.out.println("Enter the product: FoodItem, Apparel, Electronic");
		choice = sc.next();
		
		try {
			key = dao.createItemList(choice);
		} catch (Exception e) {
			e.getMessage();
		}
		switch (key) {
		case 1:
			System.out.println("Enter the values for FoodItems");
			dao.addFoodItem(new FoodItem(sc.nextInt(), sc.next(), sc.nextDouble(), LocalDate.parse(sc.next()), LocalDate.parse(sc.next()), sc.nextBoolean(), sc.nextInt()));
			break;

		case 2:
			System.out.println("Enter the values for Apparel");
			dao.addApparel(new Apparel(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next(), sc.nextInt()));
			break;
		case 3:
			System.out.println("Enter the values for Electronics");
			dao.addElectronic(new Electronic(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextInt()));
			break;
		default:
			sc.close();
			System.exit(0);
			break;
		}
		System.out.println("Do you want to continue yes/no");
		control = sc.next();
		}
		System.out.println("enter the product for which you need to view Report ");
		category = sc.next();
		try {
			System.out.println(dao.generateReport(category));
		} catch (Exception e) {
			e.getMessage();
		}
		
		sc.close();
	}

}