package com.snowlink.phmapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.snowlink.phmapi.controller.response.Compay;
import com.snowlink.phmapi.dao.SysCompanyMapper;
import com.snowlink.phmapi.dao.SysTypeMapper;
import com.snowlink.phmapi.model.SysCompanyExtend;
import com.snowlink.phmapi.model.SysType;

import cn.hutool.core.bean.copier.BeanCopier;
import cn.hutool.core.bean.copier.CopyOptions;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhmapiApplicationTests {

	@Test
	public void contextLoads() {
	}

	
	@Autowired
	private SysTypeMapper typeMapper;
	@Test
	public void addType() {
		SysType type =new SysType();
		typeMapper.insert(type);
	}
	
	@Autowired
	private SysCompanyMapper companyMapper;
	
	@Test
	public void getCompany() {
	
		SysCompanyExtend company = companyMapper.getCompanyExtends(1);
		Compay c = new Compay();
		BeanCopier<Compay> copier = BeanCopier.create(company, c, CopyOptions.create());
		c = (Compay) copier.copy();
		c.getName();
		BeanUtils.copyProperties(company, c);
		c.getName();
		company.getDepts();
	}
}

