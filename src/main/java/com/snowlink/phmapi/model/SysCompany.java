package com.snowlink.phmapi.model;

import java.util.Date;

public class SysCompany {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.ID
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Name
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Alias
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String alias;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Descp
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String descp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Category
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Boolean category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Logo
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String logo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.mainImg
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String mainimg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Status
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Region
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String region;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Type
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Longitude
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Float longitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Latitude
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Float latitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Contactor
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String contactor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.MobilePhone
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String mobilephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Email
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Province
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.City
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.County
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String county;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Address
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.Website
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String website;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.create_date
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.creator
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.update_date
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.updater
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    private String updater;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.ID
     *
     * @return the value of sys_company.ID
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.ID
     *
     * @param id the value for sys_company.ID
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Name
     *
     * @return the value of sys_company.Name
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Name
     *
     * @param name the value for sys_company.Name
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Alias
     *
     * @return the value of sys_company.Alias
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Alias
     *
     * @param alias the value for sys_company.Alias
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Descp
     *
     * @return the value of sys_company.Descp
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getDescp() {
        return descp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Descp
     *
     * @param descp the value for sys_company.Descp
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setDescp(String descp) {
        this.descp = descp == null ? null : descp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Category
     *
     * @return the value of sys_company.Category
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Boolean getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Category
     *
     * @param category the value for sys_company.Category
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setCategory(Boolean category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Logo
     *
     * @return the value of sys_company.Logo
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getLogo() {
        return logo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Logo
     *
     * @param logo the value for sys_company.Logo
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.mainImg
     *
     * @return the value of sys_company.mainImg
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getMainimg() {
        return mainimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.mainImg
     *
     * @param mainimg the value for sys_company.mainImg
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setMainimg(String mainimg) {
        this.mainimg = mainimg == null ? null : mainimg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Status
     *
     * @return the value of sys_company.Status
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Status
     *
     * @param status the value for sys_company.Status
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Region
     *
     * @return the value of sys_company.Region
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Region
     *
     * @param region the value for sys_company.Region
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Type
     *
     * @return the value of sys_company.Type
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Type
     *
     * @param type the value for sys_company.Type
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Longitude
     *
     * @return the value of sys_company.Longitude
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Longitude
     *
     * @param longitude the value for sys_company.Longitude
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Latitude
     *
     * @return the value of sys_company.Latitude
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Latitude
     *
     * @param latitude the value for sys_company.Latitude
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Contactor
     *
     * @return the value of sys_company.Contactor
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getContactor() {
        return contactor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Contactor
     *
     * @param contactor the value for sys_company.Contactor
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setContactor(String contactor) {
        this.contactor = contactor == null ? null : contactor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.MobilePhone
     *
     * @return the value of sys_company.MobilePhone
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.MobilePhone
     *
     * @param mobilephone the value for sys_company.MobilePhone
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Email
     *
     * @return the value of sys_company.Email
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Email
     *
     * @param email the value for sys_company.Email
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Province
     *
     * @return the value of sys_company.Province
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Province
     *
     * @param province the value for sys_company.Province
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.City
     *
     * @return the value of sys_company.City
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.City
     *
     * @param city the value for sys_company.City
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.County
     *
     * @return the value of sys_company.County
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.County
     *
     * @param county the value for sys_company.County
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Address
     *
     * @return the value of sys_company.Address
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Address
     *
     * @param address the value for sys_company.Address
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.Website
     *
     * @return the value of sys_company.Website
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getWebsite() {
        return website;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.Website
     *
     * @param website the value for sys_company.Website
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.create_date
     *
     * @return the value of sys_company.create_date
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.create_date
     *
     * @param createDate the value for sys_company.create_date
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.creator
     *
     * @return the value of sys_company.creator
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.creator
     *
     * @param creator the value for sys_company.creator
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.update_date
     *
     * @return the value of sys_company.update_date
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.update_date
     *
     * @param updateDate the value for sys_company.update_date
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.updater
     *
     * @return the value of sys_company.updater
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.updater
     *
     * @param updater the value for sys_company.updater
     *
     * @mbg.generated Fri Jan 18 10:38:36 CST 2019
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }
}