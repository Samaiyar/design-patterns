package factory;

import product.EnglishCheeseSandwich;
import product.Food;
import product.IndianIdliSambar;
import product.IndianKulcha;
import product.IndianWadaSambar;

public class IndianFoodFactory implements AFactory {

	@Override
	public Food createFood(String foodName) {
		
		if(foodName.equalsIgnoreCase("idli sambhar")) {
			return new IndianIdliSambar();
		}
		
		if(foodName.equalsIgnoreCase("wada sambhar")) {
			return new IndianWadaSambar();
		}
		
		if(foodName.equalsIgnoreCase("kulcha")) {
			return new IndianKulcha();
		}
		return null;
	}

}
