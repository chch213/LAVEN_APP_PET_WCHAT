package com.laven.app.mybatis.dao;

import com.laven.app.mybatis.dto.LavenAppUserAddress;
import com.laven.app.mybatis.dto.LavenAppUserAddressExample;
import com.laven.app.mybatis.dto.LavenAppUserAddressKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LavenAppUserAddressMapper {
    long countByExample(LavenAppUserAddressExample example);

    int deleteByExample(LavenAppUserAddressExample example);

    int deleteByPrimaryKey(LavenAppUserAddressKey key);

    int insert(LavenAppUserAddress record);

    int insertSelective(LavenAppUserAddress record);

    List<LavenAppUserAddress> selectByExample(LavenAppUserAddressExample example);

    LavenAppUserAddress selectByPrimaryKey(LavenAppUserAddressKey key);

    int updateByExampleSelective(@Param("record") LavenAppUserAddress record, @Param("example") LavenAppUserAddressExample example);

    int updateByExample(@Param("record") LavenAppUserAddress record, @Param("example") LavenAppUserAddressExample example);

    int updateByPrimaryKeySelective(LavenAppUserAddress record);

    int updateByPrimaryKey(LavenAppUserAddress record);
}