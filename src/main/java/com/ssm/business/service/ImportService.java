package com.ssm.business.service;

import com.ssm.business.entity.Imports;
import com.ssm.common.mybatis.Page;

import java.util.List;

/**
 * Created by V on Sat Sep 26 16:41:04 GMT+08:00 2015.
 */

public interface ImportService {

    Page findByPage(Page page, Imports imports);

    List<Imports> findAll(Page page, Imports imports);

    int countByExample(Page page, Imports imports);

    int save(Imports imports);

    Imports get(int id);

    void update(Imports imports);

    void delete(int id);

}

