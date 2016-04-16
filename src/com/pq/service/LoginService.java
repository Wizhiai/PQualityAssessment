package com.pq.service;



import java.util.ArrayList;
import java.util.List;



import com.pq.dao.UserDAO;
import com.pq.domain.User;

public class LoginService {
	
	

	private UserDAO ud;
	
	public User jugeExsist(String uno)
	
	{
		if(ud.findByUno(uno).size()==0)
		{
		
			return null ;
			
		}
		else
		{
			return (User) ud.findByUno(uno).get(0);
		}
	}
	
	public Boolean jugeNoPwd(String uno,String upwd,String uidentity)
	{
		List <User> list=new ArrayList<User>();
		list=ud.findByUno(uno);
		if(list.get(0).getUno().equals(uno)&&list.get(0).getUpwd().equals(upwd)&&list.get(0).getUidentity().equals(uidentity))
		{
			
			return true;
		}
		else{
			return false;
		}
	}
    public User findUser(String uno)
    {
    	return (User) ud.findByUno(uno).get(0);
    	
    }
	

	public UserDAO getUd() {
		return ud;
	}

	public void setUd(UserDAO ud) {
		this.ud = ud;
	}
	
	
	

}
