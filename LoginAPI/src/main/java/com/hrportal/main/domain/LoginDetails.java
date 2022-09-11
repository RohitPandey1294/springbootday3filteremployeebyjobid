package com.hrportal.main.domain;

import java.util.Objects;

public class LoginDetails {

	private String loginid = "";
	private String username = "";
	private String password = "";
	private String designation = "";

	
	 public LoginDetails() {
		// TODO Auto-generated constructor stub
	}


	public LoginDetails(String loginid, String username, String password, String designation) {
		super();
		this.loginid = loginid;
		this.username = username;
		this.password = password;
		this.designation = designation;
	}


	public String getLoginid() {
		return loginid;
	}


	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "LoginDetails [loginid=" + loginid + ", username=" + username + ", password=" + password
				+ ", designation=" + designation + ", getLoginid()=" + getLoginid() + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getDesignation()=" + getDesignation() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(designation, loginid, password, username);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginDetails other = (LoginDetails) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(loginid, other.loginid)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}
	 
	 
}
