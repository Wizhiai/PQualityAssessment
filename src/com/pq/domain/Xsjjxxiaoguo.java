package com.pq.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Xsjjxxiaoguo entity. @author MyEclipse Persistence Tools
 */

public class Xsjjxxiaoguo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String conclusion;
	private String jieshu;
	private Double total2;
	private Double total1;
	private String grade;
	private Double yrdwfs2;
	private Double yrdwfs1;
	private String yrdwpg;
	private String yongrendanwei;
	private Double cxszfs2;
	private Double cxszfs1;
	private String cxszpg;
	private String changxinsuzhi;
	private Double sjnlfs2;
	private Double sjnlfs1;
	private String sjnlpg;
	private String shijiannengli;
	private Double hjqkfs2;
	private Double hjqkfs1;
	private String hjqkpg;
	private String huojiangqingkuang;
	private Double lwzlfs2;
	private Double lwzlfs1;
	private String lwzlpg;
	private String lunwenzhiliang;
	private Set xpinggubiaozhuns = new HashSet(0);

	// Constructors

	/** default constructor */
	public Xsjjxxiaoguo() {
	}

	/** minimal constructor */
	public Xsjjxxiaoguo(String jieshu) {
		this.jieshu = jieshu;
	}

	/** full constructor */
	public Xsjjxxiaoguo(String conclusion, String jieshu, Double total2,
			Double total1, String grade, Double yrdwfs2, Double yrdwfs1,
			String yrdwpg, String yongrendanwei, Double cxszfs2,
			Double cxszfs1, String cxszpg, String changxinsuzhi,
			Double sjnlfs2, Double sjnlfs1, String sjnlpg,
			String shijiannengli, Double hjqkfs2, Double hjqkfs1,
			String hjqkpg, String huojiangqingkuang, Double lwzlfs2,
			Double lwzlfs1, String lwzlpg, String lunwenzhiliang,
			Set xpinggubiaozhuns) {
		this.conclusion = conclusion;
		this.jieshu = jieshu;
		this.total2 = total2;
		this.total1 = total1;
		this.grade = grade;
		this.yrdwfs2 = yrdwfs2;
		this.yrdwfs1 = yrdwfs1;
		this.yrdwpg = yrdwpg;
		this.yongrendanwei = yongrendanwei;
		this.cxszfs2 = cxszfs2;
		this.cxszfs1 = cxszfs1;
		this.cxszpg = cxszpg;
		this.changxinsuzhi = changxinsuzhi;
		this.sjnlfs2 = sjnlfs2;
		this.sjnlfs1 = sjnlfs1;
		this.sjnlpg = sjnlpg;
		this.shijiannengli = shijiannengli;
		this.hjqkfs2 = hjqkfs2;
		this.hjqkfs1 = hjqkfs1;
		this.hjqkpg = hjqkpg;
		this.huojiangqingkuang = huojiangqingkuang;
		this.lwzlfs2 = lwzlfs2;
		this.lwzlfs1 = lwzlfs1;
		this.lwzlpg = lwzlpg;
		this.lunwenzhiliang = lunwenzhiliang;
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

	public Double getYrdwfs2() {
		return this.yrdwfs2;
	}

	public void setYrdwfs2(Double yrdwfs2) {
		this.yrdwfs2 = yrdwfs2;
	}

	public Double getYrdwfs1() {
		return this.yrdwfs1;
	}

	public void setYrdwfs1(Double yrdwfs1) {
		this.yrdwfs1 = yrdwfs1;
	}

	public String getYrdwpg() {
		return this.yrdwpg;
	}

	public void setYrdwpg(String yrdwpg) {
		this.yrdwpg = yrdwpg;
	}

	public String getYongrendanwei() {
		return this.yongrendanwei;
	}

	public void setYongrendanwei(String yongrendanwei) {
		this.yongrendanwei = yongrendanwei;
	}

	public Double getCxszfs2() {
		return this.cxszfs2;
	}

	public void setCxszfs2(Double cxszfs2) {
		this.cxszfs2 = cxszfs2;
	}

	public Double getCxszfs1() {
		return this.cxszfs1;
	}

	public void setCxszfs1(Double cxszfs1) {
		this.cxszfs1 = cxszfs1;
	}

	public String getCxszpg() {
		return this.cxszpg;
	}

	public void setCxszpg(String cxszpg) {
		this.cxszpg = cxszpg;
	}

	public String getChangxinsuzhi() {
		return this.changxinsuzhi;
	}

	public void setChangxinsuzhi(String changxinsuzhi) {
		this.changxinsuzhi = changxinsuzhi;
	}

	public Double getSjnlfs2() {
		return this.sjnlfs2;
	}

	public void setSjnlfs2(Double sjnlfs2) {
		this.sjnlfs2 = sjnlfs2;
	}

	public Double getSjnlfs1() {
		return this.sjnlfs1;
	}

	public void setSjnlfs1(Double sjnlfs1) {
		this.sjnlfs1 = sjnlfs1;
	}

	public String getSjnlpg() {
		return this.sjnlpg;
	}

	public void setSjnlpg(String sjnlpg) {
		this.sjnlpg = sjnlpg;
	}

	public String getShijiannengli() {
		return this.shijiannengli;
	}

	public void setShijiannengli(String shijiannengli) {
		this.shijiannengli = shijiannengli;
	}

	public Double getHjqkfs2() {
		return this.hjqkfs2;
	}

	public void setHjqkfs2(Double hjqkfs2) {
		this.hjqkfs2 = hjqkfs2;
	}

	public Double getHjqkfs1() {
		return this.hjqkfs1;
	}

	public void setHjqkfs1(Double hjqkfs1) {
		this.hjqkfs1 = hjqkfs1;
	}

	public String getHjqkpg() {
		return this.hjqkpg;
	}

	public void setHjqkpg(String hjqkpg) {
		this.hjqkpg = hjqkpg;
	}

	public String getHuojiangqingkuang() {
		return this.huojiangqingkuang;
	}

	public void setHuojiangqingkuang(String huojiangqingkuang) {
		this.huojiangqingkuang = huojiangqingkuang;
	}

	public Double getLwzlfs2() {
		return this.lwzlfs2;
	}

	public void setLwzlfs2(Double lwzlfs2) {
		this.lwzlfs2 = lwzlfs2;
	}

	public Double getLwzlfs1() {
		return this.lwzlfs1;
	}

	public void setLwzlfs1(Double lwzlfs1) {
		this.lwzlfs1 = lwzlfs1;
	}

	public String getLwzlpg() {
		return this.lwzlpg;
	}

	public void setLwzlpg(String lwzlpg) {
		this.lwzlpg = lwzlpg;
	}

	public String getLunwenzhiliang() {
		return this.lunwenzhiliang;
	}

	public void setLunwenzhiliang(String lunwenzhiliang) {
		this.lunwenzhiliang = lunwenzhiliang;
	}

	public Set getXpinggubiaozhuns() {
		return this.xpinggubiaozhuns;
	}

	public void setXpinggubiaozhuns(Set xpinggubiaozhuns) {
		this.xpinggubiaozhuns = xpinggubiaozhuns;
	}

}