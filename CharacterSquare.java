

import java.util.Scanner;

public class CharacterSquare{
	
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[]args) {
		int noofcharacters;
		String whatcharacter;
		
		//ask user how big they want them square to be
		noofcharacters=howmanycharacters();
		
		//ask user what character they want 
		whatcharacter=whatcharacter();
		
		
		//make the square
		SquareOfCharacters(noofcharacters,whatcharacter);
		
	}
	
	//method to ask the user for how many characters they want in them square 
	private static int howmanycharacters(){
		
		int noofcharacters;
		
		System.out.println("how many character do u want");
		noofcharacters=input.nextInt();
		
		return noofcharacters;
	}

	//method to ask user what character they want 
	private static String whatcharacter(){
		
		String thecharacter;
		
		System.out.println("what character do u want");
		thecharacter=input.next();
		
		return thecharacter;
		
	}
	
	//method to make the square 
	private static void SquareOfCharacters(int noofcharacters, String whatcharacter){
		
		for (int i=0; i<=noofcharacters; i++) {
			
			for (int h=0; h<=noofcharacters; h++) {
				System.out.printf(whatcharacter);
				System.out.printf(" ");
				
			}
			System.out.println(" ");
			
		}
		

		
	}
	
}