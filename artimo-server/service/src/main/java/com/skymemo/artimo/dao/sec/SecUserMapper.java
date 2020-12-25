package com.skymemo.artimo.dao.sec;

import com.skymemo.artimo.entity.sec.SecUser;
import com.skymemo.artimo.entity.sec.SecUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecUserMapper {
    long countByExample(SecUserExample example);

    int deleteByExample(SecUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecUser record);

    int insertSelective(SecUser record);

    List<SecUser> selectByExample(SecUserExample example);

    SecUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecUser record, @Param("example") SecUserExample example);

    int updateByExample(@Param("record") SecUser record, @Param("example") SecUserExample example);

    int updateByPrimaryKeySelective(SecUser record);

    int updateByPrimaryKey(SecUser record);
}