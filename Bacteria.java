
import java.util.Scanner;

public class Bacteria{
	
	public static void Main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		
		int BacteriaPop;
		
		double currentSize=0;
		
		double Seconds=0;
		
		
		System.out.println("Enter the bacteria size u want to achieve");
		BacteriaPop=input.nextInt();
		
		while (currentSize<=BacteriaPop) {
			
			Seconds+=0.1;
			
			currentSize=Math.pow(2,Seconds/3.2);
			
			
			
			
			
		}
		
		System.out.printf("It'll take this many secs for the bacteria to reach the population %.1f",Seconds);
		
	}
	
}