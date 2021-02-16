package com.actions.group;

import java.util.ArrayList;
import java.util.List;

import com.observer.Observer;
import com.subject.Subject;
import com.util.Util;

public class CreateGroup implements Subject{

	String groupName;
	
	List<Observer> observers;

	
	public CreateGroup(String groupName) {
		observers = new ArrayList<Observer>();
		this.groupName = groupName;
	}
	
	@Override
	public void registerObserver(Observer observer) {	
		observers.add(observer);
		for(Observer obs : observers) {
			obs.update(observer,this.groupName);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		
	}
	

}
