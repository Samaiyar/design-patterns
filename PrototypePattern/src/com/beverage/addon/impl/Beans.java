package com.beverage.addon.impl;

import com.beverage.Beverage;
import com.beverage.addon.BeverageAddOn;

public class Beans extends BeverageAddOn {
	
	public Beans(Beverage bevrage) {
		this.beverage = bevrage;
	}

	@Override
	public void setDescription() {
		System.out.println(" Beans");
		
	}

	@Override
	public double setCost() {
		// TODO Auto-generated method stub
		return this.beverage.cost + 2;
	}
	
	

}
