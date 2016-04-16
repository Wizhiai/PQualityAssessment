package com.pq.domain;

/**
 * Xteacher entity. @author MyEclipse Persistence Tools
 */

public class Xteacher implements java.io.Serializable {

	// Fields

	private Integer id;
	private String professionaltitle;
	private String contact;
	private String age;
	private String name;
	private String xno;

	// Constructors

	/** default constructor */
	public Xteacher() {
	}

	/** minimal constructor */
	public Xteacher(String xno) {
		this.xno = xno;
	}

	/** full constructor */
	public Xteacher(String professionaltitle, String contact, String age,
			String name, String xno) {
		this.professionaltitle = professionaltitle;
		this.contact = contact;
		this.age = age;
		this.name = name;
		this.xno = xno;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProfessionaltitle() {
		return this.professionaltitle;
	}

	public void setProfessionaltitle(String professionaltitle) {
		this.professionaltitle = professionaltitle;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getXno() {
		return this.xno;
	}

	public void setXno(String xno) {
		this.xno = xno;
	}

}