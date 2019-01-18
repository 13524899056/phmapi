package com.snowlink.phmapi.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User{
/**
 * @JsonIgnore
    public int getStudentId() {
        return studentId;
    }

    @JsonProperty("student_id")
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @JsonProperty("studentId")
    public int getJavaStudentId() {
        return studentId;
    }
 */
	private Integer id;
	
	@Min(3)
	@ApiModelProperty(value="用户名",required=true)
	private String name;
	
	@ApiModelProperty(value="密码",required=true)
	private String password;

	@ApiModelProperty(value="令牌",required=false)
	private String token;
	
	@Email
	@ApiModelProperty(value="邮箱",required=false)
	private String email;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	
}
