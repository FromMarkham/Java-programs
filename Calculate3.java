import java.util.Arrays;
import java.util.Scanner; //import from Java utility package 


public class Calculate3{
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
		int sum=(integer1+integer2+integer3);
		int average=(integer1+integer2+integer3)/3;
		
		int[] integers=new int[] {integer1,integer2,integer3};
		
		int smallest=Arrays.stream(integers).min().getAsInt();
		int largest=Arrays.stream(integers).max().getAsInt();
		
		System.out.printf(".\n This is the product of your 3 integers: %d",product);
		
		System.out.printf(".\n This is the sum of your 3 integers: %d",sum);
	
		System.out.printf(".\n This is the average of your 3 integers: %d",average);
		
		System.out.printf(".\n This is the smallest of your 3 integers: %d",smallest);
		
		System.out.printf(".\n This is the largest of your 3 integers: %d",largest);
		
	}
}