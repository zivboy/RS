package com.ssm.service.core.impl;

import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import com.ssm.entity.DataBase;
import com.ssm.entity.Tables;
import com.ssm.entity.TablesCriteria;
import com.ssm.mapper.TablesMapper;
import com.ssm.service.core.TablesService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vincent on 2014/10/13.
 */
@Service("tablesService")
@Transactional
@SuppressWarnings("unchecked")
public class TablesGeneratorServiceImpl extends BaseService implements TablesService {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public int countByExample(Page page, Tables tables) {
        return baseDao.getMapper(TablesMapper.class).countByExample(getCriteria(page, tables));
    }

    @Override
    public List<Tables> selectByExample(Page page, Tables tables) {
        return baseDao.selectByPage("com.ssm.mapper.TablesMapper." + BaseDao.SELECT_BY_EXAMPLE, getCriteria(page, tables), page);
     }

    @Override
    public Page findByPage(Page page, Tables tables) {
        page.setCount(countByExample(page, tables));
        page.setRows(selectByExample(page,tables));
        return page;
    }

    @Override
    public List<DataBase> dataBaseGenerator()
    {
        return baseDao.getMapper(TablesMapper.class).dataBase();
    }

    public TablesCriteria getCriteria(Page page, Tables tables) {
        TablesCriteria criteria = new TablesCriteria();
        TablesCriteria.Criteria cri = criteria.createCriteria();
        if (tables != null) {
            if (StringUtils.isNotBlank(tables.getTableSchema())) {
                cri.andTableSchemaEqualTo(tables.getTableSchema());
            }
            if (StringUtils.isNotBlank(tables.getTableName())) {
                cri.addCriterion(" TABLE_NAME LIKE CONCAT('%','"+tables.getTableName()+"','%') ");
            }
            if (StringUtils.isNotBlank(tables.getTableComment())) {
                cri.addCriterion(" TABLE_COMMENT LIKE CONCAT('%','"+tables.getTableComment()+"','%') ");
            }
        }
        if (page != null && page.getSort() != null && page.getOrder() != null) {
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }
}
