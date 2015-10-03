package com.ssm.business.mapper;

import com.ssm.business.entity.Primod;
import com.ssm.business.entity.PrimodCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrimodMapper {
    int countByExample(PrimodCriteria example);

    int deleteByExample(PrimodCriteria example);

    int deleteByPrimaryKey(Integer modId);

    int insert(Primod record);

    int insertSelective(Primod record);

    List<Primod> selectByExample(PrimodCriteria example);

    Primod selectByPrimaryKey(Integer modId);

    int updateByExampleSelective(@Param("record") Primod record, @Param("example") PrimodCriteria example);

    int updateByExample(@Param("record") Primod record, @Param("example") PrimodCriteria example);

    int updateByPrimaryKeySelective(Primod record);

    int updateByPrimaryKey(Primod record);
}