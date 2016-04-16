package com.pq.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pq.domain.Xjxgcjiankong;

/**
 * A data access object (DAO) providing persistence and search support for
 * Xjxgcjiankong entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.pq.domain.Xjxgcjiankong
 * @author MyEclipse Persistence Tools
 */

public class XjxgcjiankongDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XjxgcjiankongDAO.class);
	// property constants
	public static final String CONCLUSION = "conclusion";
	public static final String JIESHU = "jieshu";
	public static final String GRADE = "grade";
	public static final String TOTAL2 = "total2";
	public static final String TOTAL1 = "total1";
	public static final String QYDGFS2 = "qydgfs2";
	public static final String QYDGFS1 = "qydgfs1";
	public static final String QYDGPG = "qydgpg";
	public static final String QIYEDINGGANG = "qiyedinggang";
	public static final String ZHJNFS2 = "zhjnfs2";
	public static final String ZHJNFS1 = "zhjnfs1";
	public static final String ZHJNPG = "zhjnpg";
	public static final String ZONGHEJINENG = "zonghejineng";
	public static final String RWSFS2 = "rwsfs2";
	public static final String RWSFS1 = "rwsfs1";
	public static final String RWSPG = "rwspg";
	public static final String RENWUSHU = "renwushu";
	public static final String JXGCFS2 = "jxgcfs2";
	public static final String JXGCFS1 = "jxgcfs1";
	public static final String JXGCPG = "jxgcpg";
	public static final String JIAOXUEGUOCHENG = "jiaoxueguocheng";
	public static final String JXZDFS2 = "jxzdfs2";
	public static final String JXZDFS1 = "jxzdfs1";
	public static final String JXZDPG = "jxzdpg";
	public static final String JIAOXUEZHIDAO = "jiaoxuezhidao";
	public static final String JXZBFS2 = "jxzbfs2";
	public static final String JXZBFS1 = "jxzbfs1";
	public static final String JXZBPG = "jxzbpg";
	public static final String JIAOXUEZHUNBEI = "jiaoxuezhunbei";

	protected void initDao() {
		// do nothing
	}

	public void save(Xjxgcjiankong transientInstance) {
		log.debug("saving Xjxgcjiankong instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xjxgcjiankong persistentInstance) {
		log.debug("deleting Xjxgcjiankong instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xjxgcjiankong findById(java.lang.Integer id) {
		log.debug("getting Xjxgcjiankong instance with id: " + id);
		try {
			Xjxgcjiankong instance = (Xjxgcjiankong) getHibernateTemplate()
					.get("com.pq.domain.Xjxgcjiankong", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xjxgcjiankong instance) {
		log.debug("finding Xjxgcjiankong instance by example");
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
		log.debug("finding Xjxgcjiankong instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Xjxgcjiankong as model where model."
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

	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	public List findByTotal2(Object total2) {
		return findByProperty(TOTAL2, total2);
	}

	public List findByTotal1(Object total1) {
		return findByProperty(TOTAL1, total1);
	}

	public List findByQydgfs2(Object qydgfs2) {
		return findByProperty(QYDGFS2, qydgfs2);
	}

	public List findByQydgfs1(Object qydgfs1) {
		return findByProperty(QYDGFS1, qydgfs1);
	}

	public List findByQydgpg(Object qydgpg) {
		return findByProperty(QYDGPG, qydgpg);
	}

	public List findByQiyedinggang(Object qiyedinggang) {
		return findByProperty(QIYEDINGGANG, qiyedinggang);
	}

	public List findByZhjnfs2(Object zhjnfs2) {
		return findByProperty(ZHJNFS2, zhjnfs2);
	}

	public List findByZhjnfs1(Object zhjnfs1) {
		return findByProperty(ZHJNFS1, zhjnfs1);
	}

	public List findByZhjnpg(Object zhjnpg) {
		return findByProperty(ZHJNPG, zhjnpg);
	}

	public List findByZonghejineng(Object zonghejineng) {
		return findByProperty(ZONGHEJINENG, zonghejineng);
	}

	public List findByRwsfs2(Object rwsfs2) {
		return findByProperty(RWSFS2, rwsfs2);
	}

	public List findByRwsfs1(Object rwsfs1) {
		return findByProperty(RWSFS1, rwsfs1);
	}

	public List findByRwspg(Object rwspg) {
		return findByProperty(RWSPG, rwspg);
	}

	public List findByRenwushu(Object renwushu) {
		return findByProperty(RENWUSHU, renwushu);
	}

	public List findByJxgcfs2(Object jxgcfs2) {
		return findByProperty(JXGCFS2, jxgcfs2);
	}

	public List findByJxgcfs1(Object jxgcfs1) {
		return findByProperty(JXGCFS1, jxgcfs1);
	}

	public List findByJxgcpg(Object jxgcpg) {
		return findByProperty(JXGCPG, jxgcpg);
	}

	public List findByJiaoxueguocheng(Object jiaoxueguocheng) {
		return findByProperty(JIAOXUEGUOCHENG, jiaoxueguocheng);
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

	public List findByJiaoxuezhidao(Object jiaoxuezhidao) {
		return findByProperty(JIAOXUEZHIDAO, jiaoxuezhidao);
	}

	public List findByJxzbfs2(Object jxzbfs2) {
		return findByProperty(JXZBFS2, jxzbfs2);
	}

	public List findByJxzbfs1(Object jxzbfs1) {
		return findByProperty(JXZBFS1, jxzbfs1);
	}

	public List findByJxzbpg(Object jxzbpg) {
		return findByProperty(JXZBPG, jxzbpg);
	}

	public List findByJiaoxuezhunbei(Object jiaoxuezhunbei) {
		return findByProperty(JIAOXUEZHUNBEI, jiaoxuezhunbei);
	}

	public List findAll() {
		log.debug("finding all Xjxgcjiankong instances");
		try {
			String queryString = "from Xjxgcjiankong";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xjxgcjiankong merge(Xjxgcjiankong detachedInstance) {
		log.debug("merging Xjxgcjiankong instance");
		try {
			Xjxgcjiankong result = (Xjxgcjiankong) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xjxgcjiankong instance) {
		log.debug("attaching dirty Xjxgcjiankong instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xjxgcjiankong instance) {
		log.debug("attaching clean Xjxgcjiankong instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XjxgcjiankongDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (XjxgcjiankongDAO) ctx.getBean("XjxgcjiankongDAO");
	}
}