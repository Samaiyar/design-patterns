package com.beverage.concrete;

import com.beverage.Beverage;

public class Decaf extends Beverage {

	@Override
	public void setDescription() {
		description = "Decaf";
		
	}

	@Override
	public double setCost() {
		return 10;
	}

}
