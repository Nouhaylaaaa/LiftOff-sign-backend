package spring.signup.start.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.signup.start.model.User;
import spring.signup.start.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService {
	   @Autowired
	    private UserRepository userRepository;
		@Override
		public User saveEmployee(User users) {
			// TODO Auto-generated method stub
			return userRepository.save(users);
		}
		@Override
		public List<User> getAllUser() {
			// TODO Auto-generated method stub
			return userRepository.findAll();
		}
		   @Override
		    public User getUserByEmail(String email) {
		        return userRepository.findByEmail(email);
		    }
	}

