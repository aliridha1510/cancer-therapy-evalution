package com.cancer.therapy.evolution.core.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.cancer.therapy.evolution.core.model.Account;


@Transactional
public interface AccountDao extends CrudRepository<Account, ID> {

}
