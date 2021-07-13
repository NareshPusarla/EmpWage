package com.bridgelabz.empwage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the employee reference.");
		
		Manager manager = new Manager();
		
		Scanner sc = ScannerUtil.sc;
		boolean in = true;
		while (in) {
			System.out.println("1.Add 2.Get 3.Wage 4.Delete 5.Exit");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				manager.add();
				break;
				
			case 2:
				System.out.println("Enter the company name to see the data.");
				String companyName = sc.nextLine();
				manager.get(companyName);
				break;
				
			case 3:
				System.out.println("Enter the company name: ");
				String companyName1 = sc.nextLine();
				//int empWagePerHr = sc.nextInt();
				//int workingDays = sc.nextInt();
				manager.wage(companyName1);
				break;
				
			case 4:
				System.out.println("Enter the company name you want to delete: ");
				String companyName2 = sc.nextLine();
				manager.delete(companyName2);
				
			case 5:	
				in = false;
				System.out.println("Successfully exited");
				break;
			}
		}
	}

}
