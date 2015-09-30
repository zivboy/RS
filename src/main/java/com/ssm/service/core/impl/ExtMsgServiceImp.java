package com.ssm.service.core.impl;

import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import com.ssm.entity.ExtMsg;
import com.ssm.entity.ExtMsgCriteria;
import com.ssm.mapper.ExtMsgMapper;
import com.ssm.service.core.ExtMsgService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2014/7/11.
 */
@Service("extMsgService")
@Transactional
@SuppressWarnings("unchecked")
public class ExtMsgServiceImp extends BaseService implements ExtMsgService {


    @Override
    public Page find(Page page, ExtMsg extMsg) {
        ExtMsgCriteria criteria = new ExtMsgCriteria();
        ExtMsgCriteria.Criteria cri = criteria.createCriteria();

        if(extMsg != null){

            if(StringUtils.isNotBlank(extMsg.getName())){
                cri.andNameEqualTo(extMsg.getName());
            }

            if(StringUtils.isNotBlank(extMsg.getType())){
                cri.andTypeEqualTo(extMsg.getType());
            }
        }

        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }

        List<ExtMsg> list;

        list = baseDao.selectByPage("com.ssm.mapper.ExtMsgMapper."+ BaseDao.SELECT_BY_EXAMPLE, criteria, page);

        page.setCount(baseDao.getMapper(ExtMsgMapper.class).countByExample(criteria));
        return page.setRows(list);
    }

    @Override
    public List<ExtMsg> findList(Page page, ExtMsg extMsg) {
        ExtMsgCriteria criteria = new ExtMsgCriteria();
        ExtMsgCriteria.Criteria cri = criteria.createCriteria();

        if(extMsg != null){

            if(StringUtils.isNotBlank(extMsg.getName())){
                cri.andNameEqualTo(extMsg.getName());
            }

            if(StringUtils.isNotBlank(extMsg.getType())){
                cri.andTypeEqualTo(extMsg.getType());
            }

        }

        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }

        if(page == null){
            return baseDao.getMapper(com.ssm.mapper.ExtMsgMapper.class).selectByExample(criteria);
        }
        return baseDao.selectByPage("com.ssm.mapper.ExtMsgMapper."+ BaseDao.SELECT_BY_EXAMPLE, criteria, page);
    }

    @Override
    public List<ExtMsg> findAll() {
        ExtMsgCriteria criteria = new ExtMsgCriteria();
        return baseDao.getMapper(ExtMsgMapper.class).selectByExample(criteria);
    }

    @Override
    public void save(ExtMsg extMsg) {
        baseDao.getMapper(ExtMsgMapper.class).insert(extMsg);
    }

    @Override
    public ExtMsg get(int id) {
        return baseDao.getMapper(ExtMsgMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public void update(ExtMsg extMsg) {
        baseDao.getMapper(ExtMsgMapper.class).updateByPrimaryKey(extMsg);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(ExtMsgMapper.class).deleteByPrimaryKey(id);
    }
}
