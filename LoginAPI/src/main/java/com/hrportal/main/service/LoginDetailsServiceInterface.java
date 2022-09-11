package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.domain.LoginDetails;

public interface LoginDetailsServiceInterface {
	public List<LoginDetails> getallLoginDetailsList();

	public LoginDetails getLoginDetailsbyLoginId(String loginId);

	public LoginDetails loginIdVerification(LoginDetails loginDetails);

}
