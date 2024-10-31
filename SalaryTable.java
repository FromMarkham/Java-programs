
import java.util.Scanner;

public class SalaryTable{
	
	
	static Scanner input=new Scanner(System.in);
	
	static int[] salaries=new int[11];
	
	static int[] thesalaries;
	
	public static void main(String[]args) {
		
		String yesorno;
		do{
		
		int salary;
		
		salary=askuserforsalaries();
		thesalaries=classifysalaries(salary);
		
		System.out.println("Are there more employees. If u wanna continue type Y, if not, type anything else");
		yesorno=input.next();
		
		}while (yesorno.equalsIgnoreCase("Y"));
		
		displaytheresults(thesalaries);
		
	}
	
	private static int askuserforsalaries() {
		
		System.out.println("Enter da salary of anemployees ");
		return input.nextInt();
		
	}
	
	private static int[] classifysalaries(int thesalary) { //so mething is wrong here
		
		if (thesalary/100>=10) {
			++salaries[10];
		}
		
		else {
			++salaries[(thesalary/100)];
			
		}
		
		return salaries;
		
	}
	
	private static void displaytheresults(int []salaries) {
		
		
		System.out.println("");
		
		System.out.println("Salary range      number of ppl who have the salary");
		
		for (int i=0; i<salaries.length-1; i++) {
			
			
			System.out.printf("$%d00-%d99\t%d\n",i,i,salaries[i]);
			
		}
		System.out.println(" ");
		System.out.printf("$1k+             %d", salaries[10]);
		
		
	}

	
	
}

