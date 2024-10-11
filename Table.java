//date: october 4 2024 
//name: bob wang, Table.java
//Description: Write a Java application that uses looping to print the following table of values. 
//Skills: while loops, imports, inputs, printing to console, increments, integers, java syntax 

import java.util.Scanner; //import scanner

public class Table{ //main class
	public static void main(String[] args) { //main method
		int rows=0; //number of rows variable 
		int currentRow=0; //current row number variable 
		
		Scanner input=new Scanner(System.in); //the input 
		
		System.out.println("Enter how many rows u want");
		
		rows=input.nextInt(); 
		
		System.out.println("N,    Nx10,    Nx100,    Nx1000"); //Label the columns that will house the row number
		//as well as the row number multiplied by 10,100 and 1000
		
		
		//Using a while loop whose limit is set to the number of rows the user wants
		while (currentRow<=rows) {
			
			
			
			System.out.printf("%d \t %d \t %d \t %d \n",currentRow,currentRow*10,currentRow*100,currentRow*1000); //
			////print these 4 things: Current row number ,Current row number multiplied by 10,Current row number multiplied by 100,Current row number multiplied by 1000

			currentRow++; //increment the row number 
			
		}
		
		
	}
}