
import java.util.Scanner;

//Date: October 22 2024 
//
//
//

public class Parking{
	
	public static void main(String[]args) {
		
		double hours=getHours();
		
		double parkingFee=calculateParkingFee(hours);
		
		displayparkingPrice(parkingFee);
		
	}
	
	private static double getHours() {
		
		double parkingHours;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter how many hours you want to park for");
		
		parkingHours=input.nextDouble();
		
		return parkingHours;
		
	}
	
	private static double calculateParkingFee(double hours) {
		
		double fee;
		
		if (hours<=3) {
			
			fee=2.00;
			
		}
		
		else {
			
			if (hours<24) {
				
				fee=Math.ceil(hours-3)*0.5+2.00;
				
			}
			
			else {
				
			fee=10.00;
				
			}
			
		}
		
		return fee;
		
	}
	
	
	
	private static void displayparkingPrice(double parkingFee) {
		
		System.out.printf("This is your parking fee %.1f", parkingFee);
		
	}
	
	
	
	
}