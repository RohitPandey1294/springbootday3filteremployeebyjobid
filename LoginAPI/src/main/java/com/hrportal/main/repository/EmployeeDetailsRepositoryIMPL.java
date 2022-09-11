package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.domain.EmployeeDetails;

@Repository
public class EmployeeDetailsRepositoryIMPL implements EmployeeDetailsRepositoryInterface {
	private static final String GET_EMPLOYEE_DETAILS_BY_LOGIN_ID = "SELECT * FROM EMPLOYEE_DETAILS WHERE login_id=?";

	private static final String GET_EMPLOYEE_DETAILS_BY_JOBID_TECHNICALSKILLS = "select \r\n"
			+ "jd.job_id,jd.project_id,jd.technical_skills_1,jd.technical_skills_2,jd.technical_skills_3,jd.required_candidates,jd.remaining_budget,jd.status,jd.employee_id,\r\n"
			+ "ed.employee_id,ed.employee_first_name,ed.employee_last_name,ed.contact_no,ed.hiredate,ed.highest_qualification,ed.login_id,ed.gender,ed.date_of_birth,ed.salary,ed.ctc,ed.on_workbench,ed.designation,ed.reports_to,ed.technical_skills_1,ed.technical_skills_2,ed.technical_skills_3\r\n"
			+ "from employee_details ed JOIN job_description jd\r\n" + "ON\r\n"
			+ "jd.technical_skills_1=ed.technical_skills_1 and\r\n"
			+ "jd.technical_skills_2=ed.technical_skills_2 and\r\n"
			+ "jd.technical_skills_3=ed.technical_skills_3 and\r\n" + "ed.project_id =100\r\n" + "and jd.job_id=?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public EmployeeDetails getEmployeeDetailsByloginId(String loginId) {
//		System.out.println(loginId);
		EmployeeDetails employeeDetails = jdbcTemplate.queryForObject(GET_EMPLOYEE_DETAILS_BY_LOGIN_ID,
				new EmployeeDetailsRowMapper(), loginId);
		return employeeDetails;
	}

	@Override
	public List<EmployeeDetails> getEmployeeDetailsByJobIdAndTechSkills(String jobId) {
		return this.jdbcTemplate.query(GET_EMPLOYEE_DETAILS_BY_JOBID_TECHNICALSKILLS, new EmployeeDetailsRowMapper(),
				jobId);

	}

}
