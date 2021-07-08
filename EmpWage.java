package com.bridgelabz;

public class EmpWage {
	String company;
	int empRatePerHour;
	int numOfWorkingDays;
	int maxHoursPerMonth;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getEmpRatePerHour() {
		return empRatePerHour;
	}
	public void setEmpRatePerHour(int empRatePerHour) {
		this.empRatePerHour = empRatePerHour;
	}
	public int getNumOfWorkingDays() {
		return numOfWorkingDays;
	}
	public void setNumOfWorkingDays(int numOfWorkingDays) {
		this.numOfWorkingDays = numOfWorkingDays;
	}
	public int getMaxHoursPerMonth() {
		return maxHoursPerMonth;
	}
	public void setMaxHoursPerMonth(int maxHoursPerMonth) {
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	@Override
	public String toString() {
		return "EmpWage [company=" + company + ", empRatePerHour=" + empRatePerHour + ", numOfWorkingDays="
				+ numOfWorkingDays + ", maxHoursPerMonth=" + maxHoursPerMonth + "]";
	}

	
}
