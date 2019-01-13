package rs.ezcoding.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import rs.ezcoding.dao.UserDAO;
import rs.ezcoding.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public List<User> getUsers(User theUser) {
		return userDAO.getUsers(theUser);
	}

	@Override
	@Transactional
	public List<User> login(User theUser) {
		return userDAO.login(theUser);
	}

}