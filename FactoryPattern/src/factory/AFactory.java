package factory;

import product.Food;

public interface AFactory {
	Food createFood(String foodName);
}
