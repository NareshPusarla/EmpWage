package com.bridgelabz.empwage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Manager {
	Map<String, Employee> company = new HashMap<>();

	public void add() {
		Employee employee = new Company();
		company.put(employee.getCompanyName(), employee);
		System.out.println("Successfully company added.");
	}

	public void get(String companyName) {
		if (company.get(companyName) == null) {
			System.out.println("Company you entered is not existed, so enter a existed comppany name.");
		} else {
			System.out.println(company.get(companyName));
		}
	}

	public void wage(String companyName) {
		if (company.get(companyName) == null) {
			System.out.println("Company you entered is not existed.");
		} else {
			Scanner sc = ScannerUtil.sc;
			int workingDays = sc.nextInt();
			int empWagePerHr = sc.nextInt();
			int totalWorkingDays = 0;
			int empHrs = 0;
			for (int i = 0; i < workingDays; i++) {
				int days = (int) Math.floor((Math.random() * 10) % 3);
				totalWorkingDays++;
				switch (days) {
				case 1:
					System.out.println("Enter the part time hours: ");
					empHrs = sc.nextInt();
					break;
				case 2:
					System.out.println("Enter the full time hours: ");
					empHrs = sc.nextInt();
					break;
				default:
					empHrs = 0;
				}
				int dailyWage = empHrs * empWagePerHr;
				System.out.println("Today's wage of the employee is: " + dailyWage);
			}
			int totalWage = empHrs * empWagePerHr * totalWorkingDays;
			System.out.println("Employees wage for his month: " + totalWage);
		}
	}
	
	public void delete(String companyName) {
		if(company.get(companyName) == null) {
			System.out.println("Entered company is not exited, so enter an exist company.");
		}else {
			company.remove(companyName);
			System.out.println("Successfully removed the comopany's information.");
		}
	}
}
