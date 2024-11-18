import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//Name: Bob Wang, ShoeApplication.java
//Date: November 18 2024 
//Description: Template class for shoes 

//Main class 
public class ShoeApplication{
	
	//The shoe array. 
	private static Shoe[] ShoeArray =new Shoe[5];
	
	//Input 
	private static Scanner input=new Scanner(System.in);
	
	//The main method. 
	public static void main(String[]args) {
		
		//Variable for storing the shoe size the user entered
		double TheShoeSize;
		
		//Calls a method which fills the array 
		fillShoes();
		
		//Calls a method which displays the name of the program 
		showTitle();
		
		//Calls a method that displays all the shoes sorted by cost 
		showShoesByCost();
		
		//Calls a method that asks the user for their shoe size and puts it into a variable called TheShoeSize 
		//And keeps calling the method if the user's shoe size is smaller then or equal to 0 
		do {TheShoeSize=getYourSize();
		
		if (TheShoeSize<=0) {
			System.out.println("You entered an invalid shoe size");
		}
		
		}while(TheShoeSize<=0);
		
		//Calls a method that displays the no. of shoes that are within 0.5 of the user's shoe size 
		showShoesThatFit(TheShoeSize);
	}
	
	//The method which fills the array with shoes. 
	public static void fillShoes() {
		
		ShoeArray[0]=new Shoe("Nike","Air Max 90",13,155);
				
		ShoeArray[1]=new Shoe("Addidas","Yeezy Boost 350 V2",10,440);
				
		ShoeArray[2]=new Shoe("Jordan","6 UNC",11.5,400);
				
		ShoeArray[3]=new Shoe("Jordan","1 Retro High Travis Scott",8,1338);
				
		ShoeArray[4]=new Shoe("Jordan","Air Force 1",12,140);
		
	}
	
	//The method which displays the name of the program 
	public static void showTitle() {
		System.out.println("Shoes in the Closet");
		System.out.println("===================");
		
	}
	
	//The method which displays all the shoes sorted by cost 
	public static void showShoesByCost() {
		
		Arrays.sort(ShoeArray,Comparator.comparing(Shoe::getCost));
		
		for (int counter=0; counter<ShoeArray.length; counter++) {
			
			System.out.println(ShoeArray[counter]);
			
		}
		
	}
	
	//The method which asks the user for their shoe size 
	public static double getYourSize() {
		
		double ShoeSize;
		
		System.out.println("Enter your shoe size");
		
		ShoeSize=input.nextDouble();
		
		return ShoeSize;
	}
	
	//The method which displays the number of shoes that are within half a size of the shoe size the user entered. 
	public static void showShoesThatFit(double TheShoeSize) {
		
		int fittingShoeCount = 0;
		
		for (int counter=0; counter<ShoeArray.length; counter++) {
			
			if (ShoeArray[counter].getSize()>=TheShoeSize-0.5 && ShoeArray[counter].getSize()<=TheShoeSize+0.5) {
				
				fittingShoeCount++;
			}

		}		
		
		System.out.printf("%d shoes are within half a size of %.1f ",fittingShoeCount,TheShoeSize);
		
	}
}
