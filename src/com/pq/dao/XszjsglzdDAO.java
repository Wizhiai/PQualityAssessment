package com.pq.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pq.domain.Xszjsglzd;

/**
 * A data access object (DAO) providing persistence and search support for
 * Xszjsglzd entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.pq.domain.Xszjsglzd
 * @author MyEclipse Persistence Tools
 */

public class XszjsglzdDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XszjsglzdDAO.class);
	// property constants
	public static final String CONCLUSION = "conclusion";
	public static final String GRADE = "grade";
	public static final String TOTAL2 = "total2";
	public static final String TOTAL1 = "total1";
	public static final String JIESHU = "jieshu";
	public static final String JLJZFS2 = "jljzfs2";
	public static final String JLJZFS1 = "jljzfs1";
	public static final String JLJZPG = "jljzpg";
	public static final String JILIJIZHI = "jilijizhi";
	public static final String JSDWFS2 = "jsdwfs2";
	public static final String JSDWFS1 = "jsdwfs1";
	public static final String JSDWPG = "jsdwpg";
	public static final String JIAOSHIDUWU = "jiaoshiduwu";
	public static final String JXGGFS2 = "jxggfs2";
	public static final String JXGGFS1 = "jxggfs1";
	public static final String JXGGPG = "jxggpg";
	public static final String JIAOXUEGAIGE = "jiaoxuegaige";
	public static final String JXTXFS2 = "jxtxfs2";
	public static final String JXTXFS1 = "jxtxfs1";
	public static final String JXTXPG = "jxtxpg";
	public static final String JIAOXUETIXI = "jiaoxuetixi";
	public static final String JXZDFS2 = "jxzdfs2";
	public static final String JXZDFS1 = "jxzdfs1";
	public static final String JXZDPG = "jxzdpg";
	public static final String JIAOXUEZHIDU = "jiaoxuezhidu";

	protected void initDao() {
		// do nothing
	}

	public void save(Xszjsglzd transientInstance) {
		log.debug("saving Xszjsglzd instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xszjsglzd persistentInstance) {
		log.debug("deleting Xszjsglzd instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xszjsglzd findById(java.lang.Integer id) {
		log.debug("getting Xszjsglzd instance with id: " + id);
		try {
			Xszjsglzd instance = (Xszjsglzd) getHibernateTemplate().get(
					"com.pq.domain.Xszjsglzd", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xszjsglzd instance) {
		log.debug("finding Xszjsglzd instance by example");
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
		log.debug("finding Xszjsglzd instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Xszjsglzd as model where model."
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

	public List findByJljzfs2(Object jljzfs2) {
		return findByProperty(JLJZFS2, jljzfs2);
	}

	public List findByJljzfs1(Object jljzfs1) {
		return findByProperty(JLJZFS1, jljzfs1);
	}

	public List findByJljzpg(Object jljzpg) {
		return findByProperty(JLJZPG, jljzpg);
	}

	public List findByJilijizhi(Object jilijizhi) {
		return findByProperty(JILIJIZHI, jilijizhi);
	}

	public List findByJsdwfs2(Object jsdwfs2) {
		return findByProperty(JSDWFS2, jsdwfs2);
	}

	public List findByJsdwfs1(Object jsdwfs1) {
		return findByProperty(JSDWFS1, jsdwfs1);
	}

	public List findByJsdwpg(Object jsdwpg) {
		return findByProperty(JSDWPG, jsdwpg);
	}

	public List findByJiaoshiduwu(Object jiaoshiduwu) {
		return findByProperty(JIAOSHIDUWU, jiaoshiduwu);
	}

	public List findByJxggfs2(Object jxggfs2) {
		return findByProperty(JXGGFS2, jxggfs2);
	}

	public List findByJxggfs1(Object jxggfs1) {
		return findByProperty(JXGGFS1, jxggfs1);
	}

	public List findByJxggpg(Object jxggpg) {
		return findByProperty(JXGGPG, jxggpg);
	}

	public List findByJiaoxuegaige(Object jiaoxuegaige) {
		return findByProperty(JIAOXUEGAIGE, jiaoxuegaige);
	}

	public List findByJxtxfs2(Object jxtxfs2) {
		return findByProperty(JXTXFS2, jxtxfs2);
	}

	public List findByJxtxfs1(Object jxtxfs1) {
		return findByProperty(JXTXFS1, jxtxfs1);
	}

	public List findByJxtxpg(Object jxtxpg) {
		return findByProperty(JXTXPG, jxtxpg);
	}

	public List findByJiaoxuetixi(Object jiaoxuetixi) {
		return findByProperty(JIAOXUETIXI, jiaoxuetixi);
	}

	public List findByJxzdfs2(Object jxzdfs2) {
		return findByProperty(JXZDFS2, jxzdfs2);
	}

	public List findByJxzdfs1(Object jxzdfs1) {
		return findByProperty(JXZDFS1, jxzdfs1);
	}

	public List findByJxzdpg(Object jxzdpg) {
		return findByProperty(JXZDPG, jxzdpg);
	}

	public List findByJiaoxuezhidu(Object jiaoxuezhidu) {
		return findByProperty(JIAOXUEZHIDU, jiaoxuezhidu);
	}

	public List findAll() {
		log.debug("finding all Xszjsglzd instances");
		try {
			String queryString = "from Xszjsglzd";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xszjsglzd merge(Xszjsglzd detachedInstance) {
		log.debug("merging Xszjsglzd instance");
		try {
			Xszjsglzd result = (Xszjsglzd) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xszjsglzd instance) {
		log.debug("attaching dirty Xszjsglzd instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xszjsglzd instance) {
		log.debug("attaching clean Xszjsglzd instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XszjsglzdDAO getFromApplicationContext(ApplicationContext ctx) {
		return (XszjsglzdDAO) ctx.getBean("XszjsglzdDAO");
	}
}