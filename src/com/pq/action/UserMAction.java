package com.pq.action;

import java.util.List;

import com.pq.domain.User;
import com.pq.service.UserService;

public class UserMAction extends BaseAction {
	
	private UserService userservice;
	private User user;
	
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	
	public String findList()
	{
		
		List list=userservice.findAll();
		
		
			request.setAttribute("list", list);
			return "list";
		
	}
	public String addUser()
	{
		if(user.getUno()==null||user.getUno().trim().equals("")){
			request.setAttribute("unoerror", "用户名不能为空！！");
			
			return "failepage";
		}
		
		if(user.getUpwd()==null||user.getUpwd().equals(""))
		{
			request.setAttribute("upwderror", "密码不能为空！！");
			return "failepage";
		}
		if(userservice.findUserByuno(user.getUno()))
		{
			
			request.setAttribute("unoerror", "用户名已存在！！");
			return "failepage";
		}
		userservice.addUser(user);
		
		List list=userservice.findAll();
		
		
			request.setAttribute("list", list);
			return "list";
		
	}
	public String deleteUser()
	{
		
		User duser=userservice.findUserByid(user.getId());
		userservice.deleteUser(duser);
		
		List list=userservice.findAll();
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
	

}
