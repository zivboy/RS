package com.ssm.generator.service;

import com.ssm.common.mybatis.Page;
import com.ssm.generator.entity.DataBase;
import com.ssm.generator.entity.Tables;

import java.util.List;

/**
 * Created by ZHEJIANG RUIZHENG  on 2014/10/13.
 */
public interface TablesService {
    int countByExample(Page page, Tables tables);
    List<Tables> selectByExample(Page page, Tables tables);
    Page findByPage(Page page, Tables tables);
    List<DataBase> dataBaseGenerator();
}
