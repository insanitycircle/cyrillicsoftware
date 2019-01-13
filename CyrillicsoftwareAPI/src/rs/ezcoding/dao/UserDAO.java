package rs.ezcoding.dao;

import java.util.List;

import rs.ezcoding.entity.User;

public interface UserDAO {

	public List<User> getUsers(User theUser);

	public List<User> login(User theUser);
}
