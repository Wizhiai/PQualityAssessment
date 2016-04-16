package com.pq.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pq.domain.Xpinggubiaozhun;

/**
 * A data access object (DAO) providing persistence and search support for
 * Xpinggubiaozhun entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.pq.domain.Xpinggubiaozhun
 * @author MyEclipse Persistence Tools
 */

public class XpinggubiaozhunDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XpinggubiaozhunDAO.class);
	// property constants
	public static final String CONCLUSION = "conclusion";
	public static final String JIESHU = "jieshu";
	public static final String TOTAL2 = "total2";
	public static final String TOTAL1 = "total1";
	public static final String GRADE = "grade";

	protected void initDao() {
		// do nothing
	}

	public void save(Xpinggubiaozhun transientInstance) {
		log.debug("saving Xpinggubiaozhun instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xpinggubiaozhun persistentInstance) {
		log.debug("deleting Xpinggubiaozhun instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xpinggubiaozhun findById(java.lang.Integer id) {
		log.debug("getting Xpinggubiaozhun instance with id: " + id);
		try {
			Xpinggubiaozhun instance = (Xpinggubiaozhun) getHibernateTemplate()
					.get("com.pq.domain.Xpinggubiaozhun", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xpinggubiaozhun instance) {
		log.debug("finding Xpinggubiaozhun instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Xpinggubiaozhun instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Xpinggubiaozhun as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByConclusion(Object conclusion) {
		return findByProperty(CONCLUSION, conclusion);
	}

	public List findByJieshu(Object jieshu) {
		return findByProperty(JIESHU, jieshu);
	}

	public List findByTotal2(Object total2) {
		return findByProperty(TOTAL2, total2);
	}

	public List findByTotal1(Object total1) {
		return findByProperty(TOTAL1, total1);
	}

	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	public List findAll() {
		log.debug("finding all Xpinggubiaozhun instances");
		try {
			String queryString = "from Xpinggubiaozhun";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xpinggubiaozhun merge(Xpinggubiaozhun detachedInstance) {
		log.debug("merging Xpinggubiaozhun instance");
		try {
			Xpinggubiaozhun result = (Xpinggubiaozhun) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xpinggubiaozhun instance) {
		log.debug("attaching dirty Xpinggubiaozhun instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xpinggubiaozhun instance) {
		log.debug("attaching clean Xpinggubiaozhun instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XpinggubiaozhunDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (XpinggubiaozhunDAO) ctx.getBean("XpinggubiaozhunDAO");
	}
}