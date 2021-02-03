package com.pattern.startegy.approach3.duck.impl;

import com.pattern.startegy.approach3.behaviour.fly.IFlyBehaviour;
import com.pattern.startegy.approach3.behaviour.quack.IQuackBehaviour;
import com.pattern.startegy.approach3.duck.Duck;

public class CityDuck extends Duck {

	public CityDuck(IFlyBehaviour ifly, IQuackBehaviour iquack) {
		iFlyBheaviour = ifly;
		iQuackBehaviour = iquack;
	}

}
