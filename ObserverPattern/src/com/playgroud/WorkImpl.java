package com.playgroud;

import com.actions.group.CreateGroup;
import com.users.User;

public class WorkImpl {

	public static void main(String[] args) {
		
		CreateGroup group = new CreateGroup("Learn Design Patterns");
		User user = new User("Anshul");
		User user2 = new User("Ashish");
		
		group.registerObserver(user);
		
		group.registerObserver(user2);
		User user3 = new User("Monit");
		group.registerObserver(user3);
			
	}

}
