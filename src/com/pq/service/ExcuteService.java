package com.pq.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pq.dao.XbiyspingjiaDAO;
import com.pq.dao.XevaluateDAO;
import com.pq.dao.XjiaoxuetixiDAO;
import com.pq.dao.XjxgcjiankongDAO;
import com.pq.dao.XpinggubiaozhunDAO;
import com.pq.dao.XsjjxxiaoguoDAO;
import com.pq.dao.XsysjdjiansheDAO;
import com.pq.dao.XszjsglzdDAO;
import com.pq.domain.Xpinggubiaozhun;

public class ExcuteService {
	private XpinggubiaozhunDAO xpingdao;
	private XjiaoxuetixiDAO xjiaodao;
	private XsysjdjiansheDAO xsysdao;
	private XjxgcjiankongDAO xjxgcdao;
	private XszjsglzdDAO xszjsdao;
	private XsjjxxiaoguoDAO xsjjxdao;
	private XbiyspingjiaDAO xbiyedao;
	
	public XpinggubiaozhunDAO getXpingdao() {
		return xpingdao;
	}
	public void setXpingdao(XpinggubiaozhunDAO xpingdao) {
		this.xpingdao = xpingdao;
	}
	public XjiaoxuetixiDAO getXjiaodao() {
		return xjiaodao;
	}
	public void setXjiaodao(XjiaoxuetixiDAO xjiaodao) {
		this.xjiaodao = xjiaodao;
	}
	public XsysjdjiansheDAO getXsysdao() {
		return xsysdao;
	}
	public void setXsysdao(XsysjdjiansheDAO xsysdao) {
		this.xsysdao = xsysdao;
	}
	public XjxgcjiankongDAO getXjxgcdao() {
		return xjxgcdao;
	}
	public void setXjxgcdao(XjxgcjiankongDAO xjxgcdao) {
		this.xjxgcdao = xjxgcdao;
	}
	public XszjsglzdDAO getXszjsdao() {
		return xszjsdao;
	}
	public void setXszjsdao(XszjsglzdDAO xszjsdao) {
		this.xszjsdao = xszjsdao;
	}
	public XsjjxxiaoguoDAO getXsjjxdao() {
		return xsjjxdao;
	}
	public void setXsjjxdao(XsjjxxiaoguoDAO xsjjxdao) {
		this.xsjjxdao = xsjjxdao;
	}
	public XbiyspingjiaDAO getXbiyedao() {
		return xbiyedao;
	}
	public void setXbiyedao(XbiyspingjiaDAO xbiyedao) {
		this.xbiyedao = xbiyedao;
	}
	
	
	
	public List showAll()
	{
		
		return xpingdao.findAll();
		
	}
	public Xpinggubiaozhun showDetail(Integer id) {
		Xpinggubiaozhun biaozhun = xpingdao.findById(id);
		biaozhun.setXjiaoxuetixi(xjiaodao.findById(biaozhun.getXjiaoxuetixi().getId()));
		biaozhun.setXsysjdjianshe(xsysdao.findById(biaozhun.getXsysjdjianshe().getId()));
		biaozhun.setXjxgcjiankong(xjxgcdao.findById(biaozhun.getXjxgcjiankong().getId()));
		biaozhun.setXszjsglzd(xszjsdao.findById(biaozhun.getXszjsglzd().getId()));
		biaozhun.setXsjjxxiaoguo(xsjjxdao.findById(biaozhun.getXsjjxxiaoguo().getId()));
		biaozhun.setXbiyspingjia(xbiyedao.findById(biaozhun.getXbiyspingjia().getId()));
		return biaozhun;
	}
	public void deleteBiaozhun(Integer id)
	{
		Xpinggubiaozhun biaozhun = xpingdao.findById(id);
		xjiaodao.delete(xjiaodao.findById(biaozhun.getXjiaoxuetixi().getId()));
		xsysdao.delete(xsysdao.findById(biaozhun.getXsysjdjianshe().getId()));
		xjxgcdao.delete(xjxgcdao.findById(biaozhun.getXjxgcjiankong().getId()));
		xszjsdao.delete(xszjsdao.findById(biaozhun.getXszjsglzd().getId()));
		xsjjxdao.delete(xsjjxdao.findById(biaozhun.getXsjjxxiaoguo().getId()));
		xbiyedao.delete(xbiyedao.findById(biaozhun.getXbiyspingjia().getId()));
//		xpingdao.delete(biaozhun);
		
	}
	public void addDetail(Xpinggubiaozhun biaozhun)
	{
		
		xjiaodao.attachDirty(biaozhun.getXjiaoxuetixi());
		xsysdao.attachDirty(biaozhun.getXsysjdjianshe());
		xjxgcdao.attachDirty(biaozhun.getXjxgcjiankong());
		xszjsdao.attachDirty(biaozhun.getXszjsglzd());
		xsjjxdao.attachDirty(biaozhun.getXsjjxxiaoguo());
		xbiyedao.attachDirty(biaozhun.getXbiyspingjia());
		xpingdao.attachDirty(biaozhun);
	}
}
