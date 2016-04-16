package com.pq.service;

import java.util.ArrayList;
import java.util.List;

import com.pq.dao.XevaluateDAO;
import com.pq.domain.Xevaluate;

public class XevaluateService {
	private XevaluateDAO xevaluedao;
	
	
	public XevaluateDAO getXevaluedao() {
		return xevaluedao;
	}


	public void setXevaluedao(XevaluateDAO xevaluedao) {
		this.xevaluedao = xevaluedao;
	}

	
	

	public void commit(List<Xevaluate> list)
	{
		for (Xevaluate xevaluate:list)
		{
			xevaluedao.save(xevaluate);
		    
		}
	}
	
	
	public List findAll()
	{
		
		return xevaluedao.findAll();
	}
	public List yearList(String jieshu)
	{
		
		return xevaluedao.findByJieshu(jieshu);
	}
	
	public void dropXevaluate(Xevaluate xe) 
	{
		
		
			xevaluedao.delete(xe);
		
	}
	public Xevaluate findXeById(int id)
	{
		return xevaluedao.findById(id);
	}

	public  void addXevaluate(Xevaluate xe)
	{
		xevaluedao.save(xe);
	}
	

}
