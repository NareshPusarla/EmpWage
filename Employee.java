package com.bridgelabz.empwage;

public class Employee {
	int fullTime;
	int partTime;
	int empWagePerHr;
	int workingDays;
	String companyName;
	
	public int getFullTime() {
		return fullTime;
	}
	
	public void setFullTime(int fullTime) {
		this.fullTime = fullTime;
	}
	
	public int getPartTime() {
		return partTime;
	}
	
	public void setPartTime(int partTime) {
		this.partTime = partTime;
	}
	
	public int getEmpWagePerHr() {
		return empWagePerHr;
	}
	
	public void setEmpWagePerHr(int empWagePerHr) {
		this.empWagePerHr = empWagePerHr;
	}
	
	public int getWorkingDays() {
		return workingDays;
	}
	
	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Override
	public String toString() {
		return "EmpWage [fullTime=" + fullTime + ", partTime=" + partTime + ", empWagePerHr=" + empWagePerHr
				+ ", workingDays=" + workingDays + ", companyName=" + companyName + "]";
	}
	
}
