package com.ssm.business.service;

import com.ssm.business.entity.Batch;
import com.ssm.common.mybatis.Page;
import com.ssm.exception.ServiceException;

import java.util.List;

/**
 * Created by V on Wed Oct 21 22:27:03 GMT+08:00 2015.
 */

public interface BatchService {

    Page findByPage(Page page, Batch batch);

    List<Batch> findAll(Page page, Batch batch);

    int countByExample(Page page,Batch batch);

    void save(Batch batch);

    Batch get(int id);

    void update(Batch batch);

    void delete(int id);

}

