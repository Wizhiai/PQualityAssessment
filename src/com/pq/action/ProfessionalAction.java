package com.pq.action;

import java.util.List;

import com.pq.domain.Xprofessional;
import com.pq.domain.Xteacher;
import com.pq.service.XteacherService;



public class ProfessionalAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private XteacherService xteacherservice;
	private Xteacher xteacher;
	private Xprofessional xprofessional;
	public Xprofessional getXprofessional() {
		return xprofessional;
	}
	public void setXprofessional(Xprofessional xprofessional) {
		this.xprofessional = xprofessional;
	}
	public Xteacher getXteacher() {
		return xteacher;
	}
	public void setXteacher(Xteacher xteacher) {
		this.xteacher = xteacher;
	}
	public XteacherService getXteacherservice() {
		return xteacherservice;
	}
	public void setXteacherservice(XteacherService xteacherservice) {
		this.xteacherservice = xteacherservice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public String findList()
	{
		
		List list=xteacherservice.fianAll();
	
			request.setAttribute("list",list);
			return "list";
		
		
		
	}
	public String deleteTeacher()
	{
		
		xteacherservice.deleteTeacher(xteacher.getId());
			List list=xteacherservice.fianAll();
			request.setAttribute("list",list);
			return "list";
		
		
		
	}
	public String addTeacher()
	{
		
		if(xteacherservice.addTeacher(xteacher))
		{
			List list=xteacherservice.fianAll();
			request.setAttribute("list",list);
			return "list";
		}else
		{
			request.setAttribute("failed","不能重复添加！！");
			return "failed";
		}
		
	}
	public String findListJury()
	{
		List listjury=xteacherservice.fiandAllJury();
		request.setAttribute("listjury",listjury);
		return "listjury";
	}
	
	public String setJury()
	{
		List setlist=xteacherservice.generateJury(3);
		
		String jieshu=this.getRequest().getParameter("jieshu");
		this.getRequest().setAttribute("jieshu", jieshu);
		if(setlist.size()==0)
		{
			request.setAttribute("emptydata","专家库为空！！");
			return "emptydata";
		}else
		{
			if(xteacherservice.fiandJuryByjieshu(jieshu).size()==0)
		
			{
				for(int i=0;i<setlist.size();i++)
				{
					Xteacher xt=(Xteacher) setlist.get(i);
					Xprofessional xp=new Xprofessional();
					xp.setName(xt.getName());
					xp.setXteacher(xt);
					xp.setZhiwei("委员");
					xp.setJieshu(jieshu);
					xteacherservice.addProfessional(xp);
					
				}
			
				request.setAttribute("setlist",setlist);
				
				return "setlist";
			}else
			{
				request.setAttribute("alreadyexists","此届专家委员会已经创建");
				
				return "alreadyexists";
			}
		}
	}
	public String deleteJury()
	{
		xteacherservice.deleteJury(xprofessional.getId());
		List listjury=xteacherservice.fiandAllJury();
		request.setAttribute("listjury",listjury);
		return "listjury";
		
	}
	public String setZhiwei(){
		
		String idString = this.getRequest().getParameter("radio");
		String jieshu = this.getRequest().getParameter("jieshu");
		int  id = Integer.valueOf(idString);
		;
		xteacherservice.setJuryZhiwei(id, jieshu);
		
		
		
		List listjury=xteacherservice.fiandAllJury();
		request.setAttribute("listjury",listjury);
		return "listjury";
	}
	
}
