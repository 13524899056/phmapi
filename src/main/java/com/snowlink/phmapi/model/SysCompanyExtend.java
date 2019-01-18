package com.snowlink.phmapi.model;

import java.util.List;

import lombok.Data;

@Data
public class SysCompanyExtend {

	private Integer id;
	
	private String name;
	
	private List<SysDept> depts;
}
