import java.util.Scanner;
//Date: September 24 2024 
//Course: ICS3U1
//Name: Bob Wang, TipCalculator.java
//Description: Write a program that calculates how much someone has to tip a waiter. 
//Major skills: Inputs, math, imports, variables, printf, rounding, classes, printing to console

//Main class
public class TipCalculator{
	//Main method
	public static void main(String[] args){

		//Variables
		double tipRate;
		double mealPrice;
		double totalTip;
		Scanner input=new Scanner(System.in);

		//Input. Prompts user to enter a tipping rate in % and the meal price
		System.out.println("Enter the tip rate in percent");
		tipRate=input.nextDouble();

		System.out.println("Enter the meal price");
		mealPrice=input.nextDouble();

		//Processing. Calculates how much the user has to tip given the tipping rate in % and meal price 
		totalTip=(tipRate/100)*mealPrice;

		//Output
		System.out.printf("You have to tip %.1f dollars",totalTip);

}
}
