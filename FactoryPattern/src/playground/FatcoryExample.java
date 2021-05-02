package playground;

import factory.EnglishFoodFactory;
import factory.IndianFoodFactory;
import product.Food;

public class FatcoryExample {

	public static void main(String[] args) {
		System.out.println("Welcome to Food Factory");
		EnglishFoodFactory engFactory = new EnglishFoodFactory();
		IndianFoodFactory inFactory = new IndianFoodFactory();
		
		String input ="kulcha";
		
		Food myFood = inFactory.createFood(input);
		
		System.out.println(myFood.toString());

	}

}
