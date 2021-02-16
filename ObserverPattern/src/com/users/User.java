package com.users;

import com.observer.Observer;

public class User implements Observer {
	
	String name;
	
	String mobileNumber;
	
	String emailId;

	public User(String name) {
		this.name = name;
		System.out.println("Created "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public void update(Observer observer ,String groupName) {
		if(observer instanceof User) {
			User user = (User)observer;
			System.out.println("This is instance of " + this.getName());
			System.out.println(user.getName() + " added to " + groupName);
		}
		
	}
}
