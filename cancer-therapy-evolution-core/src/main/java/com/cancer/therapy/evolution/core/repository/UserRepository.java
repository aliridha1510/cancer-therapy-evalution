package com.cancer.therapy.evolution.core.repository;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.cancer.therapy.evolution.core.model.User;

@Transactional
public interface UserRepository extends CrudRepository<User, Long>, UserRepositoryCustom {

	//public User findByEmail(String email);

	public User findByEmailAndPassword(String email, String password);
	public User findByEmail(String email);
	public User save(String password);
//	public List getUser(String email,String password);
//	public List getUser(String email);
	//public List getUser(String email, String password);
}
