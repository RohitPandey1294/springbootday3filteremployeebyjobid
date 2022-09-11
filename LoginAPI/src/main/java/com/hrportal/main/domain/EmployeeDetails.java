package com.hrportal.main.domain;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class EmployeeDetails {
	private String employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String contactNo;
	private LocalDate hiredate;
	private String highestqualification;
	private String gender;
	private LocalDate dateofbirth;
	private int salary;
	private int ctc;
	private String onWorkbench;
	private String technicalskills1;
	private String technicalskills2;
	private String technicalskills3;
	private String designation;
	private String reportsto;
	private ProjectDetails projectDetails;
	private LoginDetails loginDetails;

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(String employeeId, String employeeFirstName, String employeeLastName, String contactNo,
			LocalDate hiredate, String highestqualification, String gender, LocalDate dateofbirth, int salary, int ctc,
			String onWorkbench, String technicalskills1, String technicalskills2, String technicalskills3,
			String designation, String reportsto, ProjectDetails projectDetails, LoginDetails loginDetails) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.contactNo = contactNo;
		this.hiredate = hiredate;
		this.highestqualification = highestqualification;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.salary = salary;
		this.ctc = ctc;
		this.onWorkbench = onWorkbench;
		this.technicalskills1 = technicalskills1;
		this.technicalskills2 = technicalskills2;
		this.technicalskills3 = technicalskills3;
		this.designation = designation;
		this.reportsto = reportsto;
		this.projectDetails = projectDetails;
		this.loginDetails = loginDetails;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	public String getHighestqualification() {
		return highestqualification;
	}

	public void setHighestqualification(String highestqualification) {
		this.highestqualification = highestqualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCtc() {
		return ctc;
	}

	public void setCtc(int ctc) {
		this.ctc = ctc;
	}

	public String getOnWorkbench() {
		return onWorkbench;
	}

	public void setOnWorkbench(String onWorkbench) {
		this.onWorkbench = onWorkbench;
	}

	public String getTechnicalskills1() {
		return technicalskills1;
	}

	public void setTechnicalskills1(String technicalskills1) {
		this.technicalskills1 = technicalskills1;
	}

	public String getTechnicalskills2() {
		return technicalskills2;
	}

	public void setTechnicalskills2(String technicalskills2) {
		this.technicalskills2 = technicalskills2;
	}

	public String getTechnicalskills3() {
		return technicalskills3;
	}

	public void setTechnicalskills3(String technicalskills3) {
		this.technicalskills3 = technicalskills3;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getReportsto() {
		return reportsto;
	}

	public void setReportsto(String reportsto) {
		this.reportsto = reportsto;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	public LoginDetails getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName
				+ ", employeeLastName=" + employeeLastName + ", contactNo=" + contactNo + ", hiredate=" + hiredate
				+ ", highestqualification=" + highestqualification + ", gender=" + gender + ", dateofbirth="
				+ dateofbirth + ", salary=" + salary + ", ctc=" + ctc + ", onWorkbench=" + onWorkbench
				+ ", technicalskills1=" + technicalskills1 + ", technicalskills2=" + technicalskills2
				+ ", technicalskills3=" + technicalskills3 + ", designation=" + designation + ", reportsto=" + reportsto
				+ ", projectDetails=" + projectDetails + ", loginDetails=" + loginDetails + ", getEmployeeId()="
				+ getEmployeeId() + ", getEmployeeFirstName()=" + getEmployeeFirstName() + ", getEmployeeLastName()="
				+ getEmployeeLastName() + ", getContactNo()=" + getContactNo() + ", getHiredate()=" + getHiredate()
				+ ", getHighestqualification()=" + getHighestqualification() + ", getGender()=" + getGender()
				+ ", getDateofbirth()=" + getDateofbirth() + ", getSalary()=" + getSalary() + ", getCtc()=" + getCtc()
				+ ", getOnWorkbench()=" + getOnWorkbench() + ", getTechnicalskills1()=" + getTechnicalskills1()
				+ ", getTechnicalskills2()=" + getTechnicalskills2() + ", getTechnicalskills3()="
				+ getTechnicalskills3() + ", getDesignation()=" + getDesignation() + ", getReportsto()="
				+ getReportsto() + ", getProjectDetails()=" + getProjectDetails() + ", getLoginDetails()="
				+ getLoginDetails() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactNo, ctc, dateofbirth, designation, employeeFirstName, employeeId, employeeLastName,
				gender, highestqualification, hiredate, loginDetails, onWorkbench, projectDetails, reportsto, salary,
				technicalskills1, technicalskills2, technicalskills3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		return Objects.equals(contactNo, other.contactNo) && ctc == other.ctc
				&& Objects.equals(dateofbirth, other.dateofbirth) && Objects.equals(designation, other.designation)
				&& Objects.equals(employeeFirstName, other.employeeFirstName)
				&& Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(employeeLastName, other.employeeLastName) && Objects.equals(gender, other.gender)
				&& Objects.equals(highestqualification, other.highestqualification)
				&& Objects.equals(hiredate, other.hiredate) && Objects.equals(loginDetails, other.loginDetails)
				&& Objects.equals(onWorkbench, other.onWorkbench)
				&& Objects.equals(projectDetails, other.projectDetails) && Objects.equals(reportsto, other.reportsto)
				&& salary == other.salary && Objects.equals(technicalskills1, other.technicalskills1)
				&& Objects.equals(technicalskills2, other.technicalskills2)
				&& Objects.equals(technicalskills3, other.technicalskills3);
	}

}
