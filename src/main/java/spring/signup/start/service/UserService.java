package spring.signup.start.service;

import java.util.List;

import spring.signup.start.model.User;



public interface UserService {
	public User saveEmployee(User users);
	 public List<User> getAllUser();
	 public User getUserByEmail(String email);
}
