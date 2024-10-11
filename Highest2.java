import java.util.Scanner;

//date: october 4 2024 
//course: Grade 11 computer science 
//name: bob wang, Highest2.java 
//description:  Create a Java application that inputs a series of 10 integers and determines and get the highest integer and the second highest.  
//skills: If statements, logic, basic java syntax, variables, integers, while loop

public class Highest2 {
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		int counter=0;
		int currentNumber;
		int highest,secondHighest;
		
		
		System.out.println("Enter a no.");
		highest=input.nextInt();
		secondHighest=highest;
		
		System.out.println("Enter another number");
		currentNumber=input.nextInt();
		
		if (currentNumber>highest) {
			highest=currentNumber;
		}
		
		else {
			secondHighest=currentNumber;
		}

		
		while (counter<=7) {
			System.out.println("Enter da next number");
			currentNumber=input.nextInt();
			counter++;
			
			if (currentNumber>highest) {
				secondHighest=highest;
				highest=currentNumber;
			}
			
			else if (currentNumber<highest & currentNumber>secondHighest) {
				secondHighest=currentNumber;
			}

			
		}
		System.out.println(highest);
		System.out.println(secondHighest);
		
	}
}