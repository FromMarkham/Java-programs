import java.util.Scanner; //import 

//Date: October 5 2024 
//Name: Bob Wang - Triangle.java
//Description: Write an application that reads three natural numbers entered by the user and determines and prints if they could represent the sides of a right triangle.  
// Skills: If statements, logic, variables, math, geometry, inputs, java syntax, IPO, algorithms

public class Triangle{ //main class
	public static void main(String[]args) { //main method
		
		//Input
		Scanner input=new Scanner(System.in);
		
		//Variables for each of of the side lengths 
		double Side1;
		double Side2;
		double Side3;
		
		//Ask the user for the side lengths and store them into individual variables
		System.out.println("Enter the side length for side 1"); //user input for side 1 
		Side1=input.nextDouble();
		
		System.out.println("Enter the side length for side 2");//user input for side 2
		Side2=input.nextDouble();
		
		System.out.println("Enter the side length for the Hypotenuse"); //User input for the hypotenuse
		Side3=input.nextDouble();
		
		//Use the triangle inequality theorem to check if the 3 sides could form a triangle
		if (Side1+Side2>Side3) { //If Side1+Side2>Side3
			if (Side2+Side3>Side1) { //If Side2+Side3>Side1
				if (Side1+Side3>Side2) { //If Side1+Side3>Side2
					System.out.println("These sides can form a triangle"); //tell the user that their side lengths passed the triangle inequality theorem
				}
			}
		}
		else {
			System.out.println("These sides can't form a triangle"); //tell the user that their side lengths didn't pass the triangle inequality theorem
		}		
		
		//Use the pythagorean theorem to check if the 3 sides could form a triangle
		
		if (Math.pow(Side1,2)+Math.pow(Side2,2)==Math.pow(Side3,2)){ //If side 1^2+side 2^2=hypotenuse^2, then it could form a right triangle
			System.out.println("The side lenghts could form a right triangle");
		}
		
		else { //If they don’t equal, print that it can’t form a right triangle to the console
			System.out.println("The side lengths can't form a right triangle");
		}
		
	}
}