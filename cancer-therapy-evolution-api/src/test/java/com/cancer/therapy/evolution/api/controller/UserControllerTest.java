package com.cancer.therapy.evolution.api.controller;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.cancer.therapy.evolution.core.model.User;
import com.cancer.therapy.evolution.core.repository.UserRepository;

public class UserControllerTest {
	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();

	@InjectMocks
	private UserController userController;

	@Mock
	private UserRepository userRepository;

	@Test
	public void testSaveUser() {
		userController.save(new User());
	}
}
