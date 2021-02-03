package com.pattern.startegy.approach1.impl;

import com.pattern.startegy.approach1.duck.impl.CityDuck;
import com.pattern.startegy.approach1.duck.impl.RubberDuck;
import com.pattern.startegy.approach1.duck.impl.WildDuck;
import com.pattern.startegy.approach1.duck.impl.WoodenDuck;

public class DuckImpl {

	public static void main(String[] args) {
		CityDuck cityDuck = new CityDuck();
		cityDuck.fly();
		cityDuck.quack();
		
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();
		wildDuck.quack();
		
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.fly();
		rubberDuck.quack();
		
		WoodenDuck woodenDuck = new WoodenDuck();
		woodenDuck.fly();

	}

}
