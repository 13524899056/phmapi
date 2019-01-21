package com.snowlink.phmapi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.snowlink.phmapi.controller.response.BaseResponse;
import com.snowlink.phmapi.enums.ResultCode;
import com.snowlink.phmapi.model.User;



public class BaseController {

	@ModelAttribute
	public User populateUser(HttpServletRequest request) {
		return (User)request.getAttribute("user");
	}
	
	public BaseResponse error(ResultCode code) {
		BaseResponse res = new BaseResponse();
		res.setStatus(1);
		res.setCode(code.getCode());
		res.setMessage(code.getMessage());
		res.setData(new Object());
		return res;
	}
	
	public BaseResponse error(ResultCode code, String message) {
		BaseResponse res = new BaseResponse();
		res.setStatus(1);
		res.setCode(code.getCode());
		res.setMessage(StringUtils.isEmpty(message)?code.getMessage():message);
		res.setData(new Object());
		return res;
	}
	
	public BaseResponse success(ResultCode code) {
		BaseResponse res = new BaseResponse();
		res.setStatus(0);
		res.setCode(code.getCode());
		res.setMessage(code.getMessage());
		//res.setData(new Object());
		return res;
	}
	
	public <T> BaseResponse success(ResultCode code,T t) {
		BaseResponse<T> res = new BaseResponse();
		res.setCode(code.getCode());
		res.setStatus(0);
		res.setMessage(code.getMessage());
		res.setData(t);
		return res;
	}
	
	public String dealParaError(BindingResult result) {
		StringBuilder sa = new StringBuilder();
		for(ObjectError oe : result.getAllErrors()) {
			sa.append(oe.getDefaultMessage()).append("   ");
		}
		return sa.toString();
	}
	
}
