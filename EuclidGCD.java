
import java.util.Scanner;

public class EuclidGCD{
	
	static int number1;
	static int number2;
	static int thegcd;
	
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[]args) {
		number1=askfornumber1();
		number2=askfornumber2();
		
		thegcd=gcd(number1,number2);
		
		System.out.printf("This is da gcd of yo numbers %d", thegcd);
		
	}
	
	//Ask the user for their first no. 
	private static int askfornumber1() {
		int no1;
		System.out.println("Enter ur 1st no.");
		
		no1=input.nextInt();
		return no1;
		
	}
	
	//ask the user for their second no. 
	private static int askfornumber2() {
		int no2;
		System.out.println("Enter ur 2nd no.");
		
		no2=input.nextInt();
		return no2; 
		
	}
	
	//calculate da gcd 
	private static int gcd(int number1,int number2) {
		
		while(number1!=number2) {
			
			if (number1>number2) {
				
				number1=number1-number2;
				
			}
			
			else {
				
				number2=number2-number1;
				
			}

		}
		return number1;

	}

}
