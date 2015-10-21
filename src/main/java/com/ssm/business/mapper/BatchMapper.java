package com.ssm.business.mapper;

import com.ssm.business.entity.Batch;
import com.ssm.business.entity.BatchCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchMapper {
    int countByExample(BatchCriteria example);

    int deleteByExample(BatchCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Batch record);

    int insertSelective(Batch record);

    List<Batch> selectByExample(BatchCriteria example);

    Batch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Batch record, @Param("example") BatchCriteria example);

    int updateByExample(@Param("record") Batch record, @Param("example") BatchCriteria example);

    int updateByPrimaryKeySelective(Batch record);

    int updateByPrimaryKey(Batch record);
}