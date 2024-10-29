
import java.util.Scanner;

import java.util.Random;

public class DiceTable{

	static Random randop=new Random();
	
	static int[] dicetallyarray=new int[13];
	
	static Scanner input=new Scanner(System.in);
	
	static int numberofrolls;

	
	public static void main(String[]args) {
		
		numberofrolls=howmanyrolls();
		rolldice(numberofrolls);
		displaytable();
		
	}
	
	private static int howmanyrolls() {
		
		System.out.println("How many dice rolls do u want");
		
		
		return input.nextInt();
		
	}
	
	private static void rolldice(int numberofrolls) {
		int dice1;
		int dice2;
		
		int thesum;
		
		for (int i=0; i<=numberofrolls; i++) {
	
			
			
			thesum=(randop.nextInt(5)+1)+(randop.nextInt(5)+1);
			
			++dicetallyarray[thesum];
			
		}
		
		
		
	}
	

	
	private static void displaytable() {
		
		System.out.println("Sum            Occurences");
		
		for (int c=1; c<dicetallyarray.length; c++) {
			
			System.out.printf("%d                         %d",c,dicetallyarray[c]);
			System.out.println(" ");
			
		}
		
	}
	
	
	
}

