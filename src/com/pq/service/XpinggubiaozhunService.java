package com.pq.service;

import com.pq.dao.XpinggubiaozhunDAO;

public class XpinggubiaozhunService {
	private XpinggubiaozhunDAO xpgbzdao;

	public XpinggubiaozhunDAO getXpgbzdao() {
		return xpgbzdao;
	}

	public void setXpgbzdao(XpinggubiaozhunDAO xpgbzdao) {
		this.xpgbzdao = xpgbzdao;
	}
	
	public Boolean findByJieshu(String jieshu)
	{
		if(xpgbzdao.findByJieshu(jieshu).size()==0)
		{
			return true;
		}else
		{
			return false;
		}
	}

}
