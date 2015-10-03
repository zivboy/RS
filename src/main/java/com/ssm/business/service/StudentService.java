package com.ssm.business.service;

import com.ssm.business.entity.Student;
import com.ssm.common.mybatis.Page;

import java.util.List;

/**
 * Created by V on Sat Oct 03 14:22:22 GMT+08:00 2015.
 */

public interface StudentService {

    Page findByPage(Page page, Student student);

    List<Student> findAll(Page page, Student student);

    int countByExample(Page page, Student student);

    void save(Student student);

    Student get(int id);

    void update(Student student);

    void delete(int id);

}

