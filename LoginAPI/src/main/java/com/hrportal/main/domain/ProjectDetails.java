package com.hrportal.main.domain;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class ProjectDetails {

	private String projectId;
	private String projectName;
	private int empCount;
	private LocalDate projectStartDate;
	private LocalDate projectEndDate;
	private String status;
	private int overallBudget;

	public ProjectDetails() {
		// TODO Auto-generated constructor stub
	}

	public ProjectDetails(String projectId, String projectName, int empCount, LocalDate projectStartDate,
			LocalDate projectEndDate, String status, int overallBudget) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.empCount = empCount;
		this.projectStartDate = projectStartDate;
		this.projectEndDate = projectEndDate;
		this.status = status;
		this.overallBudget = overallBudget;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public LocalDate getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(LocalDate projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public LocalDate getProjectEndDate() {
		return projectEndDate;
	}

	public void setProjectEndDate(LocalDate projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getOverallBudget() {
		return overallBudget;
	}

	public void setOverallBudget(int overallBudget) {
		this.overallBudget = overallBudget;
	}

	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", projectName=" + projectName + ", empCount=" + empCount
				+ ", projectStartDate=" + projectStartDate + ", projectEndDate=" + projectEndDate + ", status=" + status
				+ ", overallBudget=" + overallBudget + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empCount, overallBudget, projectEndDate, projectId, projectName, projectStartDate, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectDetails other = (ProjectDetails) obj;
		return empCount == other.empCount && overallBudget == other.overallBudget
				&& Objects.equals(projectEndDate, other.projectEndDate) && Objects.equals(projectId, other.projectId)
				&& Objects.equals(projectName, other.projectName)
				&& Objects.equals(projectStartDate, other.projectStartDate) && Objects.equals(status, other.status);
	}

	
}