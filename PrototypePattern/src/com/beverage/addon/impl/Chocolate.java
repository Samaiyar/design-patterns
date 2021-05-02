package com.beverage.addon.impl;

import com.beverage.Beverage;
import com.beverage.addon.BeverageAddOn;

public class Chocolate extends BeverageAddOn {
	
	public Chocolate(Beverage bevrage) {
		this.beverage = bevrage;
	}

	@Override
	public void setDescription() {
		System.out.println(" Chocolate");
		
	}

	@Override
	public double setCost() {
		// TODO Auto-generated method stub
		return this.beverage.cost + 10;
	}
	
	

}
