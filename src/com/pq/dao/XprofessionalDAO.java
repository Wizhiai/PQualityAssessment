package com.pq.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pq.domain.Xprofessional;

/**
 * A data access object (DAO) providing persistence and search support for
 * Xprofessional entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.pq.domain.Xprofessional
 * @author MyEclipse Persistence Tools
 */

public class XprofessionalDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XprofessionalDAO.class);
	// property constants
	public static final String ZHIWEI = "zhiwei";
	public static final String NAME = "name";
	public static final String JIESHU = "jieshu";

	protected void initDao() {
		// do nothing
	}

	public void save(Xprofessional transientInstance) {
		log.debug("saving Xprofessional instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xprofessional persistentInstance) {
		log.debug("deleting Xprofessional instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xprofessional findById(java.lang.Integer id) {
		log.debug("getting Xprofessional instance with id: " + id);
		try {
			Xprofessional instance = (Xprofessional) getHibernateTemplate()
					.get("com.pq.domain.Xprofessional", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xprofessional instance) {
		log.debug("finding Xprofessional instance by example");
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
		log.debug("finding Xprofessional instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Xprofessional as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByZhiwei(Object zhiwei) {
		return findByProperty(ZHIWEI, zhiwei);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByJieshu(Object jieshu) {
		return findByProperty(JIESHU, jieshu);
	}

	public List findAll() {
		log.debug("finding all Xprofessional instances");
		try {
			String queryString = "from Xprofessional";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xprofessional merge(Xprofessional detachedInstance) {
		log.debug("merging Xprofessional instance");
		try {
			Xprofessional result = (Xprofessional) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xprofessional instance) {
		log.debug("attaching dirty Xprofessional instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xprofessional instance) {
		log.debug("attaching clean Xprofessional instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}


	public static XprofessionalDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (XprofessionalDAO) ctx.getBean("XprofessionalDAO");
	}
}