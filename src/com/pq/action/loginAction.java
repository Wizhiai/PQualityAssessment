package com.pq.action;

import com.pq.domain.User;
import com.pq.service.LoginService;

public class loginAction extends BaseAction  {
	private LoginService loginservice;
	private User user;
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LoginService getLoginservice() {
		return loginservice;
	}

	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}
	
	public String login(){
		
		if(loginservice.jugeExsist(user.getUno())==null)
		{
			request.setAttribute("nomessage", "用户不存在！！！");
			return "login";
		}else if(loginservice.jugeNoPwd(user.getUno(), user.getUpwd(), user.getUidentity()))
		{
			if(user.getUidentity().equals("学生")){
				return "student_index";
			}else if(user.getUidentity().equals("教师")){
				return "student_index";
			}else{
				return "admin_index";
			}
		}else{
			request.setAttribute("passwdmessage", "密码或身份不正确！！！");
			return "login";
		}
	}

}
