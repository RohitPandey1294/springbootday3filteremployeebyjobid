package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.domain.ProjectDetails;

@Repository
public class ProjectDetailsRepositoryIMPL implements ProjectDetailsRepositoryInterface {
	private static final String SELECT_ALL_PROJECT_DETAILS = "SELECT * FROM PROJECT_DETAILS";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ProjectDetails> getallProjectDetailsList() {
		List<ProjectDetails> allusers = jdbcTemplate.query(SELECT_ALL_PROJECT_DETAILS, new ProjectDetailsRowMapper());
		return allusers;
	}

}
