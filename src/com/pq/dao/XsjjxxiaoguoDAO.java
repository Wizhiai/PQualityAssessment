package com.pq.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pq.domain.Xsjjxxiaoguo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Xsjjxxiaoguo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.pq.domain.Xsjjxxiaoguo
 * @author MyEclipse Persistence Tools
 */

public class XsjjxxiaoguoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XsjjxxiaoguoDAO.class);
	// property constants
	public static final String CONCLUSION = "conclusion";
	public static final String JIESHU = "jieshu";
	public static final String TOTAL2 = "total2";
	public static final String TOTAL1 = "total1";
	public static final String GRADE = "grade";
	public static final String YRDWFS2 = "yrdwfs2";
	public static final String YRDWFS1 = "yrdwfs1";
	public static final String YRDWPG = "yrdwpg";
	public static final String YONGRENDANWEI = "yongrendanwei";
	public static final String CXSZFS2 = "cxszfs2";
	public static final String CXSZFS1 = "cxszfs1";
	public static final String CXSZPG = "cxszpg";
	public static final String CHANGXINSUZHI = "changxinsuzhi";
	public static final String SJNLFS2 = "sjnlfs2";
	public static final String SJNLFS1 = "sjnlfs1";
	public static final String SJNLPG = "sjnlpg";
	public static final String SHIJIANNENGLI = "shijiannengli";
	public static final String HJQKFS2 = "hjqkfs2";
	public static final String HJQKFS1 = "hjqkfs1";
	public static final String HJQKPG = "hjqkpg";
	public static final String HUOJIANGQINGKUANG = "huojiangqingkuang";
	public static final String LWZLFS2 = "lwzlfs2";
	public static final String LWZLFS1 = "lwzlfs1";
	public static final String LWZLPG = "lwzlpg";
	public static final String LUNWENZHILIANG = "lunwenzhiliang";

	protected void initDao() {
		// do nothing
	}

	public void save(Xsjjxxiaoguo transientInstance) {
		log.debug("saving Xsjjxxiaoguo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xsjjxxiaoguo persistentInstance) {
		log.debug("deleting Xsjjxxiaoguo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xsjjxxiaoguo findById(java.lang.Integer id) {
		log.debug("getting Xsjjxxiaoguo instance with id: " + id);
		try {
			Xsjjxxiaoguo instance = (Xsjjxxiaoguo) getHibernateTemplate().get(
					"com.pq.domain.Xsjjxxiaoguo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xsjjxxiaoguo instance) {
		log.debug("finding Xsjjxxiaoguo instance by example");
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
		log.debug("finding Xsjjxxiaoguo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Xsjjxxiaoguo as model where model."
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

	public List findByYrdwfs2(Object yrdwfs2) {
		return findByProperty(YRDWFS2, yrdwfs2);
	}

	public List findByYrdwfs1(Object yrdwfs1) {
		return findByProperty(YRDWFS1, yrdwfs1);
	}

	public List findByYrdwpg(Object yrdwpg) {
		return findByProperty(YRDWPG, yrdwpg);
	}

	public List findByYongrendanwei(Object yongrendanwei) {
		return findByProperty(YONGRENDANWEI, yongrendanwei);
	}

	public List findByCxszfs2(Object cxszfs2) {
		return findByProperty(CXSZFS2, cxszfs2);
	}

	public List findByCxszfs1(Object cxszfs1) {
		return findByProperty(CXSZFS1, cxszfs1);
	}

	public List findByCxszpg(Object cxszpg) {
		return findByProperty(CXSZPG, cxszpg);
	}

	public List findByChangxinsuzhi(Object changxinsuzhi) {
		return findByProperty(CHANGXINSUZHI, changxinsuzhi);
	}

	public List findBySjnlfs2(Object sjnlfs2) {
		return findByProperty(SJNLFS2, sjnlfs2);
	}

	public List findBySjnlfs1(Object sjnlfs1) {
		return findByProperty(SJNLFS1, sjnlfs1);
	}

	public List findBySjnlpg(Object sjnlpg) {
		return findByProperty(SJNLPG, sjnlpg);
	}

	public List findByShijiannengli(Object shijiannengli) {
		return findByProperty(SHIJIANNENGLI, shijiannengli);
	}

	public List findByHjqkfs2(Object hjqkfs2) {
		return findByProperty(HJQKFS2, hjqkfs2);
	}

	public List findByHjqkfs1(Object hjqkfs1) {
		return findByProperty(HJQKFS1, hjqkfs1);
	}

	public List findByHjqkpg(Object hjqkpg) {
		return findByProperty(HJQKPG, hjqkpg);
	}

	public List findByHuojiangqingkuang(Object huojiangqingkuang) {
		return findByProperty(HUOJIANGQINGKUANG, huojiangqingkuang);
	}

	public List findByLwzlfs2(Object lwzlfs2) {
		return findByProperty(LWZLFS2, lwzlfs2);
	}

	public List findByLwzlfs1(Object lwzlfs1) {
		return findByProperty(LWZLFS1, lwzlfs1);
	}

	public List findByLwzlpg(Object lwzlpg) {
		return findByProperty(LWZLPG, lwzlpg);
	}

	public List findByLunwenzhiliang(Object lunwenzhiliang) {
		return findByProperty(LUNWENZHILIANG, lunwenzhiliang);
	}

	public List findAll() {
		log.debug("finding all Xsjjxxiaoguo instances");
		try {
			String queryString = "from Xsjjxxiaoguo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xsjjxxiaoguo merge(Xsjjxxiaoguo detachedInstance) {
		log.debug("merging Xsjjxxiaoguo instance");
		try {
			Xsjjxxiaoguo result = (Xsjjxxiaoguo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xsjjxxiaoguo instance) {
		log.debug("attaching dirty Xsjjxxiaoguo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xsjjxxiaoguo instance) {
		log.debug("attaching clean Xsjjxxiaoguo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XsjjxxiaoguoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (XsjjxxiaoguoDAO) ctx.getBean("XsjjxxiaoguoDAO");
	}
}