package com.pq.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pq.domain.Xevaluate;

/**
 * A data access object (DAO) providing persistence and search support for
 * Xevaluate entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.pq.domain.Xevaluate
 * @author MyEclipse Persistence Tools
 */

public class XevaluateDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XevaluateDAO.class);
	// property constants
	public static final String JIESHU = "jieshu";
	public static final String TSCORE32 = "tscore32";
	public static final String TSCORE31 = "tscore31";
	public static final String TSCORE30 = "tscore30";
	public static final String TSCORE29 = "tscore29";
	public static final String TSCORE28 = "tscore28";
	public static final String TSCORE27 = "tscore27";
	public static final String TSCORE26 = "tscore26";
	public static final String TSCORE25 = "tscore25";
	public static final String TSCORE24 = "tscore24";
	public static final String TSCORE23 = "tscore23";
	public static final String TSCORE22 = "tscore22";
	public static final String TSCORE21 = "tscore21";
	public static final String TSCORE20 = "tscore20";
	public static final String TSCORE19 = "tscore19";
	public static final String TSCORE18 = "tscore18";
	public static final String TSCORE17 = "tscore17";
	public static final String TSCORE16 = "tscore16";
	public static final String TSCORE15 = "tscore15";
	public static final String TSCORE14 = "tscore14";
	public static final String TSCORE13 = "tscore13";
	public static final String TSCORE12 = "tscore12";
	public static final String TSCORE11 = "tscore11";
	public static final String TSCORE10 = "tscore10";
	public static final String TSCORE9 = "tscore9";
	public static final String TSCORE8 = "tscore8";
	public static final String TSCORE7 = "tscore7";
	public static final String TSCORE6 = "tscore6";
	public static final String TSCORE5 = "tscore5";
	public static final String TSCORE4 = "tscore4";
	public static final String TSCORE3 = "tscore3";
	public static final String TSCORE2 = "tscore2";
	public static final String TSCORE1 = "tscore1";
	public static final String TNAME = "tname";

	protected void initDao() {
		// do nothing
	}

	public void save(Xevaluate transientInstance) {
		log.debug("saving Xevaluate instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xevaluate persistentInstance) {
		log.debug("deleting Xevaluate instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xevaluate findById(java.lang.Integer id) {
		log.debug("getting Xevaluate instance with id: " + id);
		try {
			Xevaluate instance = (Xevaluate) getHibernateTemplate().get(
					"com.pq.domain.Xevaluate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xevaluate instance) {
		log.debug("finding Xevaluate instance by example");
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
		log.debug("finding Xevaluate instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Xevaluate as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJieshu(Object jieshu) {
		return findByProperty(JIESHU, jieshu);
	}

	public List findByTscore32(Object tscore32) {
		return findByProperty(TSCORE32, tscore32);
	}

	public List findByTscore31(Object tscore31) {
		return findByProperty(TSCORE31, tscore31);
	}

	public List findByTscore30(Object tscore30) {
		return findByProperty(TSCORE30, tscore30);
	}

	public List findByTscore29(Object tscore29) {
		return findByProperty(TSCORE29, tscore29);
	}

	public List findByTscore28(Object tscore28) {
		return findByProperty(TSCORE28, tscore28);
	}

	public List findByTscore27(Object tscore27) {
		return findByProperty(TSCORE27, tscore27);
	}

	public List findByTscore26(Object tscore26) {
		return findByProperty(TSCORE26, tscore26);
	}

	public List findByTscore25(Object tscore25) {
		return findByProperty(TSCORE25, tscore25);
	}

	public List findByTscore24(Object tscore24) {
		return findByProperty(TSCORE24, tscore24);
	}

	public List findByTscore23(Object tscore23) {
		return findByProperty(TSCORE23, tscore23);
	}

	public List findByTscore22(Object tscore22) {
		return findByProperty(TSCORE22, tscore22);
	}

	public List findByTscore21(Object tscore21) {
		return findByProperty(TSCORE21, tscore21);
	}

	public List findByTscore20(Object tscore20) {
		return findByProperty(TSCORE20, tscore20);
	}

	public List findByTscore19(Object tscore19) {
		return findByProperty(TSCORE19, tscore19);
	}

	public List findByTscore18(Object tscore18) {
		return findByProperty(TSCORE18, tscore18);
	}

	public List findByTscore17(Object tscore17) {
		return findByProperty(TSCORE17, tscore17);
	}

	public List findByTscore16(Object tscore16) {
		return findByProperty(TSCORE16, tscore16);
	}

	public List findByTscore15(Object tscore15) {
		return findByProperty(TSCORE15, tscore15);
	}

	public List findByTscore14(Object tscore14) {
		return findByProperty(TSCORE14, tscore14);
	}

	public List findByTscore13(Object tscore13) {
		return findByProperty(TSCORE13, tscore13);
	}

	public List findByTscore12(Object tscore12) {
		return findByProperty(TSCORE12, tscore12);
	}

	public List findByTscore11(Object tscore11) {
		return findByProperty(TSCORE11, tscore11);
	}

	public List findByTscore10(Object tscore10) {
		return findByProperty(TSCORE10, tscore10);
	}

	public List findByTscore9(Object tscore9) {
		return findByProperty(TSCORE9, tscore9);
	}

	public List findByTscore8(Object tscore8) {
		return findByProperty(TSCORE8, tscore8);
	}

	public List findByTscore7(Object tscore7) {
		return findByProperty(TSCORE7, tscore7);
	}

	public List findByTscore6(Object tscore6) {
		return findByProperty(TSCORE6, tscore6);
	}

	public List findByTscore5(Object tscore5) {
		return findByProperty(TSCORE5, tscore5);
	}

	public List findByTscore4(Object tscore4) {
		return findByProperty(TSCORE4, tscore4);
	}

	public List findByTscore3(Object tscore3) {
		return findByProperty(TSCORE3, tscore3);
	}

	public List findByTscore2(Object tscore2) {
		return findByProperty(TSCORE2, tscore2);
	}

	public List findByTscore1(Object tscore1) {
		return findByProperty(TSCORE1, tscore1);
	}

	public List findByTname(Object tname) {
		return findByProperty(TNAME, tname);
	}

	public List findAll() {
		log.debug("finding all Xevaluate instances");
		try {
			String queryString = "from Xevaluate";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xevaluate merge(Xevaluate detachedInstance) {
		log.debug("merging Xevaluate instance");
		try {
			Xevaluate result = (Xevaluate) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xevaluate instance) {
		log.debug("attaching dirty Xevaluate instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xevaluate instance) {
		log.debug("attaching clean Xevaluate instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XevaluateDAO getFromApplicationContext(ApplicationContext ctx) {
		return (XevaluateDAO) ctx.getBean("XevaluateDAO");
	}
}