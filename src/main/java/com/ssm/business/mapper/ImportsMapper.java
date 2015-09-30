package com.ssm.business.mapper;

import com.ssm.business.entity.Imports;
import com.ssm.business.entity.ImportCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImportsMapper {
    int countByExample(ImportCriteria example);

    int deleteByExample(ImportCriteria example);

    int deleteByPrimaryKey(Integer importId);

    int insert(Imports record);

    int insertSelective(Imports record);

    List<Imports> selectByExample(ImportCriteria example);

    Imports selectByPrimaryKey(Integer importId);

    int updateByExampleSelective(@Param("record") Imports record, @Param("example") ImportCriteria example);

    int updateByExample(@Param("record") Imports record, @Param("example") ImportCriteria example);

    int updateByPrimaryKeySelective(Imports record);

    int updateByPrimaryKey(Imports record);
}