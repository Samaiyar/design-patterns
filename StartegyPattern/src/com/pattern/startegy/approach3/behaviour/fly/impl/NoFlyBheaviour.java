package com.pattern.startegy.approach3.behaviour.fly.impl;

import com.pattern.startegy.approach3.behaviour.fly.IFlyBehaviour;

public class NoFlyBheaviour implements IFlyBehaviour {

	@Override
	public void fly() {
		System.out.println(" I cant fly");
		
	}

}
