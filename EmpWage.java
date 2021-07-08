public class EmpWage{
                public static final int is_Part_Time = 1;
                public static final int is_Full_Time = 2;
	public static void main(String args[]){
		System.out.println("Welcome to EmpWage");
		int wagePerhr = 20;
		int empHrs = 0;
		int dailyWage = 0;
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
		dailyWage = empHrs * wagePerhr;
		System.out.println("EmpWage = " + dailyWage);
	}
}
