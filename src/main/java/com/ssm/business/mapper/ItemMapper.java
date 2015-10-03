package com.ssm.business.mapper;

import com.ssm.business.entity.Item;
import com.ssm.business.entity.ItemCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemMapper {
    int countByExample(ItemCriteria example);

    int deleteByExample(ItemCriteria example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(Item record);

    int insertSelective(Item record);

    List<Item> selectByExample(ItemCriteria example);

    Item selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemCriteria example);

    int updateByExample(@Param("record") Item record, @Param("example") ItemCriteria example);

    int updateByPrimaryKeySelective(Item record);

    int insertBatch(List<Item> list);

    int updateByPrimaryKey(Item record);
}