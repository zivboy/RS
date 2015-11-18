package com.ssm.business.service.impl;

import com.ssm.business.entity.CodeManage;
import com.ssm.business.entity.CodeManageCriteria;
import com.ssm.business.mapper.CodeManageMapper;
import com.ssm.business.service.CodeManageService;
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
 * Created by V on Sun Nov 08 23:13:45 GMT+08:00 2015.
 */
@Service("CodeManageService")
@Transactional
@SuppressWarnings("unchecked")
public class CodeManageServiceImpl extends BaseService implements CodeManageService {


    @Override
    public Page findByPage(Page page, CodeManage codeManage) {
        page.setCount(countByExample(page, codeManage));
        List<CodeManage> list = baseDao.selectByPage("com.ssm.business.mapper.CodeManageMapper." + BaseDao.SELECT_BY_EXAMPLE, getCriteria(page, codeManage), page);
        if (list != null)
            return page.setRows(list);
        else
            return null;
    }

    @Override
    public List<CodeManage> findAll(Page page, CodeManage codeManage) {
        return baseDao.selectList("com.ssm.business.mapper.CodeManageMapper." + BaseDao.SELECT_BY_EXAMPLE, getCriteria(page, codeManage));
    }

    @Override
    public int countByExample(Page page, CodeManage codeManage) {
        return baseDao.getMapper(CodeManageMapper.class).countByExample(getCriteria(page, codeManage));
    }

    public CodeManageCriteria getCriteria(Page page, CodeManage codeManage) {
        CodeManageCriteria criteria = new CodeManageCriteria();
        CodeManageCriteria.Criteria cri = criteria.createCriteria();
        if (codeManage != null) {
            if (codeManage.getDmType() != null) {
                cri.andDmTypeEqualTo(codeManage.getDmType());
            }
            if(codeManage.getNf()!=null)
            {
                cri.andNfEqualTo(codeManage.getNf());
            }
        }
        if (page != null && page.getSort() != null && page.getOrder() != null) {
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }

    @Override
    public void save(CodeManage codeManage) {
        baseDao.getMapper(CodeManageMapper.class).insertSelective(codeManage);
    }

    @Override
    public CodeManage get(int id) {
        return baseDao.getMapper(CodeManageMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public void update(CodeManage codeManage) {
        baseDao.getMapper(CodeManageMapper.class).updateByPrimaryKeySelective(codeManage);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(CodeManageMapper.class).deleteByPrimaryKey(id);
    }

    @Override
    public void save(List<CodeManage> list) {
        if (list.size() != 0)
            baseDao.getMapper(CodeManageMapper.class).insertBatch(list);
    }
}

