package com.merilytics.dto;

import java.io.Serializable;

/**
 * @project Survey
 * @author 21258
 * @timeAndYear 5:07:44 PM 22-Aug-2017
 * @description 
 * 
 */
public class RoleToScreenMappingDTO implements Serializable{
	
	private Integer mappingId;
	
	private Integer screenId;
	
	private Integer roleId;
	
	private String status;

	public Integer getMappingId() {
		return mappingId;
	}

	public void setMappingId(Integer mappingId) {
		this.mappingId = mappingId;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
		
	
}
