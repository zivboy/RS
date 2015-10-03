package com.ssm.business.service;

import com.ssm.business.entity.Priitems;
import com.ssm.common.mybatis.Page;

import java.util.List;

/**
 * Created by V on Sat Oct 03 17:25:39 GMT+08:00 2015.
 */

public interface PriitemsService {

    Page findByPage(Page page, Priitems priitems);

    List<Priitems> findAll(Page page, Priitems priitems);

    int countByExample(Page page, Priitems priitems);

    void save(Priitems priitems);

    Priitems get(int id);

    void update(Priitems priitems);

    void delete(int id);

}

