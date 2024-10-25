
import java.util.Scanner;

public class RightTriangle{
	
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[]args) {
		double dimension1;
		
		double dimension2;
		
		double hypotenuselength;
		
		dimension1=side1();
		dimension2=side2();
		
		hypotenuselength=hypotenuse(dimension1,dimension2);
		
		System.out.printf("This is the length of the hypotenuse %.1f", hypotenuselength);
		
	}
	
	private static double side1(){
		double length1;
		
		System.out.println("Enter da length for side 1");
		length1=input.nextDouble();
		
		return length1;
	}
	
	private static double side2(){
		double length2;
		
		System.out.println("Enter da length for side 2");
		length2=input.nextDouble();
		
		return length2;
	}




	
	private static double hypotenuse(double dimension1, double dimension2){
		double hypotlength;
		
		hypotlength=Math.pow(dimension1, 2)+Math.pow(dimension2, 2);
		
		hypotlength=Math.pow(hypotlength, 0.5);
		
		return hypotlength;
		
	}
	

}
