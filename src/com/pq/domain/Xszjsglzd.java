package com.pq.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Xszjsglzd entity. @author MyEclipse Persistence Tools
 */

public class Xszjsglzd implements java.io.Serializable {

	// Fields

	private Integer id;
	private String conclusion;
	private String grade;
	private Double total2;
	private Double total1;
	private String jieshu;
	private Double jljzfs2;
	private Double jljzfs1;
	private String jljzpg;
	private String jilijizhi;
	private Double jsdwfs2;
	private Double jsdwfs1;
	private String jsdwpg;
	private String jiaoshiduwu;
	private Double jxggfs2;
	private Double jxggfs1;
	private String jxggpg;
	private String jiaoxuegaige;
	private Double jxtxfs2;
	private Double jxtxfs1;
	private String jxtxpg;
	private String jiaoxuetixi;
	private Double jxzdfs2;
	private Double jxzdfs1;
	private String jxzdpg;
	private String jiaoxuezhidu;
	private Set xpinggubiaozhuns = new HashSet(0);

	// Constructors

	/** default constructor */
	public Xszjsglzd() {
	}

	/** minimal constructor */
	public Xszjsglzd(String jieshu) {
		this.jieshu = jieshu;
	}

	/** full constructor */
	public Xszjsglzd(String conclusion, String grade, Double total2,
			Double total1, String jieshu, Double jljzfs2, Double jljzfs1,
			String jljzpg, String jilijizhi, Double jsdwfs2, Double jsdwfs1,
			String jsdwpg, String jiaoshiduwu, Double jxggfs2, Double jxggfs1,
			String jxggpg, String jiaoxuegaige, Double jxtxfs2, Double jxtxfs1,
			String jxtxpg, String jiaoxuetixi, Double jxzdfs2, Double jxzdfs1,
			String jxzdpg, String jiaoxuezhidu, Set xpinggubiaozhuns) {
		this.conclusion = conclusion;
		this.grade = grade;
		this.total2 = total2;
		this.total1 = total1;
		this.jieshu = jieshu;
		this.jljzfs2 = jljzfs2;
		this.jljzfs1 = jljzfs1;
		this.jljzpg = jljzpg;
		this.jilijizhi = jilijizhi;
		this.jsdwfs2 = jsdwfs2;
		this.jsdwfs1 = jsdwfs1;
		this.jsdwpg = jsdwpg;
		this.jiaoshiduwu = jiaoshiduwu;
		this.jxggfs2 = jxggfs2;
		this.jxggfs1 = jxggfs1;
		this.jxggpg = jxggpg;
		this.jiaoxuegaige = jiaoxuegaige;
		this.jxtxfs2 = jxtxfs2;
		this.jxtxfs1 = jxtxfs1;
		this.jxtxpg = jxtxpg;
		this.jiaoxuetixi = jiaoxuetixi;
		this.jxzdfs2 = jxzdfs2;
		this.jxzdfs1 = jxzdfs1;
		this.jxzdpg = jxzdpg;
		this.jiaoxuezhidu = jiaoxuezhidu;
		this.xpinggubiaozhuns = xpinggubiaozhuns;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public String getJieshu() {
		return this.jieshu;
	}

	public void setJieshu(String jieshu) {
		this.jieshu = jieshu;
	}

	public Double getJljzfs2() {
		return this.jljzfs2;
	}

	public void setJljzfs2(Double jljzfs2) {
		this.jljzfs2 = jljzfs2;
	}

	public Double getJljzfs1() {
		return this.jljzfs1;
	}

	public void setJljzfs1(Double jljzfs1) {
		this.jljzfs1 = jljzfs1;
	}

	public String getJljzpg() {
		return this.jljzpg;
	}

	public void setJljzpg(String jljzpg) {
		this.jljzpg = jljzpg;
	}

	public String getJilijizhi() {
		return this.jilijizhi;
	}

	public void setJilijizhi(String jilijizhi) {
		this.jilijizhi = jilijizhi;
	}

	public Double getJsdwfs2() {
		return this.jsdwfs2;
	}

	public void setJsdwfs2(Double jsdwfs2) {
		this.jsdwfs2 = jsdwfs2;
	}

	public Double getJsdwfs1() {
		return this.jsdwfs1;
	}

	public void setJsdwfs1(Double jsdwfs1) {
		this.jsdwfs1 = jsdwfs1;
	}

	public String getJsdwpg() {
		return this.jsdwpg;
	}

	public void setJsdwpg(String jsdwpg) {
		this.jsdwpg = jsdwpg;
	}

	public String getJiaoshiduwu() {
		return this.jiaoshiduwu;
	}

	public void setJiaoshiduwu(String jiaoshiduwu) {
		this.jiaoshiduwu = jiaoshiduwu;
	}

	public Double getJxggfs2() {
		return this.jxggfs2;
	}

	public void setJxggfs2(Double jxggfs2) {
		this.jxggfs2 = jxggfs2;
	}

	public Double getJxggfs1() {
		return this.jxggfs1;
	}

	public void setJxggfs1(Double jxggfs1) {
		this.jxggfs1 = jxggfs1;
	}

	public String getJxggpg() {
		return this.jxggpg;
	}

	public void setJxggpg(String jxggpg) {
		this.jxggpg = jxggpg;
	}

	public String getJiaoxuegaige() {
		return this.jiaoxuegaige;
	}

	public void setJiaoxuegaige(String jiaoxuegaige) {
		this.jiaoxuegaige = jiaoxuegaige;
	}

	public Double getJxtxfs2() {
		return this.jxtxfs2;
	}

	public void setJxtxfs2(Double jxtxfs2) {
		this.jxtxfs2 = jxtxfs2;
	}

	public Double getJxtxfs1() {
		return this.jxtxfs1;
	}

	public void setJxtxfs1(Double jxtxfs1) {
		this.jxtxfs1 = jxtxfs1;
	}

	public String getJxtxpg() {
		return this.jxtxpg;
	}

	public void setJxtxpg(String jxtxpg) {
		this.jxtxpg = jxtxpg;
	}

	public String getJiaoxuetixi() {
		return this.jiaoxuetixi;
	}

	public void setJiaoxuetixi(String jiaoxuetixi) {
		this.jiaoxuetixi = jiaoxuetixi;
	}

	public Double getJxzdfs2() {
		return this.jxzdfs2;
	}

	public void setJxzdfs2(Double jxzdfs2) {
		this.jxzdfs2 = jxzdfs2;
	}

	public Double getJxzdfs1() {
		return this.jxzdfs1;
	}

	public void setJxzdfs1(Double jxzdfs1) {
		this.jxzdfs1 = jxzdfs1;
	}

	public String getJxzdpg() {
		return this.jxzdpg;
	}

	public void setJxzdpg(String jxzdpg) {
		this.jxzdpg = jxzdpg;
	}

	public String getJiaoxuezhidu() {
		return this.jiaoxuezhidu;
	}

	public void setJiaoxuezhidu(String jiaoxuezhidu) {
		this.jiaoxuezhidu = jiaoxuezhidu;
	}

	public Set getXpinggubiaozhuns() {
		return this.xpinggubiaozhuns;
	}

	public void setXpinggubiaozhuns(Set xpinggubiaozhuns) {
		this.xpinggubiaozhuns = xpinggubiaozhuns;
	}

}