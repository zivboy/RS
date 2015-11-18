package com.ssm.business.service;

import com.ssm.business.entity.CodeManage;
import com.ssm.common.mybatis.Page;
import com.ssm.exception.ServiceException;

import java.util.List;

/**
 * Created by V on Sun Nov 08 23:13:45 GMT+08:00 2015.
 */

public interface CodeManageService {

    Page findByPage(Page page, CodeManage codeManage);

    List<CodeManage> findAll(Page page, CodeManage codeManage);

    int countByExample(Page page,CodeManage codeManage);

    void save(CodeManage codeManage);

    CodeManage get(int id);

    void update(CodeManage codeManage);

    void delete(int id);

    void save(List<CodeManage> list);

}

