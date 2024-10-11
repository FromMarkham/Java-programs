//name: bob wang
//Date: September 6 2024 
//Course: ICS3U1 (gr 11 computer science)
//Description:program which calculates the area of the circle from the user inputted radius 
//Skills: i can import libraries, use math operations and get the program to accept inputs 


//import java.util.Scanner; //import from Java utility package 

//public class areaCircle{ //Area of a circle class for the operations 
 //   public static void main(String[]args){ //main method 
    //    System.out.println("Enter the radius of the circle");
    //    double radius; //define radius variable 
    //    double area; //define area variable 

    //    Scanner input= new Scanner(System.in); //input object 

    //    radius=input.nextDouble(); //accept radius as input 

   //     area=Math.PI*Math.pow(radius,2); //Raise the input radius to the 2nd power and multiply it by pi 

  //      System.out.printf("The area of the circle with radius of %.2d is %.2d",radius,area); 
        //display the area of the circle with its corresponding radius to the screen 

//    }
//}

import java.util.Scanner;

public class areaCircle{
	public static void main(String[] args) {
		System.out.println("Enter the radius of the circle");
		Scanner input=new Scanner(System.in);
		int liters;
		int kilometers;
		int mileage;
		
		liters=input.nextInt();		
		System.out.println("Enter the amount of gas your car used (in liters)");
		
		kilometers=input.nextInt();
		System.out.println("Enter the distance your car drove (in kilometers)");	
		
		mileage=kilometers/liters;
		
		System.out.printf("This is the mileage",mileage);
		
	}
}