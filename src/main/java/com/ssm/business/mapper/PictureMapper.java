package com.ssm.business.mapper;

import com.ssm.business.entity.Picture;
import com.ssm.business.entity.PictureCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper {
    int countByExample(PictureCriteria example);

    int deleteByExample(PictureCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureCriteria example);

    Picture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureCriteria example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureCriteria example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}