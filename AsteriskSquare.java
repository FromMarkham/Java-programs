
import java.util.Scanner;

public class AsteriskSquare{
	
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[]args) {
		int noofasterisks;
		noofasterisks=Asktheuser();
		
		SquareOfAsterisks(noofasterisks);
		
	}
	
	private static int Asktheuser() {
		
		int noofasterisks;
		
		System.out.println("Enter how many asterisks u want");
		noofasterisks=input.nextInt();
		
		return noofasterisks;
		
	}
	
	private static void SquareOfAsterisks(int noofasterisks){
		
		for (int i=0; i<noofasterisks; i++) {
			
			for (int t=0; t<noofasterisks; t++) {
				
				System.out.printf("* ");
				
			}
			
			System.out.println(" ");
		}
		
	}
	
}