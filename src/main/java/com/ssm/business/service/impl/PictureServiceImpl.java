package com.ssm.business.service.impl;

import com.ssm.business.entity.Picture;
import com.ssm.business.entity.PictureCriteria;
import com.ssm.business.mapper.PictureMapper;
import com.ssm.business.service.PictureService;
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
 * Created by V on Sat Oct 17 22:21:53 GMT+08:00 2015.
 */
@Service("PictureService")
@Transactional
@SuppressWarnings("unchecked")
public class PictureServiceImpl  extends BaseService implements PictureService {


    @Override
    public Page findByPage(Page page, Picture picture) {
        page.setCount(countByExample(page,picture));
        List<Picture> list= baseDao.selectByPage("com.ssm.business.mapper.PictureMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,picture),page);
        if(list!=null)
            return page.setRows(list);
        else
            return null;
    }
    
    @Override
    public List<Picture> findAll(Page page, Picture picture) {
        return baseDao.selectList("com.ssm.business.mapper.PictureMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,picture));
    }

    @Override
    public int countByExample(Page page, Picture picture) {
        return baseDao.getMapper(PictureMapper.class).countByExample(getCriteria(page,picture));
    }

    public PictureCriteria getCriteria(Page page,Picture picture)
    {
        PictureCriteria criteria = new PictureCriteria();
        PictureCriteria.Criteria cri = criteria.createCriteria();
        if (picture != null) {
                
        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }

    @Override
    public void save(Picture picture) {
        baseDao.getMapper(PictureMapper.class).insertSelective(picture);
    }

    @Override
    public Picture get(int id) {
        return baseDao.getMapper(PictureMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public void update(Picture picture) {
        baseDao.getMapper(PictureMapper.class).updateByPrimaryKeySelective(picture);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(PictureMapper.class).deleteByPrimaryKey(id);
    }
}

