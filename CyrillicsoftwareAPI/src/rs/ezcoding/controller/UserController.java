package rs.ezcoding.controller;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rs.ezcoding.entity.User;
import rs.ezcoding.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController extends HttpServlet{

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/getUsers")
	public String getUsers(Model theModel,@ModelAttribute("user") User theUser) {
		List<User> users = userService.getUsers(theUser);
		theModel.addAttribute("users", users);
		return "search-users";
	}
	
	
	@PostMapping("/loginUser")
	public String loginUser(@ModelAttribute("user") User theUser) {
		List<User> users = userService.login(theUser);	
		if (users != null && !users.isEmpty()) {
			return "search-users";
		} else {
			return "login";
		}
	}
	
	@GetMapping("/login")
	public String showFormLogin(Model theModel) {
		User theUser = new User();
		theModel.addAttribute("user", theUser);
		return "login";
	}
	
}
