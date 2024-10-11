
import java.util.Scanner;

public class Credit{
	public static void main(String[]args) {
		
		int accountNum;
		int beginningBalance;
		int charge;
		int totalCreditsApplied;
		int creditLimit;
		int newBalance;
		
		int continueOrNot;
		
		continueOrNot=1;
		
		Scanner input=new Scanner(System.in);
		
		while (continueOrNot==1) {
		
			System.out.println("Enter the account number");
			accountNum=input.nextInt();
		
			System.out.println("Enter the balance at the beginning of the month");
			beginningBalance=input.nextInt();
		
			System.out.println("Enter the total of all items charged by the customer this month");
			charge=input.nextInt();
		
			System.out.println("Enter the total of all credits applied to the customer’s account this month");
			totalCreditsApplied=input.nextInt();
		
			System.out.println("Enter the allowed credit limit");
			creditLimit=input.nextInt();
		
			newBalance=beginningBalance+charge-totalCreditsApplied;
		
			if (newBalance>creditLimit) {
				System.out.println("Credit limit exceeded lol");
			}
		
			else {
				System.out.println("Credit limit not exceeded");
			}
			
			System.out.println("Enter 1 to continue, enter another number to stop");
			continueOrNot=input.nextInt();
		
		}
		
	}
}