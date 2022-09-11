package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.domain.JobDescription;

public interface JobDescriptionServiceInterface {
	public List<JobDescription> getallJobDescriptionDetails();

	public List<JobDescription> getJobDescriptionByEmployeeId(String employeeId);

	public boolean addNewJobDescription(JobDescription jobdescription);

	public List<JobDescription> getJobDescriptionByProjectId(String projectId);
}
