import java.util.Scanner; //import from Java utility package so the program can accept inputs 
import java.util.Arrays; //import from the java array package so the program can use arrays 

import java.util.List;
import  java.lang.reflect.Array;
//Date: September 12 2024 
//Course: ICS3U1 (gr 11 computer science)
//Description: 


//Skills: i can import libraries, use arrays, use classes, and use string methods
//and get the program to accept inputs, use classes, and use variables, and use special print statements, and use arrays  
//and leave comments

//the main class
class AddAge{
	public static void main(String[]args) { //the main method
		System.out.println("Enter your name , then and age (no spaces, like johnsmith18)"); //prompts user to enter their name and current age 
		 
		Scanner nameAge=new Scanner(System.in); //store the input name in a variable 


		String newNameAge=nameAge.next();
		
		String[] newNameAge2=newNameAge.split("");
		int Length = newNameAge2.length-1;
		
		
		
		System.out.println(newNameAge2[Length-1]+newNameAge2[Length]);
		
		
		//System.out.println(newNameAge[Length]); //
		
		
		
		
		
		//System.out.println(Arrays.toString(newNameAge)); //print the users name 
		//System.out.printf("next year you will be: %d",Age); //print the users age next year 
		
	}
}
