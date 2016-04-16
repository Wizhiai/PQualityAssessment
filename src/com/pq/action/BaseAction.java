package com.pq.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
//import org.springframework.we

public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware {
//	ContextLoaderListener
	public HttpServletRequest request = null;
	public HttpServletResponse response = null;
	public HttpSession session = null;
//	ContextLoaderListener
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
	}
	
	public void setServletRequest(HttpServletRequest req) {
		// TODO Auto-generated method stub
		this.request = req;
		this.session = req.getSession();
	}
	

	public void setServletResponse(HttpServletResponse res) {
		// TODO Auto-generated method stub
		this.response = res;
		
		
	}

	

}
