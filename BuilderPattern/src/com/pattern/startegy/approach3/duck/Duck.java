package com.pattern.startegy.approach3.duck;


import com.pattern.startegy.approach3.behaviour.fly.IFlyBehaviour;
import com.pattern.startegy.approach3.behaviour.quack.IQuackBehaviour;

public class Duck {
	
	public IFlyBehaviour iFlyBheaviour;
	
	public IQuackBehaviour iQuackBehaviour;
	
	String name;
	
	public void swim()
	{ 
		System.out.println("I can swim");
	}
	
	public void fly()
	{
		iFlyBheaviour.fly();
	}
	
	public void quack()
	{
		iQuackBehaviour.quack();
	}
	
	

}
