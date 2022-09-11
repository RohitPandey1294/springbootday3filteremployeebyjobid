package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.domain.LoginDetails;

public class LoginRowMapper implements RowMapper<LoginDetails> {

	@Override
	public LoginDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoginDetails loginDetails = new LoginDetails();
		
		loginDetails.setLoginid(rs.getString("login_id"));
		loginDetails.setUsername(rs.getString("user_name"));
		loginDetails.setPassword(rs.getString("password"));
		loginDetails.setDesignation(rs.getString("designation"));
		return loginDetails;
	}

}