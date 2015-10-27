package com.ssm.business.service;

import com.ssm.business.entity.Student;
import com.ssm.common.mybatis.Page;
import com.ssm.exception.ServiceException;

import java.util.List;

/**
 * Created by V on Mon Oct 26 15:59:00 GMT+08:00 2015.
 */

public interface StudentService {

    Page findByPage(Page page, Student student);

    List<Student> findAll(Page page, Student student);

    int countByExample(Page page,Student student);

    void save(Student student);

    Student get(int id);

    void update(Student student);

    void delete(int id);

}

