import java.util.Scanner; //Import 



//Date: October 6 2024 
//Name: Bob Wang-Palindrome.java
//Description: Write an application that reads in a five-digit integer and determines whether it’s a palindrome or not.
//Skills: String manipulation, if statements, while loops, basic java syntax, inputs, variables, etc. 

public class Palindrome{ //Main class 
	public static void main(String[]args) { //Main method 
		Scanner input=new Scanner(System.in);
		
		
		int integer; //Variable to store what the user entered 
		
		String newInteger; //Stores the string version of the integer the user entered 
		
		int Integer2; //Variable to store what the user entered 
		
		int IntegerLength; //Variable for the length of the what the user entered 

		
		StringBuilder stringBuildervariable = new StringBuilder(); //Declare a StringBuilder object. I need it to reverse the input. 

		
		System.out.println("Enter an integer"); 
		integer=input.nextInt();  //Get the user’s input for the integer
		
		

		
		newInteger=Integer.toString(integer); //Convert the integer input to a string. Since java can't count the length of an integer 
		
		
		IntegerLength=newInteger.length(); //Count how many characters the user’s input is 

		
		stringBuildervariable.append(newInteger); //Add the user's input that has now been converted into string form into the stringbuildervariable
		//I'm using stringbuildervariable so it can be reversed 
		

		
		stringBuildervariable.reverse(); //Reverse the stringbuildervariable (whose value is was previously equal to what the user entered)
		
		Integer2=Integer.parseInt(stringBuildervariable.toString()); //Convert the stringbuildervariable back into integer form so it can be compared with what the user entered
		
		while (IntegerLength <5 || IntegerLength >5) { //Run this if the user's integer isn't 5 digits long 
			
			System.out.println("Enter another integer. Your previous integer wasn't 5 digits long");
			integer=input.nextInt(); //Get the user's integer again 
			
			newInteger=Integer.toString(integer); //Convert the user's integer input to a string yet again

			
			stringBuildervariable.setLength(0); //Clear the stringbuildervariable 
			
			stringBuildervariable.append(newInteger); //Make the stringbuildervariable take the value of the new integer converted into string the user entered a few lines ago
			
			stringBuildervariable.reverse(); //Reverse the stringbuildervariable, and thus reverse the integer converted into string the user entered 
			
			Integer2=Integer.parseInt(stringBuildervariable.toString()); //Convert the now-reversed integer converted into string into an integer. So it can be compared to what the user originally entered.

			IntegerLength=newInteger.length(); //Count how many characters the user’s input is 
			
		}
		
		
		if (IntegerLength==5){ //Only do it if the integer's length is 5 

			
			if (integer==Integer2) { //If the reversed integer is the same as the original integer, then it is a palindrome. 
				System.out.println("This is a palindrome");
			}
			
			else { //if not, then it is not a palindrome. 
				System.out.println("This is not a palindrome");
			}
		}	
		
	}
}