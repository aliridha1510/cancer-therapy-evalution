package com.cancer.therapy.evolution.api.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cancer.therapy.evolution.core.model.User;
import com.cancer.therapy.evolution.core.repository.UserDao;

@RestController("user")
public class UserController {

	@Autowired
	private UserDao userRepository;

	@RequestMapping(value = "/create", method = POST)
	
	public String create(@RequestBody User user) {
		try {
			userRepository.save(user);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "User succesfully created! (id = " + user.getId() + ")";
	}
	
	@RequestMapping(value ="/test" )
	@ResponseBody
	public User test(){
		 return userRepository.findByName("ali");
	}

}
