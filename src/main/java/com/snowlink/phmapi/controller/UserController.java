package com.snowlink.phmapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snowlink.phmapi.annotation.LoginRequired;
import com.snowlink.phmapi.controller.request.LoginParam;
import com.snowlink.phmapi.model.User;
import com.snowlink.phmapi.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@Api(value = "用户相关接口",tags="与用户相关的接口")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiImplicitParams({
			@ApiImplicitParam(name = "token", value = "token", required = false, dataType = "String", paramType = "header") })
	@ApiOperation(value = "用户登陆", notes = "用户登陆")
	@PostMapping("/login")
	public Object login(@Valid @RequestBody LoginParam param, BindingResult result) {

		return null; 
	}

	@LoginRequired
	@ApiOperation(value = "查询用户的冷库列表", notes = "查询用户的冷库列表")
	@PostMapping("/findUserCSs")
	public Object listUserColdStores(@ApiIgnore @ModelAttribute User u) {

		return null;
	}
}
