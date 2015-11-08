package com.ssm.business.service;

import com.ssm.business.entity.Ksjl;
import com.ssm.common.mybatis.Page;
import com.ssm.exception.ServiceException;

import java.util.List;

/**
 * Created by V on Wed Nov 04 22:20:24 GMT+08:00 2015.
 */

public interface KsjlService {

    Page findByPage(Page page, Ksjl ksjl);

    List<Ksjl> findAll(Page page, Ksjl ksjl);

    int countByExample(Page page,Ksjl ksjl);

    void save(Ksjl ksjl);

    Ksjl get(int id);

    void update(Ksjl ksjl);

    void delete(int id);

}

