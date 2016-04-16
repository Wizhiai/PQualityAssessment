package com.pq.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pq.domain.Xsysjdjianshe;

/**
 * A data access object (DAO) providing persistence and search support for
 * Xsysjdjianshe entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.pq.domain.Xsysjdjianshe
 * @author MyEclipse Persistence Tools
 */

public class XsysjdjiansheDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(XsysjdjiansheDAO.class);
	// property constants
	public static final String CONCLUSION = "conclusion";
	public static final String JIESHU = "jieshu";
	public static final String GRADE = "grade";
	public static final String TOTAL2 = "total2";
	public static final String TOTAL1 = "total1";
	public static final String YRQYFS2 = "yrqyfs2";
	public static final String YRQYFS1 = "yrqyfs1";
	public static final String YRQYPG = "yrqypg";
	public static final String YONGRENQIYE = "yongrenqiye";
	public static final String ZGRZFS2 = "zgrzfs2";
	public static final String ZGRZFS1 = "zgrzfs1";
	public static final String ZGRZPG = "zgrzpg";
	public static final String ZIGERENZHENG = "zigerenzheng";
	public static final String ZDSYSFS2 = "zdsysfs2";
	public static final String ZDSYSFS1 = "zdsysfs1";
	public static final String ZDSYSPG = "zdsyspg";
	public static final String ZHONGDIANSHIYANSHI = "zhongdianshiyanshi";
	public static final String SWJDFS2 = "swjdfs2";
	public static final String SWJDFS1 = "swjdfs1";
	public static final String XWJDPG = "xwjdpg";
	public static final String XIAOWAIJIDI = "xiaowaijidi";
	public static final String SYSZDFS2 = "syszdfs2";
	public static final String SYSZDFS1 = "syszdfs1";
	public static final String SYSZDPG = "syszdpg";
	public static final String SHIYANSHIZHIDU = "shiyanshizhidu";
	public static final String SYSJSFS2 = "sysjsfs2";
	public static final String SYSJSFS1 = "sysjsfs1";
	public static final String SYSJSPG = "sysjspg";
	public static final String SHIYANSHIJIANSHE = "shiyanshijianshe";
	public static final String SBTRFS2 = "sbtrfs2";
	public static final String SBTRFS1 = "sbtrfs1";
	public static final String SBTRPG = "sbtrpg";
	public static final String SHEBEITOURU = "shebeitouru";

	protected void initDao() {
		// do nothing
	}

	public void save(Xsysjdjianshe transientInstance) {
		log.debug("saving Xsysjdjianshe instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xsysjdjianshe persistentInstance) {
		log.debug("deleting Xsysjdjianshe instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xsysjdjianshe findById(java.lang.Integer id) {
		log.debug("getting Xsysjdjianshe instance with id: " + id);
		try {
			Xsysjdjianshe instance = (Xsysjdjianshe) getHibernateTemplate()
					.get("com.pq.domain.Xsysjdjianshe", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xsysjdjianshe instance) {
		log.debug("finding Xsysjdjianshe instance by example");
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
		log.debug("finding Xsysjdjianshe instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Xsysjdjianshe as model where model."
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

	public List findByYrqyfs2(Object yrqyfs2) {
		return findByProperty(YRQYFS2, yrqyfs2);
	}

	public List findByYrqyfs1(Object yrqyfs1) {
		return findByProperty(YRQYFS1, yrqyfs1);
	}

	public List findByYrqypg(Object yrqypg) {
		return findByProperty(YRQYPG, yrqypg);
	}

	public List findByYongrenqiye(Object yongrenqiye) {
		return findByProperty(YONGRENQIYE, yongrenqiye);
	}

	public List findByZgrzfs2(Object zgrzfs2) {
		return findByProperty(ZGRZFS2, zgrzfs2);
	}

	public List findByZgrzfs1(Object zgrzfs1) {
		return findByProperty(ZGRZFS1, zgrzfs1);
	}

	public List findByZgrzpg(Object zgrzpg) {
		return findByProperty(ZGRZPG, zgrzpg);
	}

	public List findByZigerenzheng(Object zigerenzheng) {
		return findByProperty(ZIGERENZHENG, zigerenzheng);
	}

	public List findByZdsysfs2(Object zdsysfs2) {
		return findByProperty(ZDSYSFS2, zdsysfs2);
	}

	public List findByZdsysfs1(Object zdsysfs1) {
		return findByProperty(ZDSYSFS1, zdsysfs1);
	}

	public List findByZdsyspg(Object zdsyspg) {
		return findByProperty(ZDSYSPG, zdsyspg);
	}

	public List findByZhongdianshiyanshi(Object zhongdianshiyanshi) {
		return findByProperty(ZHONGDIANSHIYANSHI, zhongdianshiyanshi);
	}

	public List findBySwjdfs2(Object swjdfs2) {
		return findByProperty(SWJDFS2, swjdfs2);
	}

	public List findBySwjdfs1(Object swjdfs1) {
		return findByProperty(SWJDFS1, swjdfs1);
	}

	public List findByXwjdpg(Object xwjdpg) {
		return findByProperty(XWJDPG, xwjdpg);
	}

	public List findByXiaowaijidi(Object xiaowaijidi) {
		return findByProperty(XIAOWAIJIDI, xiaowaijidi);
	}

	public List findBySyszdfs2(Object syszdfs2) {
		return findByProperty(SYSZDFS2, syszdfs2);
	}

	public List findBySyszdfs1(Object syszdfs1) {
		return findByProperty(SYSZDFS1, syszdfs1);
	}

	public List findBySyszdpg(Object syszdpg) {
		return findByProperty(SYSZDPG, syszdpg);
	}

	public List findByShiyanshizhidu(Object shiyanshizhidu) {
		return findByProperty(SHIYANSHIZHIDU, shiyanshizhidu);
	}

	public List findBySysjsfs2(Object sysjsfs2) {
		return findByProperty(SYSJSFS2, sysjsfs2);
	}

	public List findBySysjsfs1(Object sysjsfs1) {
		return findByProperty(SYSJSFS1, sysjsfs1);
	}

	public List findBySysjspg(Object sysjspg) {
		return findByProperty(SYSJSPG, sysjspg);
	}

	public List findByShiyanshijianshe(Object shiyanshijianshe) {
		return findByProperty(SHIYANSHIJIANSHE, shiyanshijianshe);
	}

	public List findBySbtrfs2(Object sbtrfs2) {
		return findByProperty(SBTRFS2, sbtrfs2);
	}

	public List findBySbtrfs1(Object sbtrfs1) {
		return findByProperty(SBTRFS1, sbtrfs1);
	}

	public List findBySbtrpg(Object sbtrpg) {
		return findByProperty(SBTRPG, sbtrpg);
	}

	public List findByShebeitouru(Object shebeitouru) {
		return findByProperty(SHEBEITOURU, shebeitouru);
	}

	public List findAll() {
		log.debug("finding all Xsysjdjianshe instances");
		try {
			String queryString = "from Xsysjdjianshe";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xsysjdjianshe merge(Xsysjdjianshe detachedInstance) {
		log.debug("merging Xsysjdjianshe instance");
		try {
			Xsysjdjianshe result = (Xsysjdjianshe) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xsysjdjianshe instance) {
		log.debug("attaching dirty Xsysjdjianshe instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xsysjdjianshe instance) {
		log.debug("attaching clean Xsysjdjianshe instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XsysjdjiansheDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (XsysjdjiansheDAO) ctx.getBean("XsysjdjiansheDAO");
	}
}