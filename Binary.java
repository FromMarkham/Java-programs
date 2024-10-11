import java.util.Scanner; //import

//Date: October 6 2024 
//Name: Bob Wang, Binary.java
//Description: Write an application that inputs an integer containing only 0s and 1s (binary) and prints its decimal equivalent.
//Skills: Imports, string manipulation, java syntax, printf statements, parseInt method 

public class Binary { //main class
	
	public static void main(String[]args) { //main method 
		
		int IntegerEquivalent;
		int binary;
		String binaryString;
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a binary number");
		binary=input.nextInt(); //Get the user’s input for a binary number and store it in a variable 

		
		binaryString=Integer.toString(binary); //Before doing that, convert the input into a string and store it in a another variable
		
		IntegerEquivalent=Integer.parseInt(binaryString,2); //pass the new variable into the integer.parseint method, and store the output in a new integer variable

		
		System.out.printf("This is the integer equivalent of your binary number %d",IntegerEquivalent); //Print the new integer that came out of the user’s binary number 

		
		
	}
}