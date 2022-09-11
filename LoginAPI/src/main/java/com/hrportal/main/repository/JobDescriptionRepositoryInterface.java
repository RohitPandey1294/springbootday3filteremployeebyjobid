package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.domain.JobDescription;

public interface JobDescriptionRepositoryInterface {
	public List<JobDescription> getallJobDescriptionDetails();

	public List<JobDescription> getJobDescriptionByEmployeeId(String employeeId);

	public boolean addNewJobDescription(JobDescription jobdescription);
	
	public List<JobDescription> getJobDescriptionByProjectId(String projectId);
}
