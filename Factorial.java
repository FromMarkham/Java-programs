import java.util.Scanner; //import 

//Date: October 11 2024 
//Name: Bob Wang, Factorial.java
//Description: Write an application that reads a nonnegative integer from an input dialog and computes and prints its factorial.
//Skills: while loops, incrementation, algorithms, math, java syntax, classes, inputs, printing to the screen

public class Factorial{ //main class
	
	public static void main(String[]args) { //main method
		
		int number; //Variable to hold the users input
		
		int factorial; //Variable to hold the factorial
		int counter; //Counter for the while loop
		
		counter=1;
		factorial=1;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a factorial"); 
		
		number=input.nextInt(); //Ask the user for the input 

		
		
		while (counter<=number) { //In a while loop, whilst the counter is smaller then the user’s input….

			
			factorial=factorial*counter; //Multiply this variable that is initially set to 1 by the counter 

			
			counter++; //Increment the counter
			
		}
		
		System.out.printf("The factorial of %d is equal to %d",number,factorial); //Print the factorial to the screen. 

		
		
	}
}