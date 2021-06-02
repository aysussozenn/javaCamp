package javaCampDay5Hw1.business.abstracts;

import java.util.List;

import javaCampDay5Hw1.entities.concretes.User;

public interface UserService {
	public List<User> add(User user);
	public void verify(User user);
	public void logIn(User user);
	public void logWithGoogle();
	public void registerWithGoogle();
		
	

}
