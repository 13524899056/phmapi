package com.snowlink.phmapi.dao;

import org.apache.ibatis.annotations.Mapper;

import com.snowlink.phmapi.model.SysUserRole;

@Mapper
public interface SysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int insert(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int insertSelective(SysUserRole record);
}