package com.ssm.service.core;

import com.ssm.common.mybatis.Page;
import com.ssm.entity.Columns;

import java.util.List;

/**
 * Created by vincent on 2014/10/13.
 */
public interface ColumnsService {
    int countByExample(Page page, Columns columns);
    List<Columns> selectByExample(Page page, Columns columns);
    Page findByPage(Page page, Columns columns);
}
