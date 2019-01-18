package com.snowlink.phmapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snowlink.phmapi.dao.SysTypeMapper;
import com.snowlink.phmapi.model.SysType;

@Service
public class TypeService {

	
	@Autowired
	private SysTypeMapper typeMapper;
	
	public void add(SysType type) {
		typeMapper.insert(type);
	}

}
