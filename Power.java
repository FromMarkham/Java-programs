
import java.util.Scanner; //imports

//Date: October 22 2024 
//Name: 
//Description:
//Skills: math, for loops, methods, arguments, parameters, main classes, main methods, etc. 

public class Power{ //main class
	
	public static void main(String[]args) { //main method 
		
		//Ask user for the base
		int base=getBase();
		
		//Ask user for the exponent
		int exponent=getExponent();
		
		//Calculate the base raised to the exponent
		int power=calculatePower(base,exponent);
		
		//Display the base raised to the exponent
		displayPower(base,exponent,power);
		
		
	}
	
	//Method which gets the base
	private static int getBase() {
		
		int base;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter da base");
		base=input.nextInt();
		
		return base;
		
		
	}
	
	//Method which gets the exponent
	private static int getExponent() {
		
		int exponent;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter da exponent");
		exponent=input.nextInt();
		
		return exponent;
		
	}
	
	//Method which calculates the power 
	private static int calculatePower(int base, int exponent) {
		
		int power2;
		
		power2=base;
		
		for (int counter=1; counter<exponent; counter++) {
			
			power2*=base;
			
		}
		
		return power2;

		
	}
	
	private static void displayPower(int base, int exponent,int power) {
		
		System.out.printf("%d raised to the power of %d equals %d",base,exponent,power);
		
		
		
	}
	
	
}