package com.ssm.business.service.impl;

import com.ssm.business.entity.Model;
import com.ssm.business.entity.ModelCriteria;
import com.ssm.business.mapper.ModelMapper;
import com.ssm.business.service.ModelService;
import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V on Tue Sep 22 23:54:08 GMT+08:00 2015.
 */
@Service("ModelService")
@Transactional
@SuppressWarnings("unchecked")
public class ModelServiceImpl  extends BaseService implements ModelService {


    @Override
    public Page findByPage(Page page, Model model) {
        page.setCount(countByExample(page,model));
        List<Model> list= baseDao.selectByPage("com.ssm.business.mapper.ModelMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,model), page);;
        if(list!=null)
            return page.setRows(list);
        else
            return null;
    }
    
    @Override
    public List<Model> findAll(Page page, Model model) {

        List<Model> list = new ArrayList<>();
        try {
            list =  baseDao.selectList("com.ssm.business.mapper.ModelMapper."+ BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,model));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int countByExample(Page page, Model model) {
        return baseDao.getMapper(ModelMapper.class).countByExample(getCriteria(page,model));
    }

    public ModelCriteria getCriteria(Page page,Model model)
    {
        ModelCriteria criteria = new ModelCriteria();
        ModelCriteria.Criteria cri = criteria.createCriteria();
        if (model != null) {
            if(model.getState()!=null)
                cri.andStateEqualTo(model.getState());
        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }

    @Override
    public int save(Model model) {
        return baseDao.getMapper(ModelMapper.class).insertSelective(model);
    }

    @Override
    public Model get(int id) {
        return baseDao.getMapper(ModelMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public void update(Model model) {
        baseDao.getMapper(ModelMapper.class).updateByPrimaryKeySelective(model);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(ModelMapper.class).deleteByPrimaryKey(id);
    }
}

