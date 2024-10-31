
import java.util.Scanner;

//Date: October 31 2024 

//Description: Write an application that determines how many of the salespeople earned salaries in each of the following ranges 
//Skills: arrays, inputs, tables, printf, methods 

public class SalaryTable{
	
	
	static Scanner input=new Scanner(System.in);
	
	static int[] salaries=new int[11];
	
	static int[] thesalaries;
	
	public static void main(String[]args) {
		
		String yesorno;
		do{
		
		int salary;
		
		//Ask the user for a salary 
		salary=askuserforsalaries();
		
		//Classify the salary into a range using an array 
		thesalaries=classifysalaries(salary);
		
		//Ask the user if there are more employees 
		System.out.println("Are there more employees. If u wanna continue type Y, if not, type anything else");
		yesorno=input.next();
		
		//Repeat whilst the user says Y in the console 
		}while (yesorno.equalsIgnoreCase("Y"));
		
		//If the user types something other then y in the console display all the salaries the user entered 
		displaytheresults(thesalaries);
		
	}
	
	//Method to ask the user for salaries 
	private static int askuserforsalaries() {
		
		System.out.println("Enter da salary of anemployees ");
		return input.nextInt();
		
	}
	
	//Method to classify all the salaries the user entered 
	private static int[] classifysalaries(int thesalary) { //so mething is wrong here
		
		if (thesalary/100>=10) {
			++salaries[10];
		}
		
		else {
			++salaries[(thesalary/100)];
			
		}
		
		return salaries;
		
	}
	
	//Method to display how many people earned salaries in the various ranges 
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