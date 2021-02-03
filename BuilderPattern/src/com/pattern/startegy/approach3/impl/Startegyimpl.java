package com.pattern.startegy.approach3.impl;

import com.pattern.startegy.approach3.behaviour.fly.IFlyBehaviour;
import com.pattern.startegy.approach3.behaviour.fly.impl.FlyHighBehaviour;
import com.pattern.startegy.approach3.behaviour.fly.impl.NoFlyBheaviour;
import com.pattern.startegy.approach3.behaviour.quack.IQuackBehaviour;
import com.pattern.startegy.approach3.behaviour.quack.impl.LoudQuackBehaviour;
import com.pattern.startegy.approach3.duck.impl.CityDuck;

public class Startegyimpl {

	public static void main(String[] args) {
		CityDuck cityDuck = new CityDuck(new FlyHighBehaviour(), new LoudQuackBehaviour());
		cityDuck.fly();
		cityDuck.quack();
		
		CityDuck cityDuck1 = new CityDuck(new NoFlyBheaviour(), new LoudQuackBehaviour());
		cityDuck1.fly();
		cityDuck1.quack();

	}

}
