package com.hrportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.domain.ProjectDetails;
import com.hrportal.main.service.ProjectDetailsServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("projectdetails")
public class ProjectDetailsController {
	
//	http://localhost:8080/projectdetails/tl/tlhomepage
	@Autowired
	private ProjectDetailsServiceInterface projectDetailsServiceInterface;
	@RequestMapping(value="tl/tlhomepage",method = RequestMethod.GET)
	public List<ProjectDetails> getallProjectDetailsList(){
		return projectDetailsServiceInterface.getallProjectDetailsList();
	}
}
