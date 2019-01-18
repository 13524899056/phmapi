package com.snowlink.phmapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snowlink.phmapi.model.SysType;
import com.snowlink.phmapi.service.TypeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value = "类型相关接口",tags="与类型相关的接口")
@RestController
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private TypeService typeService;
	
	@ApiOperation(value = "添加类型", notes = "添加类型")
	@PostMapping("/addType")
	public Object addType(@RequestBody SysType type) {
		typeService.add(type);
		
		return type;
	}
}
