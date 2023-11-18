package com.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pojo.ZucaishengfuDdxq;

/**
 	* A data access object (DAO) providing persistence and search support for ZucaishengfuDdxq entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.pojo.ZucaishengfuDdxq
  * @author MyEclipse Persistence Tools 
 */
public class ZucaishengfuDdxqDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(ZucaishengfuDdxqDAO.class);
		//property constants
	public static final String RESULT = "result";
	public static final String ZHUSHU = "zhushu";
	public static final String BEISHU = "beishu";
	public static final String IS_ZHONGJIANG = "isZhongjiang";
	public static final String ZHONGJIANGJINE = "zhongjiangjine";
	public static final String IS_LINGJIANG = "isLingjiang";
	public static final String PAY_MONEY = "payMoney";



	protected void initDao() {
		//do nothing
	}
    
    public void save(ZucaishengfuDdxq transientInstance) {
        log.debug("saving ZucaishengfuDdxq instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(ZucaishengfuDdxq persistentInstance) {
        log.debug("deleting ZucaishengfuDdxq instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public ZucaishengfuDdxq findById( java.lang.Integer id) {
        log.debug("getting ZucaishengfuDdxq instance with id: " + id);
        try {
            ZucaishengfuDdxq instance = (ZucaishengfuDdxq) getHibernateTemplate()
                    .get("com.pojo.ZucaishengfuDdxq", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(ZucaishengfuDdxq instance) {
        log.debug("finding ZucaishengfuDdxq instance by example");
        try {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding ZucaishengfuDdxq instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from ZucaishengfuDdxq as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByResult(Object result
	) {
		return findByProperty(RESULT, result
		);
	}
	
	public List findByZhushu(Object zhushu
	) {
		return findByProperty(ZHUSHU, zhushu
		);
	}
	
	public List findByBeishu(Object beishu
	) {
		return findByProperty(BEISHU, beishu
		);
	}
	
	public List findByIsZhongjiang(Object isZhongjiang
	) {
		return findByProperty(IS_ZHONGJIANG, isZhongjiang
		);
	}
	
	public List findByZhongjiangjine(Object zhongjiangjine
	) {
		return findByProperty(ZHONGJIANGJINE, zhongjiangjine
		);
	}
	
	public List findByIsLingjiang(Object isLingjiang
	) {
		return findByProperty(IS_LINGJIANG, isLingjiang
		);
	}
	
	public List findByPayMoney(Object payMoney
	) {
		return findByProperty(PAY_MONEY, payMoney
		);
	}
	

	public List findAll() {
		log.debug("finding all ZucaishengfuDdxq instances");
		try {
			String queryString = "from ZucaishengfuDdxq";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public ZucaishengfuDdxq merge(ZucaishengfuDdxq detachedInstance) {
        log.debug("merging ZucaishengfuDdxq instance");
        try {
            ZucaishengfuDdxq result = (ZucaishengfuDdxq) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(ZucaishengfuDdxq instance) {
        log.debug("attaching dirty ZucaishengfuDdxq instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(ZucaishengfuDdxq instance) {
        log.debug("attaching clean ZucaishengfuDdxq instance");
        try {
                      	getHibernateTemplate().lock(instance, LockMode.NONE);
                        log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static ZucaishengfuDdxqDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (ZucaishengfuDdxqDAO) ctx.getBean("ZucaishengfuDdxqDAO");
	}
}