package com.pq.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Xjiaoxuetixi entity. @author MyEclipse Persistence Tools
 */

public class Xjiaoxuetixi implements java.io.Serializable {

	// Fields

	private Integer id;
	private String conclusion;
	private String grade;
	private Double total2;
	private Double total1;
	private String jieshu;
	private Double xqhzfs2;
	private Double xqhzfs1;
	private String xahzpg;
	private String xiaoqihezuo;
	private Double kcdgfs2;
	private Double kcdgfs1;
	private String kcdgpg;
	private String kechengdagang;
	private Double jxjhfs2;
	private Double jxjhfs1;
	private String jxjhpg;
	private String jiaoxuejihua;
	private Set xpinggubiaozhuns = new HashSet(0);

	// Constructors

	/** default constructor */
	public Xjiaoxuetixi() {
	}

	/** minimal constructor */
	public Xjiaoxuetixi(String jieshu) {
		this.jieshu = jieshu;
	}

	/** full constructor */
	public Xjiaoxuetixi(String conclusion, String grade, Double total2,
			Double total1, String jieshu, Double xqhzfs2, Double xqhzfs1,
			String xahzpg, String xiaoqihezuo, Double kcdgfs2, Double kcdgfs1,
			String kcdgpg, String kechengdagang, Double jxjhfs2,
			Double jxjhfs1, String jxjhpg, String jiaoxuejihua,
			Set xpinggubiaozhuns) {
		this.conclusion = conclusion;
		this.grade = grade;
		this.total2 = total2;
		this.total1 = total1;
		this.jieshu = jieshu;
		this.xqhzfs2 = xqhzfs2;
		this.xqhzfs1 = xqhzfs1;
		this.xahzpg = xahzpg;
		this.xiaoqihezuo = xiaoqihezuo;
		this.kcdgfs2 = kcdgfs2;
		this.kcdgfs1 = kcdgfs1;
		this.kcdgpg = kcdgpg;
		this.kechengdagang = kechengdagang;
		this.jxjhfs2 = jxjhfs2;
		this.jxjhfs1 = jxjhfs1;
		this.jxjhpg = jxjhpg;
		this.jiaoxuejihua = jiaoxuejihua;
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

	public Double getXqhzfs2() {
		return this.xqhzfs2;
	}

	public void setXqhzfs2(Double xqhzfs2) {
		this.xqhzfs2 = xqhzfs2;
	}

	public Double getXqhzfs1() {
		return this.xqhzfs1;
	}

	public void setXqhzfs1(Double xqhzfs1) {
		this.xqhzfs1 = xqhzfs1;
	}

	public String getXahzpg() {
		return this.xahzpg;
	}

	public void setXahzpg(String xahzpg) {
		this.xahzpg = xahzpg;
	}

	public String getXiaoqihezuo() {
		return this.xiaoqihezuo;
	}

	public void setXiaoqihezuo(String xiaoqihezuo) {
		this.xiaoqihezuo = xiaoqihezuo;
	}

	public Double getKcdgfs2() {
		return this.kcdgfs2;
	}

	public void setKcdgfs2(Double kcdgfs2) {
		this.kcdgfs2 = kcdgfs2;
	}

	public Double getKcdgfs1() {
		return this.kcdgfs1;
	}

	public void setKcdgfs1(Double kcdgfs1) {
		this.kcdgfs1 = kcdgfs1;
	}

	public String getKcdgpg() {
		return this.kcdgpg;
	}

	public void setKcdgpg(String kcdgpg) {
		this.kcdgpg = kcdgpg;
	}

	public String getKechengdagang() {
		return this.kechengdagang;
	}

	public void setKechengdagang(String kechengdagang) {
		this.kechengdagang = kechengdagang;
	}

	public Double getJxjhfs2() {
		return this.jxjhfs2;
	}

	public void setJxjhfs2(Double jxjhfs2) {
		this.jxjhfs2 = jxjhfs2;
	}

	public Double getJxjhfs1() {
		return this.jxjhfs1;
	}

	public void setJxjhfs1(Double jxjhfs1) {
		this.jxjhfs1 = jxjhfs1;
	}

	public String getJxjhpg() {
		return this.jxjhpg;
	}

	public void setJxjhpg(String jxjhpg) {
		this.jxjhpg = jxjhpg;
	}

	public String getJiaoxuejihua() {
		return this.jiaoxuejihua;
	}

	public void setJiaoxuejihua(String jiaoxuejihua) {
		this.jiaoxuejihua = jiaoxuejihua;
	}

	public Set getXpinggubiaozhuns() {
		return this.xpinggubiaozhuns;
	}

	public void setXpinggubiaozhuns(Set xpinggubiaozhuns) {
		this.xpinggubiaozhuns = xpinggubiaozhuns;
	}

}