
import java.util.Scanner;

public class Bars{
	
	public static void main(String[]args) {
		
		int numberOfStars;
		
		Scanner input=new Scanner(System.in);
		
		
		
		for (int questionCount=0; questionCount<=5; questionCount++) {
			
			System.out.println("Enter a no. between 1 & 30");
			numberOfStars=input.nextInt();
			
			
			while (numberOfStars<1 || numberOfStars>30) {
				System.out.println("Ur first number wasn't between 1 and 30");
				numberOfStars=input.nextInt();
			}
			
			for (int starCount=0; starCount<numberOfStars; starCount++) {
				System.out.printf("*");
				
			}
			
			System.out.println();
			
		}
		

		

		
	} 
	
}