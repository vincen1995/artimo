package com.skymemo.artimo.dao.common;

import com.skymemo.artimo.entity.common.CommonData;
import com.skymemo.artimo.entity.common.CommonDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonDataMapper {
    long countByExample(CommonDataExample example);

    int deleteByExample(CommonDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommonData record);

    int insertSelective(CommonData record);

    List<CommonData> selectByExample(CommonDataExample example);

    CommonData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommonData record, @Param("example") CommonDataExample example);

    int updateByExample(@Param("record") CommonData record, @Param("example") CommonDataExample example);

    int updateByPrimaryKeySelective(CommonData record);

    int updateByPrimaryKey(CommonData record);
}