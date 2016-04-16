package com.pq.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pq.dao.XprofessionalDAO;
import com.pq.dao.XteacherDAO;
import com.pq.domain.Xprofessional;
import com.pq.domain.Xteacher;

public class XteacherService {
	private XteacherDAO xteacherdao;
	private XprofessionalDAO xprofessionaldao;

	public XprofessionalDAO getXprofessionaldao() {
		return xprofessionaldao;
	}

	public void setXprofessionaldao(XprofessionalDAO xprofessionaldao) {
		this.xprofessionaldao = xprofessionaldao;
	}

	public XteacherDAO getXteacherdao() {
		return xteacherdao;
	}

	public void setXteacherdao(XteacherDAO xteacherdao) {
		this.xteacherdao = xteacherdao;
	}

	public List fianAll() {

		return xteacherdao.findAll();
	}

	public boolean deleteTeacher(Integer id) {
		// TODO Auto-generated method stub

		Xteacher teacher = xteacherdao.findById(id);
		if (teacher.equals(null)) {
			return false;
		} else {
			xteacherdao.delete(teacher);
			return true;
		}
	}

	public boolean addTeacher(Xteacher xteacher) {
		// TODO Auto-generated method stub
		if (xteacherdao.findByXno(xteacher.getXno()).size() == 0) {
			xteacherdao.save(xteacher);
			return true;
		} else {
			return false;
		}
	}

	public List fiandAllJury() {
		// TODO Auto-generated method stub
		List list = xprofessionaldao.findAll();
		return list;
	}

	public List<Xteacher> generateJury(int num) {
		List<Xteacher> list = xteacherdao.findAll();
		List listjurynum = new ArrayList();
		if (list.size() == 0) {
			return null;
		} else {
			Random rand = new Random();
			while (num > 0) {
				int temp = rand.nextInt(list.size());
				if (listjurynum.contains(list.get(temp))) {
					continue;
				} else {
					listjurynum.add(list.get(temp));
					num--;
				}
			}
		}
		return listjurynum;
	}

	public void addProfessional(Xprofessional xp) {
		// TODO Auto-generated method stub
		xprofessionaldao.save(xp);
	}

	public List fiandJuryByjieshu(String jieshu) {
		// TODO Auto-generated method stub
		return xprofessionaldao.findByJieshu(jieshu);
	}

	public void deleteJury(Integer id) {
		// TODO Auto-generated method stub
		xprofessionaldao.delete((xprofessionaldao.findById(id)));
	}
	public void setJuryZhiwei(int id,String jieshu)
	{
		SessionFactory sf =  this.getXprofessionaldao().getSessionFactory();
		Session session = sf.openSession();
		String sql = " select id from Xprofessional where teacher='"+id+"'and jieshu='"+jieshu+"'";
		Query query = session.createSQLQuery(sql);
		List<Object> xp = query.list();
		if(xp.size()==1){
			
			Object xxx =  xp.get(0);
			int xid = Integer.parseInt(xxx.toString());
			System.out.print(xxx.toString());
			Xprofessional xpro = xprofessionaldao.findById(xid);
			xpro.setZhiwei("主任");
			xprofessionaldao.attachDirty(xpro);
		}
	}

}
