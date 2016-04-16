package com.pq.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Xsysjdjianshe entity. @author MyEclipse Persistence Tools
 */

public class Xsysjdjianshe implements java.io.Serializable {

	// Fields

	private Integer id;
	private String conclusion;
	private String jieshu;
	private String grade;
	private Double total2;
	private Double total1;
	private Double yrqyfs2;
	private Double yrqyfs1;
	private String yrqypg;
	private String yongrenqiye;
	private Double zgrzfs2;
	private Double zgrzfs1;
	private String zgrzpg;
	private String zigerenzheng;
	private Double zdsysfs2;
	private Double zdsysfs1;
	private String zdsyspg;
	private String zhongdianshiyanshi;
	private Double swjdfs2;
	private Double swjdfs1;
	private String xwjdpg;
	private String xiaowaijidi;
	private Double syszdfs2;
	private Double syszdfs1;
	private String syszdpg;
	private String shiyanshizhidu;
	private Double sysjsfs2;
	private Double sysjsfs1;
	private String sysjspg;
	private String shiyanshijianshe;
	private Double sbtrfs2;
	private Double sbtrfs1;
	private String sbtrpg;
	private String shebeitouru;
	private Set xpinggubiaozhuns = new HashSet(0);

	// Constructors

	/** default constructor */
	public Xsysjdjianshe() {
	}

	/** minimal constructor */
	public Xsysjdjianshe(String jieshu) {
		this.jieshu = jieshu;
	}

