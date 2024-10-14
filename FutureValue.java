

import java.util.Scanner;

public class FutureValue{
	public static void main(String[]args) {
		System.out.println("Enter the annual interest rate, number of compounding years, and current value ");
		Scanner input=new Scanner(System.in);
		double Rate=input.nextDouble();
		double Years=input.nextDouble();
		double Principal=input.nextDouble();
		
		
		
		double futureValue=Principal*Math.pow((1+Rate/100),Years);
		
		System.out.printf("This is the future value of ur investment %.01f",futureValue);
		
	}
}