package factory;

import product.EnglishCheeseSandwich;
import product.EnglishOmlette;
import product.Food;

public class EnglishFoodFactory implements AFactory {

	@Override
	public Food createFood(String foodName) {
		
		if(foodName.equalsIgnoreCase("cheese sandwich")) {
			return new EnglishCheeseSandwich();
		}
		
		if(foodName.equalsIgnoreCase("Omelete")) {
			return new EnglishOmlette();
		}
		
		return null;
	}

}
