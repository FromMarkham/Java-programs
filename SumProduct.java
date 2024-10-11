import java.util.Scanner; //import from Java utility package 

//Date: September 10 2024 
//Course: ICS3U1 (gr 11 computer science)
//Description:program which calculates the product, sum, difference, and quotient of 2 integers specified by the user
//Skills: i can import libraries, use math operations and get the program to accept inputs, use classes, and use variables, and use special print statements 

//main class
public class SumProduct{
	
	//main method
	public static void main(String[]args) {
		//variable for integer 1
		int integer1;
		
		//variable for integer 2 
		int integer2;

		//prompts user to enter 2 integers 
		System.out.println("Enter 2 integers");
		
		//Get user input for integer 1
		Scanner input1=new Scanner(System.in);
		
		//Get user input for integer 2 
		Scanner input2=new Scanner(System.in);
		


		
		//Converts 1st  user input into integer
		integer1=input1.nextInt();
		
		//Converts 2nd  user input into integer 
		integer2=input2.nextInt();
	
		//Calculates the product of the 2 integers 
		int product=integer1*integer2;
		
		//Calculates the sum of the 2 integers 
		int sum=integer1+integer2;
		
		//Calculates the difference between the 2 integers 
		int difference=integer1-integer2;
		
		//Calculates the quotient of the 2 integers 
		int quotient=integer1/integer2;
		
		//Prints the product of the 2 integers 
		System.out.printf("This is the product of your 2 integers: %d",product);
		
		//Prints the sum of the 2 integers 
		System.out.printf("This is the sum of your 2 integers: %d",sum);
		
		//Prints the difference of the 2 integers 
		System.out.printf("This is the difference of your 2 integers: %d",difference);
		
		//Prints the quotient of the 2 integers 
		System.out.printf("This is the quotient of your 2 integers: %d",quotient);
	}
}