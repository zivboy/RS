package com.ssm.generator.service;

import com.ssm.common.mybatis.Page;
import com.ssm.generator.entity.Columns;

import java.util.List;

/**
 * Created by ZHEJIANG RUIZHENG  on 2014/10/13.
 */
public interface ColumnsService {
    int countByExample(Page page, Columns columns);
    List<Columns> selectByExample(Page page, Columns columns);
    Page findByPage(Page page, Columns columns);
}
