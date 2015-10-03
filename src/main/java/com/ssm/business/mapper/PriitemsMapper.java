package com.ssm.business.mapper;

import com.ssm.business.entity.Priitems;
import com.ssm.business.entity.PriitemsCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PriitemsMapper {
    int countByExample(PriitemsCriteria example);

    int deleteByExample(PriitemsCriteria example);

    int deleteByPrimaryKey(Integer priId);

    int insert(Priitems record);

    int insertSelective(Priitems record);

    List<Priitems> selectByExample(PriitemsCriteria example);

    Priitems selectByPrimaryKey(Integer priId);

    int updateByExampleSelective(@Param("record") Priitems record, @Param("example") PriitemsCriteria example);

    int updateByExample(@Param("record") Priitems record, @Param("example") PriitemsCriteria example);

    int updateByPrimaryKeySelective(Priitems record);

    int updateByPrimaryKey(Priitems record);
}