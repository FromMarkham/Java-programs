import java.util.Scanner;

public class Even{
	
	public static void main(String[]args) {
		
		boolean continueornott;
		continueornott=true;
		
		while (continueornott) {

			int FirstInt=GetFirstInt();
			
			
			boolean evenornot=modulus(FirstInt);
			
			answer(evenornot,FirstInt);
			
			continueornott=continueorNot();
			
		}
	}
		
		private static int GetFirstInt(){
			
			int FirstInteger;
			
			Scanner input=new Scanner(System.in);
			
			System.out.println("Enter the integer");
			FirstInteger=input.nextInt();
			
			return FirstInteger;
			
			
		}
		
		
		private static boolean modulus(int FirstInt){
			
			if (FirstInt%2==0) {
				
				return true;
				
			}
			
			else {
				
				return false;
				
			}
			
			
			
		}
		
		private static void answer(boolean evenornot,int FirstInt){
		
			if (evenornot==true) {
				
				System.out.printf("%d is an even no.",FirstInt);
				
			}
			
			else {
				
				System.out.printf("%d is an odd no.",FirstInt);
				
			}
			
			System.out.println("");
			
		}
		
		private static boolean continueorNot(){
			
			String userwants;
		
			
			Scanner input=new Scanner(System.in);
			
			System.out.println("Do u want to continue. Enter Y if yes, enter anything else if no");

			userwants=input.next();
			
			if (userwants.equalsIgnoreCase("Y")) {
				
				return true;
				
			}
			
			else {
				
				return false;
				
			}
			
			
		
	
		
		
	}
	
	
	
}