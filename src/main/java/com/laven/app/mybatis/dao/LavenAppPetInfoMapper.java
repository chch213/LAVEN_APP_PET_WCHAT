package com.laven.app.mybatis.dao;

import com.laven.app.mybatis.dto.LavenAppPetInfo;
import com.laven.app.mybatis.dto.LavenAppPetInfoExample;
import com.laven.app.mybatis.dto.LavenAppPetInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LavenAppPetInfoMapper {
    long countByExample(LavenAppPetInfoExample example);

    int deleteByExample(LavenAppPetInfoExample example);

    int deleteByPrimaryKey(LavenAppPetInfoKey key);

    int insert(LavenAppPetInfo record);

    int insertSelective(LavenAppPetInfo record);

    List<LavenAppPetInfo> selectByExample(LavenAppPetInfoExample example);

    LavenAppPetInfo selectByPrimaryKey(LavenAppPetInfoKey key);

    int updateByExampleSelective(@Param("record") LavenAppPetInfo record, @Param("example") LavenAppPetInfoExample example);

    int updateByExample(@Param("record") LavenAppPetInfo record, @Param("example") LavenAppPetInfoExample example);

    int updateByPrimaryKeySelective(LavenAppPetInfo record);

    int updateByPrimaryKey(LavenAppPetInfo record);
}