package com.merilytics.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class UsersDTO implements Serializable {
	private String email;
	private Integer roleId;
	private String firstName;
	private String lastName;
	private Timestamp lastLoginDate;
	private String loggedIn;
	private String currentPassword;
	private String forgotPassword;
	private String oldPassword1;
	private String oldPassword2;
	private String oldPassword3;
	private Timestamp passwordModifiedDate;
	private Timestamp updationDate;
	private Timestamp creationDate;
	private String status;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Timestamp getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(String loggedIn) {
		this.loggedIn = loggedIn;
	}
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public String getForgotPassword() {
		return forgotPassword;
	}
	public void setForgotPassword(String forgotPassword) {
		this.forgotPassword = forgotPassword;
	}
	public String getOldPassword1() {
		return oldPassword1;
	}
	public void setOldPassword1(String oldPassword1) {
		this.oldPassword1 = oldPassword1;
	}
	public String getOldPassword2() {
		return oldPassword2;
	}
	public void setOldPassword2(String oldPassword2) {
		this.oldPassword2 = oldPassword2;
	}
	public String getOldPassword3() {
		return oldPassword3;
	}
	public void setOldPassword3(String oldPassword3) {
		this.oldPassword3 = oldPassword3;
	}
	public Timestamp getPasswordModifiedDate() {
		return passwordModifiedDate;
	}
	public void setPasswordModifiedDate(Timestamp passwordModifiedDate) {
		this.passwordModifiedDate = passwordModifiedDate;
	}
	public Timestamp getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(Timestamp updationDate) {
		this.updationDate = updationDate;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
