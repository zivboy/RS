package com.ssm.business.service.impl;

import com.ssm.business.entity.Ksjl;
import com.ssm.business.entity.KsjlCriteria;
import com.ssm.business.mapper.KsjlMapper;
import com.ssm.business.service.KsjlService;
import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by V on Thu Oct 15 19:14:20 GMT+08:00 2015.
 */
@Service("KsjlService")
@Transactional
@SuppressWarnings("unchecked")
public class KsjlServiceImpl  extends BaseService implements KsjlService {


    @Override
    public Page findByPage(Page page, Ksjl ksjl) {
        page.setCount(countByExample(page,ksjl));
        List<Ksjl> list= findAll(page,ksjl);
        if(list!=null)
            return page.setRows(list);
        else
            return null;
    }
    
    @Override
    public List<Ksjl> findAll(Page page, Ksjl ksjl) {
        return baseDao.selectByPage("com.ssm.business.mapper.KsjlMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,ksjl),page);
    }

    @Override
    public int countByExample(Page page, Ksjl ksjl) {
        return baseDao.getMapper(KsjlMapper.class).countByExample(getCriteria(page,ksjl));
    }

    public KsjlCriteria getCriteria(Page page,Ksjl ksjl)
    {
        KsjlCriteria criteria = new KsjlCriteria();
        KsjlCriteria.Criteria cri = criteria.createCriteria();
        if (ksjl != null) {
                
        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }

    @Override
    public void save(Ksjl ksjl) {
        baseDao.getMapper(KsjlMapper.class).insertSelective(ksjl);
    }

    @Override
    public Ksjl get(int id) {
        return baseDao.getMapper(KsjlMapper.class).selectByPrimaryKey(Long.valueOf(id));
    }

    @Override
    public void update(Ksjl ksjl) {
        baseDao.getMapper(KsjlMapper.class).updateByPrimaryKeySelective(ksjl);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(KsjlMapper.class).deleteByPrimaryKey(Long.valueOf(id));
    }
}

