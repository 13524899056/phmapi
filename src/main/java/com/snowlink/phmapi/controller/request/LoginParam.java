package com.snowlink.phmapi.controller.request;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LoginParam {
	
	@NotNull
	@ApiModelProperty(value="手机号", required=true)
	private String mobile;
	
	@ApiModelProperty(value="密码", required=true)
	@NotNull
	private String password;

}
