import java.util.Scanner;

public class Factorial{
	public static void main(String[]args) {
		
		int number;
		int factorial;
		int counter;
		counter=1;
		factorial=1;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a factorial");
		number=input.nextInt();
		
		
		while (counter<=number) {
			
			factorial=factorial*counter;
			
			counter++;
			
		}
		
		System.out.printf("The factorial of %d is equal to %d",number,factorial);
		
		
	}
}