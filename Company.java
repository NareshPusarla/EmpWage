package com.bridgelabz.empwage;

import java.util.Scanner;

public class Company extends Employee {
	public Company() {
		
		Scanner sc = ScannerUtil.sc;
		sc.nextLine();
		
		System.out.println("Enter the company name: ");
		super.companyName = sc.nextLine();
		/*
		System.out.println("Enter the emp Wage per hour: ");
		super.empWagePerHr = sc.nextInt();
		
		System.out.println("Enter the company full time hours: ");
		super.fullTime = sc.nextInt();
		
		System.out.println("Enter the company part time hours: ");
		super.partTime = sc.nextInt();
		
		System.out.println("Enter the company working days per month: ");
		super.workingDays = sc.nextInt();
		*/
	}
}
