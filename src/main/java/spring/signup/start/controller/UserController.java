package spring.signup.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.signup.start.Config.EmailNotFoundException;
import spring.signup.start.model.User;
import spring.signup.start.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/add")
    public String add(@RequestBody User users)
    { 
		userService.saveEmployee(users);
		return "New user is added ";
	}
	@GetMapping("/getAll")
	public List<User> getAllUsers()
	{
		return userService.getAllUser();
	}
	
	@GetMapping("/getByEmail")
	public User getUserByEmail(@RequestParam String email) {
	    User users = userService.getUserByEmail(email);
	    if (users == null) {
	    	throw new EmailNotFoundException("Email not found in database.");


	    }
	    return users;
	}

}
