package com.cancer.therapy.evolution.core.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.cancer.therapy.evolution.core.model.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

	public User findByEmail(String email);
	public User findByName(String name);

}
