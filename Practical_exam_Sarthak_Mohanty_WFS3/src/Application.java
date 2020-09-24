//Author: Sarthak Mohanty
//The main application for the companyS


import com.practical.daoImplementation.ManageProducts;
import com.practical.entity.Apparel;
import com.practical.entity.Electronics;
import com.practical.entity.FoodItems;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apparel apparel= new Apparel(120, "Xl", "Cotton", 101, "Apparel", 10);
		FoodItems food= new FoodItems("date", "date", "yes", 200, 201, "food", 60);
		Electronics electronic = new Electronics(2000, "date", 301, "electronic", 20);
		
		ManageProducts manage = new ManageProducts();
		manage.addApparel(apparel);
		manage.addElectronics(electronic);
		manage.addFoodItems(food);
		
		
		System.out.println(manage.getTopApparel());
		
		
		
		
		
	}

}
