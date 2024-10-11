import java.util.Scanner;

public class Gas{
	public static void main(String[] args) {


		int liters;
		int kilometers;
		double mileage;
		Scanner input=new Scanner(System.in);	
		
		
	
		
		System.out.println("Enter the amount of gas your car used (in liters)");
		liters=input.nextInt();	

		System.out.println("Enter the distance your car drove (in kilometers)");	
		kilometers=input.nextInt();
		
		mileage=(double) kilometers/liters;
		

		
		System.out.printf("This is the mileage %.2f\n in kilometers per liters",mileage);
		
	}
}