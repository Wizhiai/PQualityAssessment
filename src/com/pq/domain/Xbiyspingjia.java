package com.pq.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Xbiyspingjia entity. @author MyEclipse Persistence Tools
 */

public class Xbiyspingjia implements java.io.Serializable {

	// Fields

	private Integer id;
	private String conclusion;
	private String jieshu;
	private Double total2;
	private Double total1;
	private String grade;
	private Double jycynlfs2;
	private Double jycynlfs1;
	private String jycynlpg;
	private String jycynengli;
	private Double pymydfs2;
	private Double pymydfs1;
	private String pymydpg;
	private String peiyangmanyidu;
	private Double fzzydfs2;
	private Double fzzydfs1;
	private String fzzydpg;
	private String fazhanzydu;
	private Double jxnlfs2;
	private Double jxnlfs1;
	private String jxnlpg;
	private String jiaoxuenengli;
	private Double sjhjfs2;
	private Double sjhjfs1;
	private String sjhjpg;
	private String shijianhuanjing;
	private Double kcmyfs2;
	private Double kcmyfs1;
	private String kcmypg;
	private String kechengmanyi;
	private Set xpinggubiaozhuns = new HashSet(0);

	// Constructors

	/** default constructor */
	public Xbiyspingjia() {
	}

	/** minimal constructor */
	public Xbiyspingjia(String jieshu) {
		this.jieshu = jieshu;
	}

