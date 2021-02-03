package com.pattern.startegy.approach1.duck.impl;

import com.pattern.startegy.approach1.duck.Duck;

public class RubberDuck extends Duck {
	
	public void quack()
	{
		System.out.println("Squeak");
	}
	
	public void fly()
	{
		System.out.println("I dont fly");
	}
	
}
