package com.pq.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Xjxgcjiankong entity. @author MyEclipse Persistence Tools
 */

public class Xjxgcjiankong implements java.io.Serializable {

	// Fields

	private Integer id;
	private String conclusion;
	private String jieshu;
	private String grade;
	private Double total2;
	private Double total1;
	private Double qydgfs2;
	private Double qydgfs1;
	private String qydgpg;
	private String qiyedinggang;
	private Double zhjnfs2;
	private Double zhjnfs1;
	private String zhjnpg;
	private String zonghejineng;
	private Double rwsfs2;
	private Double rwsfs1;
	private String rwspg;
	private String renwushu;
	private Double jxgcfs2;
	private Double jxgcfs1;
	private String jxgcpg;
	private String jiaoxueguocheng;
	private Double jxzdfs2;
	private Double jxzdfs1;
	private String jxzdpg;
	private String jiaoxuezhidao;
	private Double jxzbfs2;
	private Double jxzbfs1;
	private String jxzbpg;
	private String jiaoxuezhunbei;
	private Set xpinggubiaozhuns = new HashSet(0);

	// Constructors

	/** default constructor */
	public Xjxgcjiankong() {
	}

	/** minimal constructor */
	public Xjxgcjiankong(String jieshu) {
		this.jieshu = jieshu;
	}

	/** full constructor */
	public Xjxgcjiankong(String conclusion, String jieshu, String grade,
			Double total2, Double total1, Double qydgfs2, Double qydgfs1,
			String qydgpg, String qiyedinggang, Double zhjnfs2, Double zhjnfs1,
			String zhjnpg, String zonghejineng, Double rwsfs2, Double rwsfs1,
			String rwspg, String renwushu, Double jxgcfs2, Double jxgcfs1,
			String jxgcpg, String jiaoxueguocheng, Double jxzdfs2,
			Double jxzdfs1, String jxzdpg, String jiaoxuezhidao,
			Double jxzbfs2, Double jxzbfs1, String jxzbpg,
			String jiaoxuezhunbei, Set xpinggubiaozhuns) {
		this.conclusion = conclusion;
		this.jieshu = jieshu;
		this.grade = grade;
		this.total2 = total2;
		this.total1 = total1;
		this.qydgfs2 = qydgfs2;
		this.qydgfs1 = qydgfs1;
		this.qydgpg = qydgpg;
		this.qiyedinggang = qiyedinggang;
		this.zhjnfs2 = zhjnfs2;
		this.zhjnfs1 = zhjnfs1;
		this.zhjnpg = zhjnpg;
		this.zonghejineng = zonghejineng;
		this.rwsfs2 = rwsfs2;
		this.rwsfs1 = rwsfs1;
		this.rwspg = rwspg;
		this.renwushu = renwushu;
		this.jxgcfs2 = jxgcfs2;
		this.jxgcfs1 = jxgcfs1;
		this.jxgcpg = jxgcpg;
		this.jiaoxueguocheng = jiaoxueguocheng;
		this.jxzdfs2 = jxzdfs2;
		this.jxzdfs1 = jxzdfs1;
		this.jxzdpg = jxzdpg;
		this.jiaoxuezhidao = jiaoxuezhidao;
		this.jxzbfs2 = jxzbfs2;
		this.jxzbfs1 = jxzbfs1;
		this.jxzbpg = jxzbpg;
		this.jiaoxuezhunbei = jiaoxuezhunbei;
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

	public Double getQydgfs2() {
		return this.qydgfs2;
	}

	public void setQydgfs2(Double qydgfs2) {
		this.qydgfs2 = qydgfs2;
	}

	public Double getQydgfs1() {
		return this.qydgfs1;
	}

	public void setQydgfs1(Double qydgfs1) {
		this.qydgfs1 = qydgfs1;
	}

	public String getQydgpg() {
		return this.qydgpg;
	}

	public void setQydgpg(String qydgpg) {
		this.qydgpg = qydgpg;
	}

	public String getQiyedinggang() {
		return this.qiyedinggang;
	}

	public void setQiyedinggang(String qiyedinggang) {
		this.qiyedinggang = qiyedinggang;
	}

	public Double getZhjnfs2() {
		return this.zhjnfs2;
	}

	public void setZhjnfs2(Double zhjnfs2) {
		this.zhjnfs2 = zhjnfs2;
	}

	public Double getZhjnfs1() {
		return this.zhjnfs1;
	}

	public void setZhjnfs1(Double zhjnfs1) {
		this.zhjnfs1 = zhjnfs1;
	}

	public String getZhjnpg() {
		return this.zhjnpg;
	}

	public void setZhjnpg(String zhjnpg) {
		this.zhjnpg = zhjnpg;
	}

	public String getZonghejineng() {
		return this.zonghejineng;
	}

	public void setZonghejineng(String zonghejineng) {
		this.zonghejineng = zonghejineng;
	}

	public Double getRwsfs2() {
		return this.rwsfs2;
	}

	public void setRwsfs2(Double rwsfs2) {
		this.rwsfs2 = rwsfs2;
	}

	public Double getRwsfs1() {
		return this.rwsfs1;
	}

	public void setRwsfs1(Double rwsfs1) {
		this.rwsfs1 = rwsfs1;
	}

	public String getRwspg() {
		return this.rwspg;
	}

	public void setRwspg(String rwspg) {
		this.rwspg = rwspg;
	}

	public String getRenwushu() {
		return this.renwushu;
	}

	public void setRenwushu(String renwushu) {
		this.renwushu = renwushu;
	}

	public Double getJxgcfs2() {
		return this.jxgcfs2;
	}

	public void setJxgcfs2(Double jxgcfs2) {
		this.jxgcfs2 = jxgcfs2;
	}

	public Double getJxgcfs1() {
		return this.jxgcfs1;
	}

	public void setJxgcfs1(Double jxgcfs1) {
		this.jxgcfs1 = jxgcfs1;
	}

	public String getJxgcpg() {
		return this.jxgcpg;
	}

	public void setJxgcpg(String jxgcpg) {
		this.jxgcpg = jxgcpg;
	}

	public String getJiaoxueguocheng() {
		return this.jiaoxueguocheng;
	}

	public void setJiaoxueguocheng(String jiaoxueguocheng) {
		this.jiaoxueguocheng = jiaoxueguocheng;
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

	public String getJiaoxuezhidao() {
		return this.jiaoxuezhidao;
	}

	public void setJiaoxuezhidao(String jiaoxuezhidao) {
		this.jiaoxuezhidao = jiaoxuezhidao;
	}

	public Double getJxzbfs2() {
		return this.jxzbfs2;
	}

	public void setJxzbfs2(Double jxzbfs2) {
		this.jxzbfs2 = jxzbfs2;
	}

	public Double getJxzbfs1() {
		return this.jxzbfs1;
	}

	public void setJxzbfs1(Double jxzbfs1) {
		this.jxzbfs1 = jxzbfs1;
	}

	public String getJxzbpg() {
		return this.jxzbpg;
	}

	public void setJxzbpg(String jxzbpg) {
		this.jxzbpg = jxzbpg;
	}

	public String getJiaoxuezhunbei() {
		return this.jiaoxuezhunbei;
	}

	public void setJiaoxuezhunbei(String jiaoxuezhunbei) {
		this.jiaoxuezhunbei = jiaoxuezhunbei;
	}

	public Set getXpinggubiaozhuns() {
		return this.xpinggubiaozhuns;
	}

	public void setXpinggubiaozhuns(Set xpinggubiaozhuns) {
		this.xpinggubiaozhuns = xpinggubiaozhuns;
	}

}