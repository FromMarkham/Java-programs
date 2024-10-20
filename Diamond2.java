
import java.util.Scanner;

public class Diamond2{
	
	public static void main(String[]args) {
		
		int numberOfStars=0;
		int peakNoOfSpaces=0;
		
		int peakNoOfSpaces2=0;
		
		int noStars2=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a no.");
		numberOfStars=input.nextInt();
		
		do{
			
			
		System.out.println("Enter a no.");
		numberOfStars=input.nextInt();
			
		}while(numberOfStars<1 || numberOfStars>19 || numberOfStars%2==0);
		
		
		peakNoOfSpaces=numberOfStars-1/2;
		
		int bb=peakNoOfSpaces;
		
		noStars2=numberOfStars;
		
		for (int i=0; i<=numberOfStars; i+=2) {
			
			
			for (int yy=0; yy<=bb; yy++) {
				System.out.printf(" ");
			}
			
			
			for (int kk=0; kk<=i; kk++) {
				
				System.out.printf("*");
				
			}
			
			System.out.println("");
		
			bb=bb-1;
		
			
		}
		
		for (int i=0; i<=numberOfStars; i+=2) {
			
			peakNoOfSpaces2++;
			
			
			
			for (int yy=0; yy<=peakNoOfSpaces2; yy++) {
				System.out.printf(" ");
			}
			
			
			for (int kk=0; kk<=noStars2; kk++) { //this is printing the same no. of stars eachtime 
				//the no u r comparing the counter to has to shrink starting from 5
				
				System.out.printf("*");
				
			}
			
			System.out.println("");
		
			noStars2=noStars2-2;
		
			
		}
		
		
		
	}
}