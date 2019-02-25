package com.laven.app.mybatis.dao;

import com.laven.app.mybatis.dto.LavenAppUserInfo;
import com.laven.app.mybatis.dto.LavenAppUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LavenAppUserInfoMapper {
    long countByExample(LavenAppUserInfoExample example);

    int deleteByExample(LavenAppUserInfoExample example);

    int deleteByPrimaryKey(String userid);

    int insert(LavenAppUserInfo record);

    int insertSelective(LavenAppUserInfo record);

    List<LavenAppUserInfo> selectByExample(LavenAppUserInfoExample example);

    LavenAppUserInfo selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") LavenAppUserInfo record, @Param("example") LavenAppUserInfoExample example);

    int updateByExample(@Param("record") LavenAppUserInfo record, @Param("example") LavenAppUserInfoExample example);

    int updateByPrimaryKeySelective(LavenAppUserInfo record);

    int updateByPrimaryKey(LavenAppUserInfo record);
}