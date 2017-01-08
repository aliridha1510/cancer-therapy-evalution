package com.cancer.therapy.evolution.core.model;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name = "test_user")
public class TestUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_test;
	@NotNull
	
	
	@Generated(value = { "" })
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date date_test = new java.sql.Date(new java.util.Date().getTime());
	
	///// Result final Test ////////
    @NotNull
	private int Resul_final;
	// a est value Resultat des 1er Test *** b 2em Test **** c 3em Test //
    @NotNull
	private int a;
    @NotNull
	private int b;
    @NotNull
	private int c;


	public int getResul_final() {
		return Resul_final;
	}

	public void setResul_final(int resul_final) {
		Resul_final = resul_final;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public TestUser(Long id_test, Date date_test) {
		super();
		this.id_test = id_test;
		this.date_test = date_test;
	}

	public TestUser() {
		super();

	}

	public Long getId_test() {
		return id_test;
	}

	public void setId_test(Long id_test) {
		this.id_test = id_test;
	}

	public Date getDate_test() {
		return date_test;
	}

	public void setDate_test(Date date_test) {
		this.date_test = date_test;
	}
}
