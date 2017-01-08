
package com.cancer.therapy.evolution.api.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cancer.therapy.evolution.core.model.User;
import com.cancer.therapy.evolution.core.repository.UserRepository;
import com.mysql.jdbc.Connection;


@RestController()
public class UserController {

	////// Injection dependance //////////////
	@Autowired
	private UserRepository userRepository;
	Map<String ,String> erreur=new HashMap<String, String>();


	///////////////// Retrieve All Users ///////////////////////

	

	////////////// create User on DB //////////////////////////
	@CrossOrigin
	@RequestMapping(value = "/save" , method =RequestMethod.POST)
	public User save(@RequestBody User user) {
		userRepository.save(user);
		return user;
	}
	
	@RequestMapping(value ="/all" )
	public List<User> getusers(){
		return (List<User>) userRepository.findAll();
		
	}
	////////// Register User /////////////////
	@CrossOrigin
	@RequestMapping(value = "/passwordvergessen", method = RequestMethod.POST)
	public ResponseEntity<User> passwordvergessen(@RequestBody User user) {
		User usr = userRepository.findByEmail(user.getEmail());
		if (usr == null)
			throw new IllegalAccessError("User not found");
	
		return new ResponseEntity<User>(userRepository.save(user.getPassword()), HttpStatus.CREATED);
	}


	/////////// Test Mapping /////////////////////////////////////////
	@RequestMapping(value = "/txt")
	public String txt() {

		return "test txt";
	}

	//////////////// Test user with GET URL  CrossOrigin :blocage() port ouvrir l acc a tous utlisateur ///////////////////////////
	@CrossOrigin
	@RequestMapping(value = "/test", method = GET)
	public User test() {
		User user = new User();
		userRepository.save(user);

		return user;
	}

	////////////////// Authentication User ////////////////////////////
	@CrossOrigin
	@RequestMapping(value = "/authenticate", method = POST )
	public void authenticate(@RequestBody User user, @ModelAttribute("connectform")final Connection connectform,HttpSession session) {
		User usr = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if (usr == null)
			throw new IllegalAccessError("User not found");
		

		
	}

	@RequestMapping(value = "{userId}", method = PUT)
	public void update(@RequestBody User user, @PathParam("userId") Integer userId) {
		// userRepository.(user);
	}

}
