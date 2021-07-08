public class EmpWageObject{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;

	public EmpWageObject(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public static void main(String args[]){

		EmpWageObject emp = new EmpWageObject("DMart", 20, 2, 10);
		int empHrs = 0, totalEmpHrs=0, totalWorkingDays = 0;
		while (totalEmpHrs <= emp.maxHoursPerMonth && totalWorkingDays<emp.numOfWorkingDays){
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch(empCheck){
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day :"+totalWorkingDays+" Emp Hrs:"+empHrs);
		}
		int totalEmpWage = totalEmpHrs*emp.empRatePerHour;
		System.out.println("Total Emp Wage for company: "+emp.company+"is: "+totalEmpWage);
	}
}
