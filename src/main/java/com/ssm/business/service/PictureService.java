package com.ssm.business.service;

import com.ssm.business.entity.Picture;
import com.ssm.common.mybatis.Page;
import com.ssm.exception.ServiceException;

import java.util.List;

/**
 * Created by V on Sat Oct 17 22:21:53 GMT+08:00 2015.
 */

public interface PictureService {

    Page findByPage(Page page, Picture picture);

    List<Picture> findAll(Page page, Picture picture);

    int countByExample(Page page,Picture picture);

    void save(Picture picture);

    Picture get(int id);

    void update(Picture picture);

    void delete(int id);

}

