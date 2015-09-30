package com.ssm.business.mapper;

import com.ssm.business.entity.Model;
import com.ssm.business.entity.ModelCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModelMapper {
    int countByExample(ModelCriteria example);

    int deleteByExample(ModelCriteria example);

    int deleteByPrimaryKey(Integer modelId);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExample(ModelCriteria example);

    Model selectByPrimaryKey(Integer modelId);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") ModelCriteria example);

    int updateByExample(@Param("record") Model record, @Param("example") ModelCriteria example);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}