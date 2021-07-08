public class EmpWage{
	public static void main(String args[]){
		System.out.println("Welcome to EmpWage");
		int isPresent = 1;
		double check = Math.floor(Math.random()*10)%2;
		if(check == isPresent){
			System.out.println("Employee is present");
		}else{
			System.out.println("Employee is absent");
		}
	}
}
