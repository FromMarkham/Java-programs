
import java.util.Scanner;

public class areaCircle2{
	
	public static void main(String[]args) {
		
		double radius=radiuss();
		
		double area=calculateArea(radius);
		
		displayArea(area);
		
		
		
	}
	
	private static double radiuss() {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter da radius lol");
		
		double radiuss=input.nextDouble();
		
		return radiuss;
		
		
		
	}
	
	private static double calculateArea(double radius) {
		
		double area=Math.PI*Math.pow(radius, 2);
		
		return area;
		
	}
	
	private static void displayArea(double area) {
		
		System.out.printf("This is the area of da circle %.1f",area);
		
		
		
	}
	
	
}