import java.util.Scanner; //import from Java utility package 


public class Product{
	public static void main(String[]args) {
		int integer1;
		int integer2;
		int integer3;
		
		System.out.println("Enter 3 integers");
		Scanner input1=new Scanner(System.in);
		
		//System.out.println("Enter the second integer");
		Scanner input2=new Scanner(System.in);
		
		//System.out.println("Enter the third integer");
		Scanner input3=new Scanner(System.in);
		
		
		integer1=input1.nextInt();
		integer2=input2.nextInt();
		integer3=input3.nextInt();
		
		int product=integer1*integer2*integer3;
		
		System.out.printf("This is the product of your 3 integers: %d",product);
		
	}
}