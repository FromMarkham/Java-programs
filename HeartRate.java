import java.util.Scanner; //import scanner 


//Date: September 16 2024
//Name: Bob Wang, HeartRate.java 

//Description: Write a program that calculates a person's target heart rate 
//(the heart rate you should aim to maintain while you're working out) given a person’s resting heart rate  (your heart rate while you are not participating in any physical activity). Round off your answer to one decimal place.

//Skills: Inputs, java syntax, variables, methods, printing to console, math, rounding


public class HeartRate{ //main class
	public static void main(String[]args) { //main method
		
		Scanner input=new Scanner(System.in);//the input object 
		
		System.out.println("Enter your resting heart rate"); //prompts user to enter their heartrate
		
		double RestingHeartRate=input.nextDouble(); //input for the heart rate of user when resting
		
		System.out.println("Enter your age"); //prompts user to enter their age 
		
		int age=input.nextInt(); //convert the users age to integer 
		
		double TargetHeartRate=0.7*(220-age)+0.3*RestingHeartRate; //calculate the target heartrate of the user based on age and resting heartrate
		
		double TargetHeartRateRounded=Math.round(TargetHeartRate); //round the calculated target heartrate 
		
		System.out.printf("This is your target heart rate for when you work out %.1f bpm",TargetHeartRateRounded); //prints the target heartrate
		
	}
}
