package com.snowlink.phmapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snowlink.phmapi.dao.SysUserMapper;

@Service
public class UserService {

	@Autowired
	private SysUserMapper userDao;
	
	
}
