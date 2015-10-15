package com.ssm.business.mapper;

import com.ssm.business.entity.Student;
import com.ssm.business.entity.StudentCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int countByExample(StudentCriteria example);

    int deleteByExample(StudentCriteria example);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentCriteria example);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentCriteria example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentCriteria example);
}