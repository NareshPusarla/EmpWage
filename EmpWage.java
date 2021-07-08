public class EmpWage{
	public static void main(String args[]){
		System.out.println("Welcome to EmpWage");
		int fullTime = 8;
		int wagePerhr = 20;
		int dailyWage = 0;
		int isPresent = 1;
		double check = Math.floor(Math.random()*10)%2;
		if(check == isPresent){
			System.out.println("Employee is present");
			dailyWage = fullTime * wagePerhr;
			System.out.println("EmpWage = " + dailyWage);
		}else{
			System.out.println("Employee is absent");
		}
	}
}
