package com.cancer.therapy.evolution.core.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.cancer.therapy.evolution.core.model.Account;


@Transactional
public interface AccountDao extends CrudRepository<Account, Long> {

}
