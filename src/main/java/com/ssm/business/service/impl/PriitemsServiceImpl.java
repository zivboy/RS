package com.ssm.business.service.impl;

import com.ssm.business.entity.Priitems;
import com.ssm.business.entity.PriitemsCriteria;
import com.ssm.business.mapper.PriitemsMapper;
import com.ssm.business.service.PriitemsService;
import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by V on Sat Oct 03 17:25:39 GMT+08:00 2015.
 */
@Service("PriitemsService")
@Transactional
@SuppressWarnings("unchecked")
public class PriitemsServiceImpl  extends BaseService implements PriitemsService {


    @Override
    public Page findByPage(Page page, Priitems priitems) {
        page.setCount(countByExample(page,priitems));
        List<Priitems> list= baseDao.selectByPage("com.ssm.business.mapper.PriitemsMapper." + BaseDao.SELECT_BY_EXAMPLE, getCriteria(page, priitems), page);
        if(list!=null)
            return page.setRows(list);
        else
            return null;
    }
    
    @Override
    public List<Priitems> findAll(Page page, Priitems priitems) {
        return baseDao.selectList("com.ssm.business.mapper.PriitemsMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,priitems));
    }

    @Override
    public int countByExample(Page page, Priitems priitems) {
        return baseDao.getMapper(PriitemsMapper.class).countByExample(getCriteria(page,priitems));
    }

    public PriitemsCriteria getCriteria(Page page,Priitems priitems)
    {
        PriitemsCriteria criteria = new PriitemsCriteria();
        PriitemsCriteria.Criteria cri = criteria.createCriteria();
        if (priitems != null) {
                
        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }

    @Override
    public void save(Priitems priitems) {
        baseDao.getMapper(PriitemsMapper.class).insertSelective(priitems);
    }

    @Override
    public Priitems get(int id) {
        return baseDao.getMapper(PriitemsMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public void update(Priitems priitems) {
        baseDao.getMapper(PriitemsMapper.class).updateByPrimaryKeySelective(priitems);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(PriitemsMapper.class).deleteByPrimaryKey(id);
    }
}