	/** full constructor */
	public Xsysjdjianshe(String conclusion, String jieshu, String grade,
			Double total2, Double total1, Double yrqyfs2, Double yrqyfs1,
			String yrqypg, String yongrenqiye, Double zgrzfs2, Double zgrzfs1,
			String zgrzpg, String zigerenzheng, Double zdsysfs2,
			Double zdsysfs1, String zdsyspg, String zhongdianshiyanshi,
			Double swjdfs2, Double swjdfs1, String xwjdpg, String xiaowaijidi,
			Double syszdfs2, Double syszdfs1, String syszdpg,
			String shiyanshizhidu, Double sysjsfs2, Double sysjsfs1,
			String sysjspg, String shiyanshijianshe, Double sbtrfs2,
			Double sbtrfs1, String sbtrpg, String shebeitouru,
			Set xpinggubiaozhuns) {
		this.conclusion = conclusion;
		this.jieshu = jieshu;
		this.grade = grade;
		this.total2 = total2;
		this.total1 = total1;
		this.yrqyfs2 = yrqyfs2;
		this.yrqyfs1 = yrqyfs1;
		this.yrqypg = yrqypg;
		this.yongrenqiye = yongrenqiye;
		this.zgrzfs2 = zgrzfs2;
		this.zgrzfs1 = zgrzfs1;
		this.zgrzpg = zgrzpg;
		this.zigerenzheng = zigerenzheng;
		this.zdsysfs2 = zdsysfs2;
		this.zdsysfs1 = zdsysfs1;
		this.zdsyspg = zdsyspg;
		this.zhongdianshiyanshi = zhongdianshiyanshi;
		this.swjdfs2 = swjdfs2;
		this.swjdfs1 = swjdfs1;
		this.xwjdpg = xwjdpg;
		this.xiaowaijidi = xiaowaijidi;
		this.syszdfs2 = syszdfs2;
		this.syszdfs1 = syszdfs1;
		this.syszdpg = syszdpg;
		this.shiyanshizhidu = shiyanshizhidu;
		this.sysjsfs2 = sysjsfs2;
		this.sysjsfs1 = sysjsfs1;
		this.sysjspg = sysjspg;
		this.shiyanshijianshe = shiyanshijianshe;
		this.sbtrfs2 = sbtrfs2;
		this.sbtrfs1 = sbtrfs1;
		this.sbtrpg = sbtrpg;
		this.shebeitouru = shebeitouru;
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

	public Double getYrqyfs2() {
		return this.yrqyfs2;
	}

	public void setYrqyfs2(Double yrqyfs2) {
		this.yrqyfs2 = yrqyfs2;
	}

	public Double getYrqyfs1() {
		return this.yrqyfs1;
	}

	public void setYrqyfs1(Double yrqyfs1) {
		this.yrqyfs1 = yrqyfs1;
	}

	public String getYrqypg() {
		return this.yrqypg;
	}

	public void setYrqypg(String yrqypg) {
		this.yrqypg = yrqypg;
	}

	public String getYongrenqiye() {
		return this.yongrenqiye;
	}

	public void setYongrenqiye(String yongrenqiye) {
		this.yongrenqiye = yongrenqiye;
	}

	public Double getZgrzfs2() {
		return this.zgrzfs2;
	}

	public void setZgrzfs2(Double zgrzfs2) {
		this.zgrzfs2 = zgrzfs2;
	}

	public Double getZgrzfs1() {
		return this.zgrzfs1;
	}

	public void setZgrzfs1(Double zgrzfs1) {
		this.zgrzfs1 = zgrzfs1;
	}

	public String getZgrzpg() {
		return this.zgrzpg;
	}

	public void setZgrzpg(String zgrzpg) {
		this.zgrzpg = zgrzpg;
	}

	public String getZigerenzheng() {
		return this.zigerenzheng;
	}

	public void setZigerenzheng(String zigerenzheng) {
		this.zigerenzheng = zigerenzheng;
	}

	public Double getZdsysfs2() {
		return this.zdsysfs2;
	}

	public void setZdsysfs2(Double zdsysfs2) {
		this.zdsysfs2 = zdsysfs2;
	}

	public Double getZdsysfs1() {
		return this.zdsysfs1;
	}

	public void setZdsysfs1(Double zdsysfs1) {
		this.zdsysfs1 = zdsysfs1;
	}

	public String getZdsyspg() {
		return this.zdsyspg;
	}

	public void setZdsyspg(String zdsyspg) {
		this.zdsyspg = zdsyspg;
	}

	public String getZhongdianshiyanshi() {
		return this.zhongdianshiyanshi;
	}

	public void setZhongdianshiyanshi(String zhongdianshiyanshi) {
		this.zhongdianshiyanshi = zhongdianshiyanshi;
	}

	public Double getSwjdfs2() {
		return this.swjdfs2;
	}

	public void setSwjdfs2(Double swjdfs2) {
		this.swjdfs2 = swjdfs2;
	}

	public Double getSwjdfs1() {
		return this.swjdfs1;
	}

	public void setSwjdfs1(Double swjdfs1) {
		this.swjdfs1 = swjdfs1;
	}

	public String getXwjdpg() {
		return this.xwjdpg;
	}

	public void setXwjdpg(String xwjdpg) {
		this.xwjdpg = xwjdpg;
	}

	public String getXiaowaijidi() {
		return this.xiaowaijidi;
	}

	public void setXiaowaijidi(String xiaowaijidi) {
		this.xiaowaijidi = xiaowaijidi;
	}

	public Double getSyszdfs2() {
		return this.syszdfs2;
	}

	public void setSyszdfs2(Double syszdfs2) {
		this.syszdfs2 = syszdfs2;
	}

	public Double getSyszdfs1() {
		return this.syszdfs1;
	}

	public void setSyszdfs1(Double syszdfs1) {
		this.syszdfs1 = syszdfs1;
	}

	public String getSyszdpg() {
		return this.syszdpg;
	}

	public void setSyszdpg(String syszdpg) {
		this.syszdpg = syszdpg;
	}

	public String getShiyanshizhidu() {
		return this.shiyanshizhidu;
	}

	public void setShiyanshizhidu(String shiyanshizhidu) {
		this.shiyanshizhidu = shiyanshizhidu;
	}

	public Double getSysjsfs2() {
		return this.sysjsfs2;
	}

	public void setSysjsfs2(Double sysjsfs2) {
		this.sysjsfs2 = sysjsfs2;
	}

	public Double getSysjsfs1() {
		return this.sysjsfs1;
	}

	public void setSysjsfs1(Double sysjsfs1) {
		this.sysjsfs1 = sysjsfs1;
	}

	public String getSysjspg() {
		return this.sysjspg;
	}

	public void setSysjspg(String sysjspg) {
		this.sysjspg = sysjspg;
	}

	public String getShiyanshijianshe() {
		return this.shiyanshijianshe;
	}

	public void setShiyanshijianshe(String shiyanshijianshe) {
		this.shiyanshijianshe = shiyanshijianshe;
	}

	public Double getSbtrfs2() {
		return this.sbtrfs2;
	}

	public void setSbtrfs2(Double sbtrfs2) {
		this.sbtrfs2 = sbtrfs2;
	}

	public Double getSbtrfs1() {
		return this.sbtrfs1;
	}

	public void setSbtrfs1(Double sbtrfs1) {
		this.sbtrfs1 = sbtrfs1;
	}

	public String getSbtrpg() {
		return this.sbtrpg;
	}

	public void setSbtrpg(String sbtrpg) {
		this.sbtrpg = sbtrpg;
	}

	public String getShebeitouru() {
		return this.shebeitouru;
	}

	public void setShebeitouru(String shebeitouru) {
		this.shebeitouru = shebeitouru;
	}

	public Set getXpinggubiaozhuns() {
		return this.xpinggubiaozhuns;
	}

	public void setXpinggubiaozhuns(Set xpinggubiaozhuns) {
		this.xpinggubiaozhuns = xpinggubiaozhuns;
	}

}