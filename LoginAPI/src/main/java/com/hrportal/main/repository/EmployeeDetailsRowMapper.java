package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.EmployeeDetails;
import com.hrportal.main.domain.LoginDetails;
import com.hrportal.main.domain.ProjectDetails;

public class EmployeeDetailsRowMapper implements RowMapper<EmployeeDetails> {

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		LoginDetails loginDetails = new LoginDetails();

		loginDetails.setLoginid(rs.getString("login_id"));
		
		ProjectDetails projectDetails = new ProjectDetails();

		projectDetails.setProjectId(rs.getString("project_id"));
		
		EmployeeDetails employeeDetails = new EmployeeDetails();

		employeeDetails.setEmployeeId(rs.getString("employee_id"));
		employeeDetails.setEmployeeFirstName(rs.getString("employee_first_name"));
		employeeDetails.setEmployeeLastName(rs.getString("employee_last_name"));
		employeeDetails.setProjectDetails(projectDetails);
		employeeDetails.setLoginDetails(loginDetails);
		employeeDetails.setContactNo(rs.getString("contact_no"));
		employeeDetails.setHiredate(rs.getDate("hiredate").toLocalDate());
		employeeDetails.setHighestqualification(rs.getString("highest_qualification"));
		employeeDetails.setGender(rs.getString("gender"));
		employeeDetails.setDateofbirth(rs.getDate("date_of_birth").toLocalDate());
		employeeDetails.setSalary(rs.getInt("salary"));
		employeeDetails.setCtc(rs.getInt("ctc"));
		employeeDetails.setOnWorkbench(rs.getString("on_workbench"));
		employeeDetails.setTechnicalskills1(rs.getString("technical_skills_1"));
		employeeDetails.setTechnicalskills2(rs.getString("technical_skills_2"));
		employeeDetails.setTechnicalskills3(rs.getString("technical_skills_3"));
		employeeDetails.setDesignation(rs.getString("designation"));
		employeeDetails.setReportsto(rs.getString("reports_to"));

		return employeeDetails;

	}

}