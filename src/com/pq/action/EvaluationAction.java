package com.pq.action;

import java.util.List;

import com.pq.domain.Xjiaoxuetixi;
import com.pq.domain.Xpinggubiaozhun;
import com.pq.service.ExcuteService;

public class EvaluationAction extends BaseAction {
	private ExcuteService excuteservice;
	private Xpinggubiaozhun xpgbz;

	

	public Xpinggubiaozhun getXpgbz() {
		return xpgbz;
	}

	public void setXpgbz(Xpinggubiaozhun xpgbz) {
		this.xpgbz = xpgbz;
	}

	public ExcuteService getExcuteservice() {
		return excuteservice;
	}

	public void setExcuteservice(ExcuteService excuteservice) {
		this.excuteservice = excuteservice;
	}
	public String findList()
	{
		List evaluationlist=excuteservice.showAll();
		
			request.setAttribute("evaluationlist",evaluationlist);
			return "evaluationlist";
		
	}
	public String detailEvaluation()
	{
		xpgbz=excuteservice.showDetail(xpgbz.getId());
		
		if(xpgbz.getConclusion()==null)
		{
			request.setAttribute("detail_add",xpgbz);
			return "detail_add";
		}else
		{
			request.setAttribute("detail",xpgbz);
			return "detail";
		}
	}
	@SuppressWarnings("unchecked")
	public String deleteEvaluation()
	{
		excuteservice.deleteBiaozhun(xpgbz.getId());
		
		List evaluationlist=excuteservice.showAll();
		
		request.setAttribute("evaluationlist",evaluationlist);
		
		return "evaluationlist";
	}
	public String detailAddEvaluation()
	{
		excuteservice.addDetail(xpgbz);
		xpgbz=excuteservice.showDetail(xpgbz.getId());
		request.setAttribute("detail",xpgbz);
		return "detail";
	}

}
