package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.domain.EmployeeDetails;

public interface EmployeeDetailsRepositoryInterface {
	public EmployeeDetails getEmployeeDetailsByloginId(String loginId);

	public List<EmployeeDetails> getEmployeeDetailsByJobIdAndTechSkills(String jobId);

}
