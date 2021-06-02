package javaCampDay5Hw1;


import javaCampDay5Hw1.business.abstracts.UserService;
import javaCampDay5Hw1.business.concretes.UserManager;
import javaCampDay5Hw1.core.GoogleManagerAdapter;

import javaCampDay5Hw1.dataAccess.concretes.HibernateUserDao;
import javaCampDay5Hw1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());
		
		User user = new User("Aysu", "Sözen", "aysus@gmail.com", "123456");

		userService.verify(user);
	
		userService.logIn(user);
	/************************************************************************/	
		userService.logWithGoogle();
		userService.registerWithGoogle();

	}

}
