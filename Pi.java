import java.util.Scanner;


public class Pi{
	
	public static void main(String[]args) {
		
		
		double pi=0;
		
		double denominator=1;
		
		int amountOfApproximation;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter how many digits of approximation u want");
		
		amountOfApproximation=input.nextInt();

		
		for (int i=0; i<=amountOfApproximation; i++) {
			

			
			if (i%2==1) {
				pi-=(4/denominator);
				
			}
			
			if (i%2==0) {
				pi+=(4/denominator);
			}
			
			denominator+=2;
			
		}
		
		System.out.println(pi);
	} 
	
}