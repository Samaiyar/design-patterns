package com.beverage.concrete;

import com.beverage.Beverage;

public class BlackCooffe extends Beverage {

	@Override
	public void setDescription() {
		description = "Black Cooffe";
		
	}

	@Override
	public double setCost() {
		return 20;
	}

}
