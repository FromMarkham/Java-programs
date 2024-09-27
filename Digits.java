import java.util.Scanner; //import from Java utility package so the program can accept inputs 
import java.util.Arrays; //import from the java arrays package 

//Date: September 12 2024 
//Course: ICS3U1 (gr 11 computer science)
//Description: Write an application that inputs one number consisting of five digits from the user, separates the number 
//into individual digits and prints the digits separated.  For example, 42339 will appear as 4 2 3 3 9. 

//Skills: i can import libraries, use arrays, use classes, and use string methods
//and get the program to accept inputs, use classes, and use variables, and use special print statements, and use arrays  
//and leave comments

//the main class
class Digits{
	public static void main(String[]args) { //the main method
		System.out.println("Enter a multi-digit number"); //prompts the user to enter a multi digit number 
		Scanner input=new Scanner(System.in); //input 
		String input1=input.next(); //converts input to string 
		
		String output=input1; //Stores input to a variable
		
		String[] Output=output.split(""); //Converts the input to an array 
		 

	
		System.out.printf(Arrays.toString(Output)); //Prints input as array 
			
	}
}
