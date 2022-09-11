
package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.EmployeeDetails;
import com.hrportal.main.domain.JobDescription;
import com.hrportal.main.domain.LoginDetails;
import com.hrportal.main.domain.ProjectDetails;

public class JobDescriptionRowMapper implements RowMapper<JobDescription> {

	@Override
	public JobDescription mapRow(ResultSet rs, int rowNum) throws SQLException {

		
		ProjectDetails projectDetails = new ProjectDetails();

		projectDetails.setProjectId(rs.getString("project_id"));
		
		EmployeeDetails employeeDetails = new EmployeeDetails();

		employeeDetails.setEmployeeId(rs.getString("employee_id"));
		

		JobDescription jobDescription = new JobDescription();
		jobDescription.setJobId(rs.getString("job_id"));
		jobDescription.setProjectDetails(projectDetails);
		jobDescription.setTechnicalSkills1(rs.getString("technical_skills_1"));
		jobDescription.setTechnicalSkills2(rs.getString("technical_skills_2"));
		jobDescription.setTechnicalSkills3(rs.getString("technical_skills_3"));
		jobDescription.setRequiredCandidates(rs.getString("required_candidates"));
		jobDescription.setRemainingBudget(rs.getInt("remaining_budget"));
		jobDescription.setStatus(rs.getString("status"));
		jobDescription.setEmployeeDetails(employeeDetails);

		return jobDescription;
		
	}

}
