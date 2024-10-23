
import java.util.Scanner;

public class Min3{
	
	public static void main(String[]args) {
		

		double numbera = 0;
				
	    double numberb = 0;
	    
	     numbera=askForNumbers();
	     numberb=askForNumbers2();
		double numberc=askForNumbers3();
		
		double smallestnumber;
		
		smallestnumber=minimum3(numbera,numberb,numberc);
		
		displayMin(smallestnumber);
		
	}
	
	private static double askForNumbers() {
		
		Scanner input=new Scanner(System.in);
		
	    double number1;
	    

		System.out.println("Enter the 1st no.");
		number1=input.nextDouble();
		

		return number1;
	}
	
	private static double askForNumbers2() {
		
		Scanner input=new Scanner(System.in);
		
	    double number2;
	    

		System.out.println("Enter the 2nd no.");
		number2=input.nextDouble();
		

		return number2;
	}

	private static double askForNumbers3() {
		
		Scanner input=new Scanner(System.in);
		
	    double number3;

		System.out.println("Enter the 3rd no.");
		number3=input.nextDouble();
		

		return number3;
	}
	
	
	private static double minimum3(double numbera,double numberb,double numberc) {
		
		double minno2;
		
		double minno;
		
		minno2=Math.min(numbera, numberb);
		
		minno=Math.min(minno2, numberc);
		
		return minno;
		
	}
	
	private static void displayMin(double smallestnumber) {
		
		System.out.printf("The smallest no. is %.1f", smallestnumber);
		
	}
	
	
	
}
