package com.snowlink.phmapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snowlink.phmapi.annotation.LoginRequired;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "监控相关接口", tags="监控相关的接口")
@RestController
@RequestMapping("/monitor")
public class MonitorController {

	@LoginRequired
	@ApiOperation(value = "xx表", notes = "x列表")
	@GetMapping("/m")
	public Object m() {
		return null;
	}
}
