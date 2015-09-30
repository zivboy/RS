package com.ssm.business.service.impl;

import com.ssm.business.entity.ImportCriteria;
import com.ssm.business.mapper.ImportsMapper;
import com.ssm.business.service.ImportService;
import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import com.ssm.business.entity.Imports;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by V on Sat Sep 26 16:41:04 GMT+08:00 2015.
 */
@Service("ImportService")
@Transactional
@SuppressWarnings("unchecked")
public class ImportServiceImpl  extends BaseService implements ImportService {


    @Override
    public Page findByPage(Page page, Imports imports) {
        page.setCount(countByExample(page,imports));
        List<Imports> list= baseDao.selectByPage("com.ssm.business.mapper.ImportsMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,imports), page);;

        if(list!=null)
            return page.setRows(list);
        else
            return null;
    }

    @Override
    public List<Imports> findAll(Page page, Imports imports) {
        return baseDao.selectList("com.ssm.business.mapper.ImportsMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,imports));
    }

    @Override
    public int countByExample(Page page, Imports imports) {
        return baseDao.getMapper(ImportsMapper.class).countByExample(getCriteria(page,imports));
    }

    public ImportCriteria getCriteria(Page page,Imports imports)
    {
        ImportCriteria criteria = new ImportCriteria();
        ImportCriteria.Criteria cri = criteria.createCriteria();
        if (imports != null) {
                               if(StringUtils.isNotBlank(imports.getTitle())) {
                cri.andTitleEqualTo(imports.getTitle());
               }
        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }

    @Override
    public void save(Imports imports) {
        baseDao.getMapper(ImportsMapper.class).insertSelective(imports);
    }

    @Override
    public Imports get(int id) {
        return baseDao.getMapper(ImportsMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public void update(Imports imports) {
        baseDao.getMapper(ImportsMapper.class).updateByPrimaryKeySelective(imports);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(ImportsMapper.class).deleteByPrimaryKey(id);
    }
}

