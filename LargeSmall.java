import java.util.Arrays; //imports from the java array package so the program can use arrays to find the smallest and largest no.
import java.util.Scanner; //import from Java utility package so the program can accept inputs 


//name: Bob Wang- LargeSmall.java
//Date: September 10 2024 
//Course: ICS3U1 (gr 11 computer science)
//Description:program which asks the user for 5 integers, and finds which integer is the smallest and which one is the largest
//Skills: i can import libraries, use math operations,  get the program to accept inputs and use java classes, variables, and print statements

//main class 
public class LargeSmall{
	//main method 
	public static void main(String[]args) {
		System.out.println("Enter 5 integers"); //prints to console: enter 5 integers 
		
		int integer1; //1st integer 
		int integer2; //2nd integer
		int integer3; //3rd integer
		int integer4; //4th integer 
		int integer5; //5th integer 
		

		
		Scanner input1=new Scanner(System.in); //input for the 1st integer 
		
		
		Scanner input2=new Scanner(System.in); //input for the second integer 
		
		Scanner input3=new Scanner(System.in); //input for the 3rd integer 

		
		Scanner input4=new Scanner(System.in); //input for the 4th integer 
		
		Scanner input5=new Scanner(System.in); //input for the 5th integer 


		//converts inputs to integers 
		integer1=input1.nextInt(); 
		integer2=input2.nextInt();
		integer3=input3.nextInt();
		integer4=input4.nextInt();
		integer5=input5.nextInt();

		//array to store the integer inputs 
		int[] integers=new int[] {integer1,integer2,integer3, integer4,integer5}; 
		
		//Finds the smallest and largest numbers in the above array 
		int smallest=Arrays.stream(integers).min().getAsInt();
		int largest=Arrays.stream(integers).max().getAsInt();
		
		//Prints the smallest and largest integers to the console 
		System.out.printf(".\n This is the smallest of your 3 integers: %d",smallest);
		
		System.out.printf(".\n This is the largest of your 3 integers: %d",largest);
		
	}
}