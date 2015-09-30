package com.ssm.common.baseservice;

import javax.annotation.Resource;

import com.ssm.common.basedao.BaseDao;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

public class BaseService implements Service {
    protected BaseDao baseDao;
//    CacheManager cacheManager = CacheManager.create();

    @Resource(name = "baseDao")
    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

/*    public void updateEhcache(String ehcacheName, String key) {
        Cache sample = cacheManager.getCache(ehcacheName);
        sample.remove(key);
    }*/
}

