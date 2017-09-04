package com.merilytics.dto;

import java.io.Serializable;

/**
 * @project Survey
 * @author 21258
 * @timeAndYear 5:09:12 PM 22-Aug-2017
 * @description 
 * 
 */
public class RolesDTO implements Serializable{
	private Integer roleId;
	private String roleName;
	private Boolean status;
	private String roleDescription;
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
}
