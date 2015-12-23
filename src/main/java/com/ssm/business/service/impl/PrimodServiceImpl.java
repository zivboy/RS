package com.ssm.business.service.impl;

import com.ssm.business.entity.Primod;
import com.ssm.business.entity.PrimodCriteria;
import com.ssm.business.mapper.PrimodMapper;
import com.ssm.business.service.PrimodService;
import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by V on Sat Oct 03 17:24:55 GMT+08:00 2015.
 */
@Service("PrimodService")
@Transactional
@SuppressWarnings("unchecked")
public class PrimodServiceImpl  extends BaseService implements PrimodService {


    @Override
    public Page findByPage(Page page, Primod primod) {
        page.setCount(countByExample(page,primod));
        List<Primod> list= baseDao.selectByPage("com.ssm.business.mapper.PrimodMapper." + BaseDao.SELECT_BY_EXAMPLE, getCriteria(page, primod), page);
        if(list!=null)
            return page.setRows(list);
        else
            return null;
    }
    
    @Override
    public List<Primod> findAll(Page page, Primod primod) {
        return baseDao.selectList("com.ssm.business.mapper.PrimodMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,primod));
    }

    @Override
    public int countByExample(Page page, Primod primod) {
        return baseDao.getMapper(PrimodMapper.class).countByExample(getCriteria(page,primod));
    }

    public PrimodCriteria getCriteria(Page page,Primod primod)
    {
        PrimodCriteria criteria = new PrimodCriteria();
        PrimodCriteria.Criteria cri = criteria.createCriteria();
        if (primod != null) {
            if(StringUtils.isNotBlank(primod.getModName())) {
                cri.andModNameLike(primod.getModName());
            }
        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }

    @Override
    public void save(Primod primod) {
        baseDao.getMapper(PrimodMapper.class).insertSelective(primod);
    }

    @Override
    public Primod get(int id) {
        return baseDao.getMapper(PrimodMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public void update(Primod primod) {
        baseDao.getMapper(PrimodMapper.class).updateByPrimaryKeySelective(primod);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(PrimodMapper.class).deleteByPrimaryKey(id);
    }
}

