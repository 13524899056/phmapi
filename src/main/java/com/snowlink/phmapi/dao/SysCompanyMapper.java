package com.snowlink.phmapi.dao;

import org.apache.ibatis.annotations.Mapper;

import com.snowlink.phmapi.model.SysCompany;
import com.snowlink.phmapi.model.SysCompanyExtend;

@Mapper
public interface SysCompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int insert(SysCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int insertSelective(SysCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    SysCompany selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int updateByPrimaryKeySelective(SysCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int updateByPrimaryKey(SysCompany record);
    
    
    SysCompanyExtend getCompanyExtends(Integer id);
}