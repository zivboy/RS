package com.ssm.business.service.impl;

import com.ssm.business.entity.Student;
import com.ssm.business.entity.StudentCriteria;
import com.ssm.business.mapper.StudentMapper;
import com.ssm.business.service.StudentService;
import com.ssm.common.basedao.BaseDao;
import com.ssm.common.baseservice.BaseService;
import com.ssm.common.mybatis.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by V on Thu Oct 15 19:03:22 GMT+08:00 2015.
 */
@Service("StudentService")
@Transactional
@SuppressWarnings("unchecked")
public class StudentServiceImpl  extends BaseService implements StudentService {


    @Override
    public Page findByPage(Page page, Student student) {
        page.setCount(countByExample(page,student));
        List<Student> list= findAll(page,student);
        if(list!=null)
            return page.setRows(list);
        else
            return null;
    }
    
    @Override
    public List<Student> findAll(Page page, Student student) {
        return baseDao.selectByPage("com.ssm.business.mapper.StudentMapper."+BaseDao.SELECT_BY_EXAMPLE, getCriteria(page,student),page);
    }

    @Override
    public int countByExample(Page page, Student student) {
        return baseDao.getMapper(StudentMapper.class).countByExample(getCriteria(page,student));
    }

    public StudentCriteria getCriteria(Page page,Student student)
    {
        StudentCriteria criteria = new StudentCriteria();
        StudentCriteria.Criteria cri = criteria.createCriteria();
        if (student != null) {
                
        }
        if(page != null && page.getSort() != null && page.getOrder() != null){
            criteria.setOrderByClause(page.getSort() + " " + page.getOrder());
        }
        return criteria;
    }

    @Override
    public void save(Student student) {
        baseDao.getMapper(StudentMapper.class).insertSelective(student);
    }

    @Override
    public Student get(int id) {
        return baseDao.getMapper(StudentMapper.class).selectByPrimaryKey(Long.valueOf(id));
    }

    @Override
    public void update(Student student) {
        baseDao.getMapper(StudentMapper.class).updateByPrimaryKeySelective(student);
    }

    @Override
    public void delete(int id) {
        baseDao.getMapper(StudentMapper.class).deleteByPrimaryKey(Long.valueOf(id));
    }
}

