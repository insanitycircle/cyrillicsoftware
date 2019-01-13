package rs.ezcoding.service;

import java.util.List;

import rs.ezcoding.entity.User;


public interface UserService {

	public List<User> getUsers(User theUser);

	public List<User> login(User theUser);

}
