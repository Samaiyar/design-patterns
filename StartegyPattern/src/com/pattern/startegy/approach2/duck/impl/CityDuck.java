package com.pattern.startegy.approach2.duck.impl;

import com.pattern.startegy.approach2.behaviour.IFlyBehaviour;
import com.pattern.startegy.approach2.behaviour.IQuackBehaviour;
import com.pattern.startegy.approach2.duck.Duck;

public class CityDuck extends Duck implements IFlyBehaviour,IQuackBehaviour {
	
	public void quack()
	{
		System.out.println("Soft Quack Quack");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	

}
