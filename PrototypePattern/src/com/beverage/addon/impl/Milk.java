package com.beverage.addon.impl;

import com.beverage.Beverage;
import com.beverage.addon.BeverageAddOn;

public class Milk extends BeverageAddOn {
	
	Beverage bev;
	
	public Milk(Beverage bevrage) {
		this.bev = bevrage;
	}

	@Override
	public void setDescription() {
		System.out.println(" milk");
		
	}

	@Override
	public double setCost() {
		// TODO Auto-generated method stub
		return this.bev.setCost() +3;
	}
	
	

}
