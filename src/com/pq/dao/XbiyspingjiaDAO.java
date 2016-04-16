package com.pq.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pq.domain.Xbiyspingjia;

/**
 * A data access object (DAO) providing persistence and search support for
 * Xbiyspingjia entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.pq.domain.Xbiyspingjia
 * @author MyEclipse Persistence Tools
 */

public class XbiyspingjiaDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XbiyspingjiaDAO.class);
	// property constants
	public static final String CONCLUSION = "conclusion";
	public static final String JIESHU = "jieshu";
	public static final String TOTAL2 = "total2";
	public static final String TOTAL1 = "total1";
	public static final String GRADE = "grade";
	public static final String JYCYNLFS2 = "jycynlfs2";
	public static final String JYCYNLFS1 = "jycynlfs1";
	public static final String JYCYNLPG = "jycynlpg";
	public static final String JYCYNENGLI = "jycynengli";
	public static final String PYMYDFS2 = "pymydfs2";
	public static final String PYMYDFS1 = "pymydfs1";
	public static final String PYMYDPG = "pymydpg";
	public static final String PEIYANGMANYIDU = "peiyangmanyidu";
	public static final String FZZYDFS2 = "fzzydfs2";
	public static final String FZZYDFS1 = "fzzydfs1";
	public static final String FZZYDPG = "fzzydpg";
	public static final String FAZHANZYDU = "fazhanzydu";
	public static final String JXNLFS2 = "jxnlfs2";
	public static final String JXNLFS1 = "jxnlfs1";
	public static final String JXNLPG = "jxnlpg";
	public static final String JIAOXUENENGLI = "jiaoxuenengli";
	public static final String SJHJFS2 = "sjhjfs2";
	public static final String SJHJFS1 = "sjhjfs1";
	public static final String SJHJPG = "sjhjpg";
	public static final String SHIJIANHUANJING = "shijianhuanjing";
	public static final String KCMYFS2 = "kcmyfs2";
	public static final String KCMYFS1 = "kcmyfs1";
	public static final String KCMYPG = "kcmypg";
	public static final String KECHENGMANYI = "kechengmanyi";

	protected void initDao() {
		// do nothing
	}

	public void save(Xbiyspingjia transientInstance) {
		log.debug("saving Xbiyspingjia instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xbiyspingjia persistentInstance) {
		log.debug("deleting Xbiyspingjia instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xbiyspingjia findById(java.lang.Integer id) {
		log.debug("getting Xbiyspingjia instance with id: " + id);
		try {
			Xbiyspingjia instance = (Xbiyspingjia) getHibernateTemplate().get(
					"com.pq.domain.Xbiyspingjia", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xbiyspingjia instance) {
		log.debug("finding Xbiyspingjia instance by example");
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
		log.debug("finding Xbiyspingjia instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Xbiyspingjia as model where model."
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

	public List findByJycynlfs2(Object jycynlfs2) {
		return findByProperty(JYCYNLFS2, jycynlfs2);
	}

	public List findByJycynlfs1(Object jycynlfs1) {
		return findByProperty(JYCYNLFS1, jycynlfs1);
	}

	public List findByJycynlpg(Object jycynlpg) {
		return findByProperty(JYCYNLPG, jycynlpg);
	}

	public List findByJycynengli(Object jycynengli) {
		return findByProperty(JYCYNENGLI, jycynengli);
	}

	public List findByPymydfs2(Object pymydfs2) {
		return findByProperty(PYMYDFS2, pymydfs2);
	}

	public List findByPymydfs1(Object pymydfs1) {
		return findByProperty(PYMYDFS1, pymydfs1);
	}

	public List findByPymydpg(Object pymydpg) {
		return findByProperty(PYMYDPG, pymydpg);
	}

	public List findByPeiyangmanyidu(Object peiyangmanyidu) {
		return findByProperty(PEIYANGMANYIDU, peiyangmanyidu);
	}

	public List findByFzzydfs2(Object fzzydfs2) {
		return findByProperty(FZZYDFS2, fzzydfs2);
	}

	public List findByFzzydfs1(Object fzzydfs1) {
		return findByProperty(FZZYDFS1, fzzydfs1);
	}

	public List findByFzzydpg(Object fzzydpg) {
		return findByProperty(FZZYDPG, fzzydpg);
	}

	public List findByFazhanzydu(Object fazhanzydu) {
		return findByProperty(FAZHANZYDU, fazhanzydu);
	}

	public List findByJxnlfs2(Object jxnlfs2) {
		return findByProperty(JXNLFS2, jxnlfs2);
	}

	public List findByJxnlfs1(Object jxnlfs1) {
		return findByProperty(JXNLFS1, jxnlfs1);
	}

	public List findByJxnlpg(Object jxnlpg) {
		return findByProperty(JXNLPG, jxnlpg);
	}

	public List findByJiaoxuenengli(Object jiaoxuenengli) {
		return findByProperty(JIAOXUENENGLI, jiaoxuenengli);
	}

	public List findBySjhjfs2(Object sjhjfs2) {
		return findByProperty(SJHJFS2, sjhjfs2);
	}

	public List findBySjhjfs1(Object sjhjfs1) {
		return findByProperty(SJHJFS1, sjhjfs1);
	}

	public List findBySjhjpg(Object sjhjpg) {
		return findByProperty(SJHJPG, sjhjpg);
	}

	public List findByShijianhuanjing(Object shijianhuanjing) {
		return findByProperty(SHIJIANHUANJING, shijianhuanjing);
	}

	public List findByKcmyfs2(Object kcmyfs2) {
		return findByProperty(KCMYFS2, kcmyfs2);
	}

	public List findByKcmyfs1(Object kcmyfs1) {
		return findByProperty(KCMYFS1, kcmyfs1);
	}

	public List findByKcmypg(Object kcmypg) {
		return findByProperty(KCMYPG, kcmypg);
	}

	public List findByKechengmanyi(Object kechengmanyi) {
		return findByProperty(KECHENGMANYI, kechengmanyi);
	}

	public List findAll() {
		log.debug("finding all Xbiyspingjia instances");
		try {
			String queryString = "from Xbiyspingjia";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xbiyspingjia merge(Xbiyspingjia detachedInstance) {
		log.debug("merging Xbiyspingjia instance");
		try {
			Xbiyspingjia result = (Xbiyspingjia) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xbiyspingjia instance) {
		log.debug("attaching dirty Xbiyspingjia instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xbiyspingjia instance) {
		log.debug("attaching clean Xbiyspingjia instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XbiyspingjiaDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (XbiyspingjiaDAO) ctx.getBean("XbiyspingjiaDAO");
	}
}