package com.snowlink.phmapi.model;

import java.util.Date;

public class SysDept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.id
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.name
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.alias
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String alias;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.province
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.city
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.country
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.address
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.compay_id
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Integer compayId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.is_delete
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_by
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Integer createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_time
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.update_by
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Integer updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.update_time
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.id
     *
     * @return the value of sys_dept.id
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.id
     *
     * @param id the value for sys_dept.id
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.name
     *
     * @return the value of sys_dept.name
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.name
     *
     * @param name the value for sys_dept.name
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.alias
     *
     * @return the value of sys_dept.alias
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.alias
     *
     * @param alias the value for sys_dept.alias
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.province
     *
     * @return the value of sys_dept.province
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.province
     *
     * @param province the value for sys_dept.province
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.city
     *
     * @return the value of sys_dept.city
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.city
     *
     * @param city the value for sys_dept.city
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.country
     *
     * @return the value of sys_dept.country
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.country
     *
     * @param country the value for sys_dept.country
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.address
     *
     * @return the value of sys_dept.address
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.address
     *
     * @param address the value for sys_dept.address
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.compay_id
     *
     * @return the value of sys_dept.compay_id
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Integer getCompayId() {
        return compayId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.compay_id
     *
     * @param compayId the value for sys_dept.compay_id
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setCompayId(Integer compayId) {
        this.compayId = compayId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.is_delete
     *
     * @return the value of sys_dept.is_delete
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.is_delete
     *
     * @param isDelete the value for sys_dept.is_delete
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_by
     *
     * @return the value of sys_dept.create_by
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_by
     *
     * @param createBy the value for sys_dept.create_by
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_time
     *
     * @return the value of sys_dept.create_time
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_time
     *
     * @param createTime the value for sys_dept.create_time
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.update_by
     *
     * @return the value of sys_dept.update_by
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.update_by
     *
     * @param updateBy the value for sys_dept.update_by
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.update_time
     *
     * @return the value of sys_dept.update_time
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.update_time
     *
     * @param updateTime the value for sys_dept.update_time
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}