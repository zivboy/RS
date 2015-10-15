package com.ssm.business.mapper;

import com.ssm.business.entity.Ksjl;
import com.ssm.business.entity.KsjlCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KsjlMapper {
    int countByExample(KsjlCriteria example);

    int deleteByExample(KsjlCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Ksjl record);

    int insertSelective(Ksjl record);

    List<Ksjl> selectByExample(KsjlCriteria example);

    Ksjl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ksjl record, @Param("example") KsjlCriteria example);

    int updateByExample(@Param("record") Ksjl record, @Param("example") KsjlCriteria example);

    int updateByPrimaryKeySelective(Ksjl record);

    int updateByPrimaryKey(Ksjl record);
}