package com.pq.domain;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String uno;
	private String upwd;
	private String uidentity;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String uno, String upwd, String uidentity) {
		this.uno = uno;
		this.upwd = upwd;
		this.uidentity = uidentity;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUno() {
		return this.uno;
	}

	public void setUno(String uno) {
		this.uno = uno;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUidentity() {
		return this.uidentity;
	}

	public void setUidentity(String uidentity) {
		this.uidentity = uidentity;
	}

}