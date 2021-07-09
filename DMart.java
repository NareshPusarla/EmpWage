package com.bridgelabz;

import java.util.Scanner;

public class DMart extends EmpWage{
	public DMart(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the company name: ");
		this.company = sc.nextLine();
		
		System.out.println("Enter the emp wage per hour: ");
		this.empRatePerHour = sc.nextInt();
		
		System.out.println("Enter the number of working days: ");
		this.numOfWorkingDays = sc.nextInt();
		
		System.out.println("Enter the max hours per month: ");
		this.maxHoursPerMonth = sc.nextInt();
		
		int empHrs = 0, totalEmpHrs=0, totalWorkingDays = 0;
	}
}
