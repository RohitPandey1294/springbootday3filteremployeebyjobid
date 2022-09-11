package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.domain.EmployeeDetails;

public interface EmployeeDetailsServiceInterface {
	public EmployeeDetails getEmployeeDetailsByloginId(String loginId);

	public List<EmployeeDetails> getEmployeeDetailsByJobIdAndTechSkills(String JobId);
}
