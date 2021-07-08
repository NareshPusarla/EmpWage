public class EmpWage{
	public static final int is_Part_Time = 1;
	public static final int is_Full_Time = 2;
	public static final int no_of_workingDays = 20;
	public static final int wagePerhr = 20;
	public static final int Max_hrs = 100;

	public static int calcEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs){
		System.out.println("Welcome to EmpWage");
		int totalEmpWage = 0;
		int wagePerhr = 20;
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
      while(totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays){
			totalWorkingDays++;
			int check =(int) Math.floor(Math.random()*10)%3;
			switch(check){
			case(is_Part_Time):
				empHrs = 4;
				break;
			case(is_Full_Time):
				empHrs = 8;
				break;
			default :
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days: "+totalWorkingDays + " Emp Hrs: " + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRate;
		System.out.println("Total EmpWage for company: "+company+" is "+totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String args[]){
	calcEmpWageForCompany("DMart", 20, 20, 10);
	calcEmpWageForCompany("Reliance", 10, 20, 20);
	}
}
