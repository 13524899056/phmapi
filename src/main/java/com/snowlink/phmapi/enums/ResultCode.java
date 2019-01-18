package com.snowlink.phmapi.enums;



public enum ResultCode {
	SUCCESS(0,"success"),
	FAIL(1,"Fail"),
	INVALIDTOKEN(100,"Invalid token!"),
	WRONGPARAMETER(101,"wrong parameter");
	
	private ResultCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public static String getMessage(int code) {
		for(ResultCode res : ResultCode.values()) {
			if(res.getCode() == code) {
				return res.message;
			}
		}
		return null;
	}

	
	private int code;
	
	private String message;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
