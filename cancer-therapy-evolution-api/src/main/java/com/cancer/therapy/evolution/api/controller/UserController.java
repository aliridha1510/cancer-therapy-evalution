package com.cancer.therapy.evolution.api.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cancer.therapy.evolution.core.model.User;
import com.cancer.therapy.evolution.core.repository.UserRepository;

@RestController("user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(method = POST)
	public void create(@RequestBody User user) {
		userRepository.save(user);
	}

	@CrossOrigin
	@RequestMapping(value = "/authenticate", method = POST)
	public void authenticate(@RequestBody User user) {
		User usr = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if (usr == null)
			throw new IllegalAccessError("User not found");
	}

	@RequestMapping(value = "{userId}", method = PUT)
	public void updae(@RequestBody User user, @PathParam("userId") Integer userId) {
		// userRepository.(user);
	}

}
