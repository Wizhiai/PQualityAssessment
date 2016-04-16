package com.pq.service;

import java.util.ArrayList;
import java.util.List;

import com.pq.dao.UserDAO;
import com.pq.domain.User;

public class UserService {
	private UserDAO userdao;

	public UserDAO getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}
	
	public void addUser(User user)
	{
		userdao.save(user);
	}
	public List findAll()
	{
		
		return userdao.findAll();
	}
	public void updateUser(User user)
	{
		userdao.attachDirty(user);
	}
	public void deleteUser(User user)
	{
		userdao.delete(user);
	}
	public Boolean findUserByuno(String uno)
	{
		if(userdao.findByUno(uno).size()==0)
		{
			return false;
		}else
		{
			return true;
		}
		
	}
	public User findUserByid(int id)
	{
		return (User) userdao.findById(id);
	}

}
