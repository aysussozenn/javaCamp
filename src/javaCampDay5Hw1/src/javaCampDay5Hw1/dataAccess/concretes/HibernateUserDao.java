package javaCampDay5Hw1.dataAccess.concretes;

import javaCampDay5Hw1.dataAccess.abstracts.UserDao;
import javaCampDay5Hw1.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("User "+user.getName()+" "+user.getSurname()+" added with Hibernate");
		
	}

}
