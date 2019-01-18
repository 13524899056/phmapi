package com.snowlink.phmapi.controller.response;


public class BaseResponse<T> {

	private int code;
	
	private int status;
	
	private String message;
	
	private T data;

	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T t) {
		this.data = t;
	}

}
