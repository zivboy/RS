package com.ssm.business.mapper;

import com.ssm.business.entity.Tjxx;
import com.ssm.business.entity.TjxxCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TjxxMapper {
    int countByExample(TjxxCriteria example);

    int deleteByExample(TjxxCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tjxx record);

    int insertSelective(Tjxx record);

    List<Tjxx> selectByExample(TjxxCriteria example);

    Tjxx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tjxx record, @Param("example") TjxxCriteria example);

    int updateByExample(@Param("record") Tjxx record, @Param("example") TjxxCriteria example);

    int updateByPrimaryKeySelective(Tjxx record);

    int updateByPrimaryKey(Tjxx record);
}