//Date: October 12 2024
//Name: Bob Wang, Factorial2.java
//Description: Write an application that evaluates the factorials of the integers from 1 to 5. Display the results in tabular format. 
//Skills: For loops, tables, java syntax, variables, factorials, math, algorithms


public class Factorial2{ //main class
	
	public static void main(String[] args) { //main method
		
		double factorial=1; //set the factorial variable to 1 
		//I'm using double because int can't store enough digits for 20 factorial 
		
		System.out.printf("n\t\tn!\n"); //Make the columns of the table
		
		for (int i=1; i<=20; i++) { //Set the counter to 1, and whilst the counter is smaller then 5, iterate the below 
			
			//Reset the factorial variable to 1
			factorial=1;
			
			//Set the counter for this inner for loop to 1, and whilst this counter is smaller then the counter of the outer loop
			//Iterate the following
			for (int z=1; z<=i; z++) {
				
				//Multiply the factorial variable by the counter of the inner for loop 
				factorial=factorial*z;
				
				
				
			}
		
		System.out.printf("%d\t\t",i); //State the outer loop's current counter 
		System.out.println(factorial); //State the factorial of the outer loop's counter

		
		}
		
	}
}