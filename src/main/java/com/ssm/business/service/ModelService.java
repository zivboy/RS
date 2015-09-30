package com.ssm.business.service;

import com.ssm.business.entity.Model;
import com.ssm.common.mybatis.Page;

import java.util.List;

/**
 * Created by V on Tue Sep 22 23:54:08 GMT+08:00 2015.
 */

public interface ModelService {

    Page findByPage(Page page, Model model);

    List<Model> findAll(Page page, Model model);

    int countByExample(Page page, Model model);

    int save(Model model);

    Model get(int id);

    void update(Model model);

    void delete(int id);

}

