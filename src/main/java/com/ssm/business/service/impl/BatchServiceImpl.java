package com.ssm.business.service.impl;

import com.ssm.business.entity.Batch;
import com.ssm.business.entity.BatchCriteria;
import com.ssm.business.mapper.BatchMapper;
import com.ssm.business.service.BatchService;
import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V on Wed Oct 21 22:27:03 GMT+08:00 2015.
 */
@Service("BatchService")
@Transactional
@SuppressWarnings("unchecked")
public class BatchServiceImpl  extends BaseService implements BatchService {


    @Override
    public Page findByPage(Page page, Batch batch) {
        page.setCount(countByExample(page,batch));
        List<Batch> list= baseDao.selectByPage("com.ssm.business.mapper.BatchMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,batch),page);
        if(list!=null)
            return page.setRows(list);
        else
            return null;
    }
    
    @Override
    public List<Batch> findAll(Page page, Batch batch) {
        return baseDao.selectList("com.ssm.business.mapper.BatchMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,batch));
    }

    @Override
    public int countByExample(Page page, Batch batch) {
        return baseDao.getMapper(BatchMapper.class).countByExample(getCriteria(page,batch));
    }

    public BatchCriteria getCriteria(Page page,Batch batch)
    {
        BatchCriteria criteria = new BatchCriteria();
        BatchCriteria.Criteria cri = criteria.createCriteria();
        if (batch != null) {
                               if(StringUtils.isNotBlank(batch.getBatchName())) {
                cri.andBatchNameEqualTo(batch.getBatchName());
               }


        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }

    @Override
    public void save(Batch batch) {
        baseDao.getMapper(BatchMapper.class).insertSelective(batch);
    }

    @Override
    public Batch get(int id) {
        return baseDao.getMapper(BatchMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public void update(Batch batch) {
        baseDao.getMapper(BatchMapper.class).updateByPrimaryKeySelective(batch);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(BatchMapper.class).deleteByPrimaryKey(id);
    }
}

