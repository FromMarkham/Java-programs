import java.util.Scanner;

//date: october 4 2024 
//course: Grade 11 computer science 
//name: bob wang, highest.java 
//description:  Create a Java application that inputs a series of 10 integers and determines and prints the highest integer.  
//skills: If statements, logic, basic java syntax, variables, integers, 

public class Highest {
	public static void main(String[]args) {
		
	
		int int1;
		int int2;
		int int3;
		int int4;
		int int5;
		int int6;
		int int7;
		int int8;
		int int9;
		int int10;
		
		int highest;
		
		highest=0;
		
		int secondHighest;
		
		Scanner input=new Scanner(System.in);	
		
		System.out.println("Enter the first integer");// Get the user’s input for the first integer

		int1=input.nextInt();
		
		
		System.out.println("Enter the second integer"); //Get the user’s input for the second integer
		int2=input.nextInt();
		
		if (int2>int1) {
			highest=int2; //if the second integer is greater then the first integer, make that the new highest integer. 

		}
	
		System.out.println("Enter the third integer");
		int3=input.nextInt(); //Get the user’s input for the third integer.
		
		if (int3>highest) {
			highest=int3; //This time, if the integer is greater then the current highest integer, make that the new highest integer. 

		}
		
		System.out.println("Enter the fourth integer"); 
		int4=input.nextInt(); //from this line on, get the user’s input for the fourth, fifth, sixth, and all the way to the tenth integer. 
		
		//each time the above is done, the user’s input will be compared against the current highest integer.
		//If it’s greater then the current highest integer, make that the new highest integer. 

		
		
		if (int4>highest) {
			highest=int4;
		}
		
		System.out.println("Enter the fifth integer");
		int5=input.nextInt();
		
		if (int5>highest) {
			highest=int5;
		}
		
		System.out.println("Enter the sixth integer");
		int6=input.nextInt();
		
		if (int6>highest) {
			highest=int6;
		}
		
		System.out.println("Enter the seventh integer");
		int7=input.nextInt();
		
		
		if (int7>highest) {
			highest=int7;
		}
		
		System.out.println("Enter the eitgth integer");
		int8=input.nextInt();
		
		if (int8>highest) {
			highest=int8;
		}
	
		System.out.println("Enter the ninth integer");
		int9=input.nextInt();
		
		if (int9>highest) {
			highest=int9;
		}
		
		System.out.println("Enter the tenth integer");
		int10=input.nextInt();
		
		if (int10>highest) {
			highest=int10;
			
		}
		
		System.out.println(highest); //print the highest integer to the console 
		
	}
}