package com.ssm.generator.service.impl;

import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import com.ssm.generator.entity.Columns;
import com.ssm.generator.entity.ColumnsCriteria;
import com.ssm.generator.mapper.ColumnsMapper;
import com.ssm.generator.service.ColumnsService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ZHEJIANG RUIZHENG  on 2014/10/13.
 */
@Service("columnsService")
@Transactional
@SuppressWarnings("unchecked")
public class ColumnsGeneratorServiceImpl extends BaseService implements ColumnsService {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public int countByExample(Page page, Columns columns) {
        return baseDao.getMapper(ColumnsMapper.class).countByExample(getCriteria(page, columns));
    }

    @Override
    public List<Columns> selectByExample(Page page, Columns columns) {
        return baseDao.getMapper(ColumnsMapper.class).selectByExample(getCriteria(page, columns));
    }

    @Override
    public Page findByPage(Page page, Columns columns) {
        page.setCount(countByExample(page, columns));
        page.setRows(selectByExample(page,columns));
        return page;
    }

    public ColumnsCriteria getCriteria(Page page, Columns columns) {
        ColumnsCriteria criteria = new ColumnsCriteria();
        ColumnsCriteria.Criteria cri = criteria.createCriteria();
        if (columns != null) {
            if (StringUtils.isNotBlank(columns.getTableSchema())) {
                cri.andTableSchemaEqualTo(columns.getTableSchema());
            }
            if (StringUtils.isNotBlank(columns.getTableName())) {
                cri.andTableNameEqualTo(columns.getTableName());
            }
        }
        if (page != null && page.getSort() != null && page.getOrder() != null) {
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }
}
