package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.domain.LoginDetails;

public interface LoginDetailsRepositoryInterface {
	public List<LoginDetails> getallLoginDetailsList();

	public LoginDetails getLoginDetailsbyLoginId(String loginId);
	
	public LoginDetails loginIdVerification (LoginDetails loginDetails);
}
