package com.playground;

import com.beverage.Beverage;
import com.beverage.addon.impl.Milk;
import com.beverage.concrete.BlackCooffe;

public class PlayGround {

	public static void main(String[] args) {
		
		Beverage beverage = new Milk(new BlackCooffe());
		System.out.println(beverage.setCost());
	}

}
