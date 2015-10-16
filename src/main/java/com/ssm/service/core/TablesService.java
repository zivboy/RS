package com.ssm.service.core;

import com.ssm.common.mybatis.Page;
import com.ssm.entity.DataBase;
import com.ssm.entity.Tables;

import java.util.List;

/**
 * Created by vincent on 2014/10/13.
 */
public interface TablesService {
    int countByExample(Page page, Tables tables);
    List<Tables> selectByExample(Page page, Tables tables);
    Page findByPage(Page page, Tables tables);
    List<DataBase> dataBaseGenerator();
}
