package javaCampDay5Hw1.business.concretes;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaCampDay5Hw1.business.abstracts.UserService;
import javaCampDay5Hw1.core.LoggerService;
import javaCampDay5Hw1.dataAccess.abstracts.UserDao;
import javaCampDay5Hw1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private LoggerService loggerService;
	List<User> userList = new ArrayList<>();
	List<String> emaList = new ArrayList<>();
	
	
	public UserManager(UserDao userDao, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
	}

	@Override
	public void verify(User user) {
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
	
		if (user.getPassword().length()<6) {
			System.out.println("Password should be 6 more than 6 characters");
			
		
		}
		else if (user.getName().length()<2) {
			System.out.println("Name should be 2 more than 2 characters");
		
		}
		else if (user.getSurname().length()<2) {
			System.out.println("Surname should be 2 more than 2 characters");
			
			
		}
		else if (matcher.matches()!=true) {
			System.out.println("Email should be in correct form.");
			
		}
		else {
		
			add(user);
			emaList.add(user.geteMail());
			emaList.add(user.getPassword());
			System.out.println("Registration completed");
			
		}
	
	
		
	}




	@Override
	public List<User> add(User user) {
		
		userList.add(user);
		this.userDao.add(user);
		return userList;
	
	}

	@Override
	public void logIn(User user) {

		 if (emaList.contains(user.geteMail()) && emaList.contains(user.getPassword())) {
			 
			 System.out.println("Log in is succesfull");
			
		}
		 else {
			System.out.println("E mail or password is wrong. Please try again");
		}
		
	}

	@Override
	public void logWithGoogle() {
		this.loggerService.logToSystem();
		
	}
	

	@Override
	public void registerWithGoogle() {
		this.loggerService.register();
		
	}

}
