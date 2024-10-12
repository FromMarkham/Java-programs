//Date: October 12 2024 
//Name: Bob Wang, smallest.java

import java.util.Scanner; //imports

public class Smallest{
	
	public static void main(String[]args) {
		
		//variables
		int number;
		int smallestNumber;
		int number2;
		
		//input
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the first number");
		
		number=input.nextInt();
		
		smallestNumber=number;
		
		for (int i=0; i<=number; i++) {
			
			
			System.out.println("Enter yet another number");
			
			
			number2=input.nextInt();
			
			
			if (number2<smallestNumber) {
				smallestNumber=number2;
			}
			
		}
		
		System.out.println(smallestNumber);
		
	}
}