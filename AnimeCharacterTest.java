
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AnimeCharacterTest{
	
	private static AnimeCharacter[] Animecharacterarray=new AnimeCharacter[5];
	
	
	
	public static void main(String[]args) {
		
		int kkk;
		
		FillArray();
		
		sortthearray();
		
		kkk=favourite();
		
		showfavouriteanimecharacter(kkk);
		
		
	}
	
	public static void FillArray() {
		
		Animecharacterarray[0]=new AnimeCharacter("Ichigo Kurosaki","Bleach",2001);
		
		Animecharacterarray[1]=new AnimeCharacter("Monkey D. Luffy","One Piece",1997);
		
		Animecharacterarray[2]=new AnimeCharacter("Naruto Uzumaki","Naruto",1999);
		
		Animecharacterarray[3]=new AnimeCharacter("Son Goku","Dragon Ball",1984);
				
		Animecharacterarray[4]=new AnimeCharacter("Pikachu","Pokemon",1996);
		
	
	}
	
	public static void sortthearray() {
		
		Arrays.sort(Animecharacterarray,Comparator.comparing(AnimeCharacter::getFirstAppearance));
		
		for (int ii=0; ii<Animecharacterarray.length; ii++) {
			
			System.out.printf("%d %s",ii+1, Animecharacterarray[ii]);
			
			System.out.println(" ");
			
		}
		
	}
	
	public static int favourite() {
		
		Scanner input=new Scanner(System.in);
		
		int FavNo;
		
		do{
			
		System.out.println("Which character no. is your favorite");
		
		FavNo=input.nextInt();
		
	}	while (FavNo<0||FavNo>=5);
		
		return FavNo;
		
		
	}
	
	public static void showfavouriteanimecharacter(int uu) {
		
		System.out.printf("%s is a character from the show %s and they first appeared in %d",Animecharacterarray[uu].getName(),Animecharacterarray[uu].getSeries(),Animecharacterarray[uu].getFirstAppearance());
		
	} 
	
}

