
import java.util.Scanner;

public class Compound2{
	public static void main(String[]args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the initial value");
		double Principal=input.nextDouble();
		
		
		
		for (double rate=0.05; rate<=0.10; rate=rate+0.01) {
			
			System.out.printf("rate=%.2f\n", rate);
			System.out.printf("years\t\tfutureValue\n", rate);
			
			for (int Years = 1; Years <=10; Years=Years+1) {
				
				double futureValue=Principal*Math.pow(1+rate,Years);
				
				System.out.printf("%d\t\t$%.2f\n",Years, futureValue);
				
				
			}
			
		}
		

		
		
		
		
	}
}