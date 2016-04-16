package com.pq.action;

import java.util.List;

import com.pq.domain.Xevaluate;
import com.pq.service.EvaluateService;
import com.pq.service.XevaluateService;
import com.pq.service.XpinggubiaozhunService;

public class ScoreAction extends BaseAction {
	/**
	 * 
	 */

	private XevaluateService xeservice;
	private Xevaluate xevaluate;
	private EvaluateService evservice;
    private XpinggubiaozhunService xpgbzservice; 
	
	public XpinggubiaozhunService getXpgbzservice() {
		return xpgbzservice;
	}

	public void setXpgbzservice(XpinggubiaozhunService xpgbzservice) {
		this.xpgbzservice = xpgbzservice;
	}

	public EvaluateService getEvservice() {
		return evservice;
	}

	public void setEvservice(EvaluateService evservice) {
		this.evservice = evservice;
	}

	public XevaluateService getXeservice() {
		return xeservice;
	}

	public void setXeservice(XevaluateService xeservice) {
		this.xeservice = xeservice;
	}

	public Xevaluate getXevaluate() {
		return xevaluate;
	}

	public void setXevaluate(Xevaluate xevaluate) {
		this.xevaluate = xevaluate;
	}

	

	public String findList()
	{
		List list=xeservice.findAll();
		request.setAttribute("list", list);
		return "list";
	}
	public String deleteScoreList()
	{
		Xevaluate xe=xeservice.findXeById(xevaluate.getId());
		
		xeservice.dropXevaluate(xe);
		List list=xeservice.findAll();
		if(list.size()!=0)
		{
			request.setAttribute("list", list);
			
			return "list";
		}else
		{
			request.setAttribute("emptydata","数据库为空！！");
			return "emptydata";
		}
	}
	
	public String addScoreList()
	{
		if(xevaluate.getJieshu()==null||xevaluate.getJieshu().trim().equals(""))
		{
			request.setAttribute("emptyinput", "届数不能为空！！");
			
			return "failepage";
		}
		if(xevaluate.getTname()==null||xevaluate.getTname().trim().equals(""))
		{
			request.setAttribute("emptyinput", "姓名不能为空！！");
			
			return "failepage";
		}
		xeservice.addXevaluate(xevaluate);
		
		List list=xeservice.findAll();
		
			request.setAttribute("list", list);
			return "list";
		

		
		}
	public String yearList()
	{
		String year=this.getRequest().getParameter("year");
		
		List yearlist=xeservice.yearList(year);
		if(yearlist.size()!=0)
		{
			request.setAttribute("yearlist",yearlist);
			return "yearlist";
		}else
		{
			request.setAttribute("emptydata","数据库为空！！");
			return "emptydata";
			
		}
	}
	public String evaluateFunction()
	{
		String year=this.getRequest().getParameter("year");
		if(xpgbzservice.findByJieshu(year))
		{
			evservice.evaluate(year);
			request.setAttribute("sucess","评估成功");
			return "success_evaluate";
		}else{
			request.setAttribute("failed","评估失败");
			return "failed_evaluate";
		}
		
	}
}
	

