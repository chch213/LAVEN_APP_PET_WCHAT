package com.laven.app.mybatis.dao;

import com.laven.app.mybatis.dto.LavenAppUserRole;
import com.laven.app.mybatis.dto.LavenAppUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LavenAppUserRoleMapper {
    long countByExample(LavenAppUserRoleExample example);

    int deleteByExample(LavenAppUserRoleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(LavenAppUserRole record);

    int insertSelective(LavenAppUserRole record);

    List<LavenAppUserRole> selectByExample(LavenAppUserRoleExample example);

    LavenAppUserRole selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") LavenAppUserRole record, @Param("example") LavenAppUserRoleExample example);

    int updateByExample(@Param("record") LavenAppUserRole record, @Param("example") LavenAppUserRoleExample example);

    int updateByPrimaryKeySelective(LavenAppUserRole record);

    int updateByPrimaryKey(LavenAppUserRole record);
}