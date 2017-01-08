package com.cancer.therapy.evolution.api.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cancer.therapy.evolution.core.model.TestUser;
import com.cancer.therapy.evolution.core.repository.TestUserRepository;

@RestController()
public class TestUserController {

//	@Autowired
	
	private TestUserRepository testUserRepository;
	


	///////// CONTROLLEUR SAVE Restlut test
	@CrossOrigin
	@RequestMapping(value = "/savetest", method = POST)
	public TestUser savetest(@RequestBody TestUser testuser) {
		//testUserRepository.save(testuser);
		return testuser;

	}

	//////// test/////////
	@CrossOrigin
	@RequestMapping(value = "/result")
	public String result() {
		return "controller fonctioniert !";

	}

}
