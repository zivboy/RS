package com.ssm.service.core;

import com.ssm.common.mybatis.Page;
import com.ssm.entity.ExtMsg;

import java.util.List;

/**
 * Created by admin on 2014/7/11.
 */
public interface ExtMsgService {

    Page find(Page page, ExtMsg extMsg);

    List<ExtMsg> findList(Page page, ExtMsg extMsg);

    List<ExtMsg> findAll();

    void save(ExtMsg extMsg);

    ExtMsg get(int id);

    void update(ExtMsg extMsg);

    void delete(int id);

}
