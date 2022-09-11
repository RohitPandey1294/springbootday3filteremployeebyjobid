package com.hrportal.main.domain;

import java.util.Objects;

public class JobDescription {
	private String jobId;
	private ProjectDetails projectDetails;
	private String technicalSkills1;
	private String technicalSkills2;
	private String technicalSkills3;
	private String requiredCandidates;
	private int remainingBudget;
	private String status;
	private EmployeeDetails employeeDetails;

	public JobDescription() {
		// TODO Auto-generated constructor stub
	}

	public JobDescription(String jobId, ProjectDetails projectDetails, String technicalSkills1, String technicalSkills2,
			String technicalSkills3, String requiredCandidates, int remainingBudget, String status,
			EmployeeDetails employeeDetails) {
		super();
		this.jobId = jobId;
		this.projectDetails = projectDetails;
		this.technicalSkills1 = technicalSkills1;
		this.technicalSkills2 = technicalSkills2;
		this.technicalSkills3 = technicalSkills3;
		this.requiredCandidates = requiredCandidates;
		this.remainingBudget = remainingBudget;
		this.status = status;
		this.employeeDetails = employeeDetails;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	public String getTechnicalSkills1() {
		return technicalSkills1;
	}

	public void setTechnicalSkills1(String technicalSkills1) {
		this.technicalSkills1 = technicalSkills1;
	}

	public String getTechnicalSkills2() {
		return technicalSkills2;
	}

	public void setTechnicalSkills2(String technicalSkills2) {
		this.technicalSkills2 = technicalSkills2;
	}

	public String getTechnicalSkills3() {
		return technicalSkills3;
	}

	public void setTechnicalSkills3(String technicalSkills3) {
		this.technicalSkills3 = technicalSkills3;
	}

	public String getRequiredCandidates() {
		return requiredCandidates;
	}

	public void setRequiredCandidates(String requiredCandidates) {
		this.requiredCandidates = requiredCandidates;
	}

	public int getRemainingBudget() {
		return remainingBudget;
	}

	public void setRemainingBudget(int remainingBudget) {
		this.remainingBudget = remainingBudget;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	@Override
	public String toString() {
		return "JobDescription [jobId=" + jobId + ", projectDetails=" + projectDetails + ", technicalSkills1="
				+ technicalSkills1 + ", technicalSkills2=" + technicalSkills2 + ", technicalSkills3=" + technicalSkills3
				+ ", requiredCandidates=" + requiredCandidates + ", remainingBudget=" + remainingBudget + ", status="
				+ status + ", employeeDetails=" + employeeDetails + "]";
	}

}
