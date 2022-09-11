package com.hrportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.domain.LoginDetails;
import com.hrportal.main.domain.ProjectDetails;
import com.hrportal.main.service.LoginDetailsServiceInterface;
import com.hrportal.main.service.ProjectDetailsServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("loginapi")
public class LoginDetailsController {
	@Autowired
	private LoginDetailsServiceInterface loginDetailsServiceInterface;

	@RequestMapping(value = "login/all", method = RequestMethod.GET)
	public List<LoginDetails> getAllLoginDetails() {
		return loginDetailsServiceInterface.getallLoginDetailsList();
	}

	@RequestMapping(value = "login/{loginId}", method = RequestMethod.GET)
	public LoginDetails getLoginDetailsByLoginID(@PathVariable String loginId) {
		return loginDetailsServiceInterface.getLoginDetailsbyLoginId(loginId);
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public LoginDetails loginIdVerification(@RequestBody LoginDetails loginDetails) {
		System.out.println(loginDetails);
		return loginDetailsServiceInterface.loginIdVerification(loginDetails);
	}

	
}
