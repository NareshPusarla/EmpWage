public class EmpWage{
	public static void main(String args[]){	
		System.out.println("Welcome to EmpWage");
		int wagePerhr = 20;
		int empHrs = 0;
		int dailyWage = 0;
		int is_Part_Time = 1;
		int is_Full_Time = 2;
		double check = Math.floor(Math.random()*10)%3;
		if(check == is_Full_Time){
			empHrs = 8;
		}else if(check == is_Part_Time){
			empHrs = 4;
		}
		else{
			empHrs = 0;
		}
		dailyWage = empHrs * wagePerhr;
		System.out.println("EmpWage = " + dailyWage);
	}
}
