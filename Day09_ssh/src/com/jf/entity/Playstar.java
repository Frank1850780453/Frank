package com.jf.entity;

/**
 * Playstar entity. @author MyEclipse Persistence Tools
 */

public class Playstar implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private double money;

	// Constructors

	/** default constructor */
	public Playstar() {
	}

	/** minimal constructor */
	public Playstar(String name) {
		this.name = name;
	}

	/** full constructor */
	public Playstar(String name, double money) {
		this.name = name;
		this.money = money;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return this.money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}