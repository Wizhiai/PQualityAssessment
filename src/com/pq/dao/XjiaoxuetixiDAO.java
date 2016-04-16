package com.pq.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pq.domain.Xjiaoxuetixi;

/**
 * A data access object (DAO) providing persistence and search support for
 * Xjiaoxuetixi entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.pq.domain.Xjiaoxuetixi
 * @author MyEclipse Persistence Tools
 */

public class XjiaoxuetixiDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XjiaoxuetixiDAO.class);
	// property constants
	public static final String CONCLUSION = "conclusion";
	public static final String GRADE = "grade";
	public static final String TOTAL2 = "total2";
	public static final String TOTAL1 = "total1";
	public static final String JIESHU = "jieshu";
	public static final String XQHZFS2 = "xqhzfs2";
	public static final String XQHZFS1 = "xqhzfs1";
	public static final String XAHZPG = "xahzpg";
	public static final String XIAOQIHEZUO = "xiaoqihezuo";
	public static final String KCDGFS2 = "kcdgfs2";
	public static final String KCDGFS1 = "kcdgfs1";
	public static final String KCDGPG = "kcdgpg";
	public static final String KECHENGDAGANG = "kechengdagang";
	public static final String JXJHFS2 = "jxjhfs2";
	public static final String JXJHFS1 = "jxjhfs1";
	public static final String JXJHPG = "jxjhpg";
	public static final String JIAOXUEJIHUA = "jiaoxuejihua";

	protected void initDao() {
		// do nothing
	}

	public void save(Xjiaoxuetixi transientInstance) {
		log.debug("saving Xjiaoxuetixi instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xjiaoxuetixi persistentInstance) {
		log.debug("deleting Xjiaoxuetixi instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xjiaoxuetixi findById(java.lang.Integer id) {
		log.debug("getting Xjiaoxuetixi instance with id: " + id);
		try {
			Xjiaoxuetixi instance = (Xjiaoxuetixi) getHibernateTemplate().get(
					"com.pq.domain.Xjiaoxuetixi", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xjiaoxuetixi instance) {
		log.debug("finding Xjiaoxuetixi instance by example");
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
		log.debug("finding Xjiaoxuetixi instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Xjiaoxuetixi as model where model."
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

	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	public List findByTotal2(Object total2) {
		return findByProperty(TOTAL2, total2);
	}

	public List findByTotal1(Object total1) {
		return findByProperty(TOTAL1, total1);
	}

	public List findByJieshu(Object jieshu) {
		return findByProperty(JIESHU, jieshu);
	}

	public List findByXqhzfs2(Object xqhzfs2) {
		return findByProperty(XQHZFS2, xqhzfs2);
	}

	public List findByXqhzfs1(Object xqhzfs1) {
		return findByProperty(XQHZFS1, xqhzfs1);
	}

	public List findByXahzpg(Object xahzpg) {
		return findByProperty(XAHZPG, xahzpg);
	}

	public List findByXiaoqihezuo(Object xiaoqihezuo) {
		return findByProperty(XIAOQIHEZUO, xiaoqihezuo);
	}

	public List findByKcdgfs2(Object kcdgfs2) {
		return findByProperty(KCDGFS2, kcdgfs2);
	}

	public List findByKcdgfs1(Object kcdgfs1) {
		return findByProperty(KCDGFS1, kcdgfs1);
	}

	public List findByKcdgpg(Object kcdgpg) {
		return findByProperty(KCDGPG, kcdgpg);
	}

	public List findByKechengdagang(Object kechengdagang) {
		return findByProperty(KECHENGDAGANG, kechengdagang);
	}

	public List findByJxjhfs2(Object jxjhfs2) {
		return findByProperty(JXJHFS2, jxjhfs2);
	}

	public List findByJxjhfs1(Object jxjhfs1) {
		return findByProperty(JXJHFS1, jxjhfs1);
	}

	public List findByJxjhpg(Object jxjhpg) {
		return findByProperty(JXJHPG, jxjhpg);
	}

	public List findByJiaoxuejihua(Object jiaoxuejihua) {
		return findByProperty(JIAOXUEJIHUA, jiaoxuejihua);
	}

	public List findAll() {
		log.debug("finding all Xjiaoxuetixi instances");
		try {
			String queryString = "from Xjiaoxuetixi";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xjiaoxuetixi merge(Xjiaoxuetixi detachedInstance) {
		log.debug("merging Xjiaoxuetixi instance");
		try {
			Xjiaoxuetixi result = (Xjiaoxuetixi) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xjiaoxuetixi instance) {
		log.debug("attaching dirty Xjiaoxuetixi instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xjiaoxuetixi instance) {
		log.debug("attaching clean Xjiaoxuetixi instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XjiaoxuetixiDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (XjiaoxuetixiDAO) ctx.getBean("XjiaoxuetixiDAO");
	}
}