import java.util.Scanner; //imports

//Date: October 22 2024 
//Name: multiple.java
//Description: Create an application that determines, for a pair of integers, whether the second integer is a multiple of the first. 

public class Multiple{
	
	public static void main(String[]args) {
		
		boolean continueornott;
		continueornott=true;
		
		while (continueornott) {

			int FirstInt=GetFirstInt();
			
			int SecondInt=GetSecondInt();
			
			boolean divisorornot=modulus(FirstInt,SecondInt);
			
			answer(divisorornot,SecondInt,FirstInt);
			
			continueornott=continueorNot();
			
		}
		

		
		
		
	}
	
	private static int GetFirstInt(){
		
		int FirstInteger;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the 1st integer");
		FirstInteger=input.nextInt();
		
		return FirstInteger;
		
		
	}

	private static int GetSecondInt(){

		int SecondInteger;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Second integer");
		SecondInteger=input.nextInt();
		
		return SecondInteger;
		
	}
	
	private static boolean modulus(int FirstInt,int SecondInt){
		
		if (FirstInt%SecondInt==0) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
		
		
	}
	
	private static void answer(boolean divisorornot,int FirstInt,int SecondInt){
	
		if (divisorornot==true) {
			
			System.out.printf("%d is a divisor of %d",FirstInt,SecondInt);
			
		}
		
		else {
			
			System.out.println("The ints aren't divisors");
			
		}
		
		System.out.println("");
		
	}
	
	private static boolean continueorNot(){
		
		String userwants;
	
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Do u want to continue. Enter Y if yes, enter anything else if no");

		userwants=input.next();
		
		if (userwants.equalsIgnoreCase("Y")) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
		
	}

	
	
} //main class
