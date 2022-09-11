package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.domain.LoginDetails;
import com.hrportal.main.repository.LoginDetailsRepositoryInterface;

@Service
public class loginDetailsServiceIMPL implements LoginDetailsServiceInterface {
	@Autowired
	private LoginDetailsRepositoryInterface loginDetailsRepositoryInterface;

	@Override
	public List<LoginDetails> getallLoginDetailsList() {

		return loginDetailsRepositoryInterface.getallLoginDetailsList();
	}

	@Override
	public LoginDetails getLoginDetailsbyLoginId(String loginId) {
		// TODO Auto-generated method stub
		return loginDetailsRepositoryInterface.getLoginDetailsbyLoginId(loginId);
	}

	@Override
	public LoginDetails loginIdVerification(LoginDetails loginDetails) {
		// TODO Auto-generated method stub
		return loginDetailsRepositoryInterface.loginIdVerification(loginDetails);
	}

}
