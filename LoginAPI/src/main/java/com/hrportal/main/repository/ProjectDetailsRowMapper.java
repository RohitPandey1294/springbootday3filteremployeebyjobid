package com.hrportal.main.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.ProjectDetails;

public class ProjectDetailsRowMapper implements RowMapper<ProjectDetails> {

	@Override
	public ProjectDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProjectDetails projectDetails = new ProjectDetails();

		projectDetails.setProjectId(rs.getString("project_id"));
		projectDetails.setProjectName(rs.getString("project_name"));
		projectDetails.setEmpCount(rs.getInt("emp_count"));
		projectDetails.setProjectStartDate(rs.getDate("project_start_date").toLocalDate());
		projectDetails.setProjectEndDate(rs.getDate("project_end_date").toLocalDate());
		projectDetails.setStatus(rs.getString("status"));
		projectDetails.setOverallBudget(rs.getInt("overall_budget"));

		return projectDetails;
	}

}
