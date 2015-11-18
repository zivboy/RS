package com.ssm.business.mapper;

import com.ssm.business.entity.CodeManage;
import com.ssm.business.entity.CodeManageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeManageMapper {
    int countByExample(CodeManageCriteria example);

    int deleteByExample(CodeManageCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(CodeManage record);

    int insertSelective(CodeManage record);

    List<CodeManage> selectByExample(CodeManageCriteria example);

    CodeManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CodeManage record, @Param("example") CodeManageCriteria example);

    int updateByExample(@Param("record") CodeManage record, @Param("example") CodeManageCriteria example);

    int updateByPrimaryKeySelective(CodeManage record);

    int updateByPrimaryKey(CodeManage record);

    int insertBatch(List<CodeManage> list);
}