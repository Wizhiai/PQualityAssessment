package com.pq.domain;

/**
 * Xpinggubiaozhun entity. @author MyEclipse Persistence Tools
 */

public class Xpinggubiaozhun implements java.io.Serializable {

	// Fields

	private Integer id;
	private Xsjjxxiaoguo xsjjxxiaoguo;
	private Xszjsglzd xszjsglzd;
	private Xjiaoxuetixi xjiaoxuetixi;
	private Xsysjdjianshe xsysjdjianshe;
	private Xbiyspingjia xbiyspingjia;
	private Xjxgcjiankong xjxgcjiankong;
	private String conclusion;
	private String jieshu;
	private Double total2;
	private Double total1;
	private String grade;

	// Constructors

	/** default constructor */
	public Xpinggubiaozhun() {
	}

	/** minimal constructor */
	public Xpinggubiaozhun(Xsjjxxiaoguo xsjjxxiaoguo, Xszjsglzd xszjsglzd,
			Xjiaoxuetixi xjiaoxuetixi, Xsysjdjianshe xsysjdjianshe,
			Xbiyspingjia xbiyspingjia, Xjxgcjiankong xjxgcjiankong,
			String jieshu) {
		this.xsjjxxiaoguo = xsjjxxiaoguo;
		this.xszjsglzd = xszjsglzd;
		this.xjiaoxuetixi = xjiaoxuetixi;
		this.xsysjdjianshe = xsysjdjianshe;
		this.xbiyspingjia = xbiyspingjia;
		this.xjxgcjiankong = xjxgcjiankong;
		this.jieshu = jieshu;
	}

	/** full constructor */
	public Xpinggubiaozhun(Xsjjxxiaoguo xsjjxxiaoguo, Xszjsglzd xszjsglzd,
			Xjiaoxuetixi xjiaoxuetixi, Xsysjdjianshe xsysjdjianshe,
			Xbiyspingjia xbiyspingjia, Xjxgcjiankong xjxgcjiankong,
			String conclusion, String jieshu, Double total2, Double total1,
			String grade) {
		this.xsjjxxiaoguo = xsjjxxiaoguo;
		this.xszjsglzd = xszjsglzd;
		this.xjiaoxuetixi = xjiaoxuetixi;
		this.xsysjdjianshe = xsysjdjianshe;
		this.xbiyspingjia = xbiyspingjia;
		this.xjxgcjiankong = xjxgcjiankong;
		this.conclusion = conclusion;
		this.jieshu = jieshu;
		this.total2 = total2;
		this.total1 = total1;
		this.grade = grade;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Xsjjxxiaoguo getXsjjxxiaoguo() {
		return this.xsjjxxiaoguo;
	}

	public void setXsjjxxiaoguo(Xsjjxxiaoguo xsjjxxiaoguo) {
		this.xsjjxxiaoguo = xsjjxxiaoguo;
	}

	public Xszjsglzd getXszjsglzd() {
		return this.xszjsglzd;
	}

	public void setXszjsglzd(Xszjsglzd xszjsglzd) {
		this.xszjsglzd = xszjsglzd;
	}

	public Xjiaoxuetixi getXjiaoxuetixi() {
		return this.xjiaoxuetixi;
	}

	public void setXjiaoxuetixi(Xjiaoxuetixi xjiaoxuetixi) {
		this.xjiaoxuetixi = xjiaoxuetixi;
	}

	public Xsysjdjianshe getXsysjdjianshe() {
		return this.xsysjdjianshe;
	}

	public void setXsysjdjianshe(Xsysjdjianshe xsysjdjianshe) {
		this.xsysjdjianshe = xsysjdjianshe;
	}

	public Xbiyspingjia getXbiyspingjia() {
		return this.xbiyspingjia;
	}

	public void setXbiyspingjia(Xbiyspingjia xbiyspingjia) {
		this.xbiyspingjia = xbiyspingjia;
	}

	public Xjxgcjiankong getXjxgcjiankong() {
		return this.xjxgcjiankong;
	}

	public void setXjxgcjiankong(Xjxgcjiankong xjxgcjiankong) {
		this.xjxgcjiankong = xjxgcjiankong;
	}

	public String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getJieshu() {
		return this.jieshu;
	}

	public void setJieshu(String jieshu) {
		this.jieshu = jieshu;
	}

	public Double getTotal2() {
		return this.total2;
	}

	public void setTotal2(Double total2) {
		this.total2 = total2;
	}

	public Double getTotal1() {
		return this.total1;
	}

	public void setTotal1(Double total1) {
		this.total1 = total1;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}