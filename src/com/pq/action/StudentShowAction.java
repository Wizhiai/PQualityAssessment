package com.pq.action;

import java.util.List;

import com.pq.domain.Xpinggubiaozhun;
import com.pq.service.ExcuteService;

public class StudentShowAction extends BaseAction {
	private ExcuteService excuteservice;
	private Xpinggubiaozhun xpgbz;
	
	public ExcuteService getExcuteservice() {
		return excuteservice;
	}

	public void setExcuteservice(ExcuteService excuteservice) {
		this.excuteservice = excuteservice;
	}

	public Xpinggubiaozhun getXpgbz() {
		return xpgbz;
	}

	public void setXpgbz(Xpinggubiaozhun xpgbz) {
		this.xpgbz = xpgbz;
	}
	public String findList()
	{
		List evaluationlist=excuteservice.showAll();
		
			request.setAttribute("evaluationlist",evaluationlist);
			return "evaluationlist";
		
	}

	public String evaluationShow()
	{
		xpgbz=excuteservice.showDetail(xpgbz.getId());
		request.setAttribute("detail",xpgbz);
		return "detail";
	}

}
