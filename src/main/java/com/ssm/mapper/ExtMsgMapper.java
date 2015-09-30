package com.ssm.mapper;

import com.ssm.entity.ExtMsg;
import com.ssm.entity.ExtMsgCriteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExtMsgMapper {
    int countByExample(ExtMsgCriteria example);

    int deleteByExample(ExtMsgCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExtMsg record);

    int insertSelective(ExtMsg record);

    List<ExtMsg> selectByExample(ExtMsgCriteria example);

    ExtMsg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExtMsg record, @Param("example") ExtMsgCriteria example);

    int updateByExample(@Param("record") ExtMsg record, @Param("example") ExtMsgCriteria example);

    int updateByPrimaryKeySelective(ExtMsg record);

    int updateByPrimaryKey(ExtMsg record);
}