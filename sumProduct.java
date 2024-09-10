import java.util.Scanner; //import from Java utility package 


public class sumProduct{
	public static void main(String[]args) {
		int integer1;
		int integer2;

		
		System.out.println("Enter 2 integers");
		Scanner input1=new Scanner(System.in);
		
		//System.out.println("Enter the second integer");
		Scanner input2=new Scanner(System.in);
		
		//System.out.println("Enter the third integer");

		
		
		integer1=input1.nextInt();
		integer2=input2.nextInt();
	
		
		int product=integer1*integer2;
		int sum=integer1+integer2;
		int difference=integer1-integer2;
		int quotient=integer1/integer2;
		
		
		System.out.printf("This is the product of your 2 integers: %d",product);
		System.out.printf("This is the sum of your 2 integers: %d",sum);
		System.out.printf("This is the difference of your 2 integers: %d",difference);
		System.out.printf("This is the quotient of your 2 integers: %d",quotient);
	}
}