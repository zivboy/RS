package com.ssm.business.service;

import com.ssm.business.entity.Primod;
import com.ssm.common.mybatis.Page;

import java.util.List;

/**
 * Created by V on Sat Oct 03 17:24:55 GMT+08:00 2015.
 */

public interface PrimodService {

    Page findByPage(Page page, Primod primod);

    List<Primod> findAll(Page page, Primod primod);

    int countByExample(Page page, Primod primod);

    void save(Primod primod);

    Primod get(int id);

    void update(Primod primod);

    void delete(int id);

}

