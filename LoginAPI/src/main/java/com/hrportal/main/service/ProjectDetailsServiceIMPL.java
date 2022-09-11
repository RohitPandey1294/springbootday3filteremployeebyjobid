package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.domain.ProjectDetails;
import com.hrportal.main.repository.ProjectDetailsRepositoryInterface;

@Service
public class ProjectDetailsServiceIMPL implements ProjectDetailsServiceInterface {
	
	@Autowired
	private ProjectDetailsRepositoryInterface projectDetailsRepositoryInterface;

	@Override
	public List<ProjectDetails> getallProjectDetailsList() {

		return projectDetailsRepositoryInterface.getallProjectDetailsList();
	}

}
