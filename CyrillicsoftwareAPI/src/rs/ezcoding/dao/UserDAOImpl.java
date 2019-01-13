package rs.ezcoding.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import rs.ezcoding.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<User> getUsers(User theUser) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = 
				currentSession.createQuery("from User  where last_name like concat('%',:last_name,'%')",
											User.class);
		theQuery.setParameter("last_name", theUser.getLastName());
		List<User> users = theQuery.getResultList();
				
		return users;
	}

	@Override
	public List<User> login(User theUser) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = 
				currentSession.createQuery("from User where username = '"+theUser.getUsername()+"' and "
						+ " password =  '"+theUser.getPassword()+"'",
											User.class);
		
		List<User> users = theQuery.getResultList();
		return users;
		
	}

}
