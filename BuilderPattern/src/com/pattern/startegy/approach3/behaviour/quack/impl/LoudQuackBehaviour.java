package com.pattern.startegy.approach3.behaviour.quack.impl;

import com.pattern.startegy.approach3.behaviour.quack.IQuackBehaviour;

public class LoudQuackBehaviour implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Loud Quack Quack");
		
	}

}
