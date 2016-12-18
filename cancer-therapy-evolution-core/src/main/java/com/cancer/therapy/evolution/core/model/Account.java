package com.cancer.therapy.evolution.core.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
@Table(name="account")
// seul Table @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="iduser",discriminatorType=DiscriminatorType.STRING,length=2)
public  class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long  idAccount	;
	@NotNull
    private Date dateCreate;
	// @ManyToMany
	//@JoinColumn(name="idUser")
	//private User user;
	//private Collection<User> users;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}



}
	