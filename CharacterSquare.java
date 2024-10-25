

import java.util.Scanner;

public class CharacterSquare{
	
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[]args) {
		int noofcharacters;
		String whatcharacter;
		
		
		noofcharacters=howmanycharacters();
		whatcharacter=whatcharacter();
		
		SquareOfCharacters(noofcharacters,whatcharacter);
		
	}
	
	private static int howmanycharacters(){
		
		int noofcharacters;
		
		System.out.println("how many character do u want");
		noofcharacters=input.nextInt();
		
		return noofcharacters;
	}

	private static String whatcharacter(){
		
		String thecharacter;
		
		System.out.println("what character do u want");
		thecharacter=input.next();
		
		return thecharacter;
		
	}
	
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