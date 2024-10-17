
import java.util.Scanner; //imports

//Date: october 17 2024 
//Name: Bob Wang, Sales2.java

//Description:  Write an application that prompts the user to enter the quantity sold for each product.
//Next, the program should determine the value of the selected product (see table below) and add the appropriate amount to the total retail value.

//Skills: Switch statements, continue statements, break statements, if statements, else statements, control structures, main methods, main classes, inputs

public class Sales2{ //main class 
	
	public static void main(String[]args){ //main method 
		
		Scanner input=new Scanner(System.in);
		
		//Variables 
		int productquantity=0;
		double productValue=0;
		double totalValue=0;
		double value=0;
		
		
		//Repeat the following for the 5 items 
		for (int i=1; i<=5; i++) {
			
			
			
			//Ask the user for how many of the item number has been sold
			System.out.printf("Enter how much of product no. %d has been sold", i);
			productquantity=input.nextInt();	
			
			//Skip the iteration if 0 instances of the item number has been sold 
			if (productquantity==0) 
				continue;
			
			//If the above isn’t true (if 1 or more instances of that item has been sold), 
			//use a switch statement to determine how much the item costs based on the item no. 
			else {
			
			switch(i) {
			
			 case 1:
				 value=2.98;
			    
			 break;
			 		
			 case 2:
				 value=4.5;
			    
			 break;
			 
			 
			 case 3:
				 value=9.98;
			 
			 break;
			 
			 case 4: 
				 value=4.49;
				 
			 break;
			 
			 case 5:
				 value=6.87;
				 
			 break;
	
			 
			} 
			    
			
			}	
			
		//Multiply the price of the product by how many items of the product have been sold.
	    //And increment that to a variable. 
		totalValue+=productquantity*value;
		
		
		//Reset the variable used to keep track of how many items of the item no. have been sold
		productquantity=0;
		
		
		}
		
		//Display the total value of all the products that’ve been sold to the screen.
		System.out.printf("This many dollars of products have been sold: %.1f",totalValue);
		
}
}