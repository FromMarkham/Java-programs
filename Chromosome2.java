import java.util.Scanner;

public class Chromosome2{
	
	public static void main (String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		int chromosomeSize=0;
		
		int b=0;
		
		System.out.println("Enter a no.");
		chromosomeSize=input.nextInt();
		

		b=chromosomeSize/2;
		
		for (int c=0; c<=chromosomeSize/2; c++) {
			
			for (int i=0; i<=c; i++) {
				
				System.out.printf(" ");
				
			}
			
			System.out.printf("*");
			
			for (int i=0; i<=b*2; i++) {
				
				System.out.printf(" ");
				
			}			
			
			System.out.printf("*");
			
			System.out.println();
			
			b=b-1;
			
		}
		
		b=chromosomeSize/2;

		for (int c=0; c<=chromosomeSize/2; c++) {
			
			for (int i=0; i<=b; i++) {
				
				System.out.printf(" ");
				
			}
			
			System.out.printf("*");
			
			for (int i=0; i<=c*2; i++) {
				
				System.out.printf(" ");
				
			}			
			
			System.out.printf("*");
			
			System.out.println();
			
			b=b-1;
			
		}

		

		
	}
	
}
