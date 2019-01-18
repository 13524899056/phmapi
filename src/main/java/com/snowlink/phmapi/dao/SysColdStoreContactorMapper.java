package com.snowlink.phmapi.dao;

import org.apache.ibatis.annotations.Mapper;

import com.snowlink.phmapi.model.SysColdStoreContactor;

@Mapper
public interface SysColdStoreContactorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_coldstore_contactor
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_coldstore_contactor
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int insert(SysColdStoreContactor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_coldstore_contactor
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int insertSelective(SysColdStoreContactor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_coldstore_contactor
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    SysColdStoreContactor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_coldstore_contactor
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int updateByPrimaryKeySelective(SysColdStoreContactor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_coldstore_contactor
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    int updateByPrimaryKey(SysColdStoreContactor record);
}