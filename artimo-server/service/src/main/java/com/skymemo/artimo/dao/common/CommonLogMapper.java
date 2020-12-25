package com.skymemo.artimo.dao.common;

import com.skymemo.artimo.entity.common.CommonLog;
import com.skymemo.artimo.entity.common.CommonLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonLogMapper {
    long countByExample(CommonLogExample example);

    int deleteByExample(CommonLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommonLog record);

    int insertSelective(CommonLog record);

    List<CommonLog> selectByExample(CommonLogExample example);

    CommonLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommonLog record, @Param("example") CommonLogExample example);

    int updateByExample(@Param("record") CommonLog record, @Param("example") CommonLogExample example);

    int updateByPrimaryKeySelective(CommonLog record);

    int updateByPrimaryKey(CommonLog record);
}