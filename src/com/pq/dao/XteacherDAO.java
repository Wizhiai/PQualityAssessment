package com.pq.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pq.domain.Xteacher;

/**
 * A data access object (DAO) providing persistence and search support for
 * Xteacher entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.pq.domain.Xteacher
 * @author MyEclipse Persistence Tools
 */

public class XteacherDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XteacherDAO.class);
	// property constants
	public static final String PROFESSIONALTITLE = "professionaltitle";
	public static final String CONTACT = "contact";
	public static final String AGE = "age";
	public static final String NAME = "name";
	public static final String XNO = "xno";

	protected void initDao() {
		// do nothing
	}

	public void save(Xteacher transientInstance) {
		log.debug("saving Xteacher instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xteacher persistentInstance) {
		log.debug("deleting Xteacher instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xteacher findById(java.lang.Integer id) {
		log.debug("getting Xteacher instance with id: " + id);
		try {
			Xteacher instance = (Xteacher) getHibernateTemplate().get(
					"com.pq.domain.Xteacher", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xteacher instance) {
		log.debug("finding Xteacher instance by example");
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
		log.debug("finding Xteacher instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Xteacher as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByProfessionaltitle(Object professionaltitle) {
		return findByProperty(PROFESSIONALTITLE, professionaltitle);
	}

	public List findByContact(Object contact) {
		return findByProperty(CONTACT, contact);
	}

	public List findByAge(Object age) {
		return findByProperty(AGE, age);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByXno(Object xno) {
		return findByProperty(XNO, xno);
	}

	public List findAll() {
		log.debug("finding all Xteacher instances");
		try {
			String queryString = "from Xteacher";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	

	public Xteacher merge(Xteacher detachedInstance) {
		log.debug("merging Xteacher instance");
		try {
			Xteacher result = (Xteacher) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xteacher instance) {
		log.debug("attaching dirty Xteacher instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xteacher instance) {
		log.debug("attaching clean Xteacher instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XteacherDAO getFromApplicationContext(ApplicationContext ctx) {
		return (XteacherDAO) ctx.getBean("XteacherDAO");
	}
}