package com.pq.domain;

/**
 * Xprofessional entity. @author MyEclipse Persistence Tools
 */

public class Xprofessional implements java.io.Serializable {

	// Fields

	private Integer id;
	private Xteacher xteacher;
	private String zhiwei;
	private String name;
	private String jieshu;

	// Constructors

	/** default constructor */
	public Xprofessional() {
	}

	/** full constructor */
	public Xprofessional(Xteacher xteacher, String zhiwei, String name,
			String jieshu) {
		this.xteacher = xteacher;
		this.zhiwei = zhiwei;
		this.name = name;
		this.jieshu = jieshu;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Xteacher getXteacher() {
		return this.xteacher;
	}

	public void setXteacher(Xteacher xteacher) {
		this.xteacher = xteacher;
	}

	public String getZhiwei() {
		return this.zhiwei;
	}

	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJieshu() {
		return this.jieshu;
	}

	public void setJieshu(String jieshu) {
		this.jieshu = jieshu;
	}

}