	/** full constructor */
	public Xbiyspingjia(String conclusion, String jieshu, Double total2,
			Double total1, String grade, Double jycynlfs2, Double jycynlfs1,
			String jycynlpg, String jycynengli, Double pymydfs2,
			Double pymydfs1, String pymydpg, String peiyangmanyidu,
			Double fzzydfs2, Double fzzydfs1, String fzzydpg,
			String fazhanzydu, Double jxnlfs2, Double jxnlfs1, String jxnlpg,
			String jiaoxuenengli, Double sjhjfs2, Double sjhjfs1,
			String sjhjpg, String shijianhuanjing, Double kcmyfs2,
			Double kcmyfs1, String kcmypg, String kechengmanyi,
			Set xpinggubiaozhuns) {
		this.conclusion = conclusion;
		this.jieshu = jieshu;
		this.total2 = total2;
		this.total1 = total1;
		this.grade = grade;
		this.jycynlfs2 = jycynlfs2;
		this.jycynlfs1 = jycynlfs1;
		this.jycynlpg = jycynlpg;
		this.jycynengli = jycynengli;
		this.pymydfs2 = pymydfs2;
		this.pymydfs1 = pymydfs1;
		this.pymydpg = pymydpg;
		this.peiyangmanyidu = peiyangmanyidu;
		this.fzzydfs2 = fzzydfs2;
		this.fzzydfs1 = fzzydfs1;
		this.fzzydpg = fzzydpg;
		this.fazhanzydu = fazhanzydu;
		this.jxnlfs2 = jxnlfs2;
		this.jxnlfs1 = jxnlfs1;
		this.jxnlpg = jxnlpg;
		this.jiaoxuenengli = jiaoxuenengli;
		this.sjhjfs2 = sjhjfs2;
		this.sjhjfs1 = sjhjfs1;
		this.sjhjpg = sjhjpg;
		this.shijianhuanjing = shijianhuanjing;
		this.kcmyfs2 = kcmyfs2;
		this.kcmyfs1 = kcmyfs1;
		this.kcmypg = kcmypg;
		this.kechengmanyi = kechengmanyi;
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

	public Double getJycynlfs2() {
		return this.jycynlfs2;
	}

	public void setJycynlfs2(Double jycynlfs2) {
		this.jycynlfs2 = jycynlfs2;
	}

	public Double getJycynlfs1() {
		return this.jycynlfs1;
	}

	public void setJycynlfs1(Double jycynlfs1) {
		this.jycynlfs1 = jycynlfs1;
	}

	public String getJycynlpg() {
		return this.jycynlpg;
	}

	public void setJycynlpg(String jycynlpg) {
		this.jycynlpg = jycynlpg;
	}

	public String getJycynengli() {
		return this.jycynengli;
	}

	public void setJycynengli(String jycynengli) {
		this.jycynengli = jycynengli;
	}

	public Double getPymydfs2() {
		return this.pymydfs2;
	}

	public void setPymydfs2(Double pymydfs2) {
		this.pymydfs2 = pymydfs2;
	}

	public Double getPymydfs1() {
		return this.pymydfs1;
	}

	public void setPymydfs1(Double pymydfs1) {
		this.pymydfs1 = pymydfs1;
	}

	public String getPymydpg() {
		return this.pymydpg;
	}

	public void setPymydpg(String pymydpg) {
		this.pymydpg = pymydpg;
	}

	public String getPeiyangmanyidu() {
		return this.peiyangmanyidu;
	}

	public void setPeiyangmanyidu(String peiyangmanyidu) {
		this.peiyangmanyidu = peiyangmanyidu;
	}

	public Double getFzzydfs2() {
		return this.fzzydfs2;
	}

	public void setFzzydfs2(Double fzzydfs2) {
		this.fzzydfs2 = fzzydfs2;
	}

	public Double getFzzydfs1() {
		return this.fzzydfs1;
	}

	public void setFzzydfs1(Double fzzydfs1) {
		this.fzzydfs1 = fzzydfs1;
	}

	public String getFzzydpg() {
		return this.fzzydpg;
	}

	public void setFzzydpg(String fzzydpg) {
		this.fzzydpg = fzzydpg;
	}

	public String getFazhanzydu() {
		return this.fazhanzydu;
	}

	public void setFazhanzydu(String fazhanzydu) {
		this.fazhanzydu = fazhanzydu;
	}

	public Double getJxnlfs2() {
		return this.jxnlfs2;
	}

	public void setJxnlfs2(Double jxnlfs2) {
		this.jxnlfs2 = jxnlfs2;
	}

	public Double getJxnlfs1() {
		return this.jxnlfs1;
	}

	public void setJxnlfs1(Double jxnlfs1) {
		this.jxnlfs1 = jxnlfs1;
	}

	public String getJxnlpg() {
		return this.jxnlpg;
	}

	public void setJxnlpg(String jxnlpg) {
		this.jxnlpg = jxnlpg;
	}

	public String getJiaoxuenengli() {
		return this.jiaoxuenengli;
	}

	public void setJiaoxuenengli(String jiaoxuenengli) {
		this.jiaoxuenengli = jiaoxuenengli;
	}

	public Double getSjhjfs2() {
		return this.sjhjfs2;
	}

	public void setSjhjfs2(Double sjhjfs2) {
		this.sjhjfs2 = sjhjfs2;
	}

	public Double getSjhjfs1() {
		return this.sjhjfs1;
	}

	public void setSjhjfs1(Double sjhjfs1) {
		this.sjhjfs1 = sjhjfs1;
	}

	public String getSjhjpg() {
		return this.sjhjpg;
	}

	public void setSjhjpg(String sjhjpg) {
		this.sjhjpg = sjhjpg;
	}

	public String getShijianhuanjing() {
		return this.shijianhuanjing;
	}

	public void setShijianhuanjing(String shijianhuanjing) {
		this.shijianhuanjing = shijianhuanjing;
	}

	public Double getKcmyfs2() {
		return this.kcmyfs2;
	}

	public void setKcmyfs2(Double kcmyfs2) {
		this.kcmyfs2 = kcmyfs2;
	}

	public Double getKcmyfs1() {
		return this.kcmyfs1;
	}

	public void setKcmyfs1(Double kcmyfs1) {
		this.kcmyfs1 = kcmyfs1;
	}

	public String getKcmypg() {
		return this.kcmypg;
	}

	public void setKcmypg(String kcmypg) {
		this.kcmypg = kcmypg;
	}

	public String getKechengmanyi() {
		return this.kechengmanyi;
	}

	public void setKechengmanyi(String kechengmanyi) {
		this.kechengmanyi = kechengmanyi;
	}

	public Set getXpinggubiaozhuns() {
		return this.xpinggubiaozhuns;
	}

	public void setXpinggubiaozhuns(Set xpinggubiaozhuns) {
		this.xpinggubiaozhuns = xpinggubiaozhuns;
	}

}