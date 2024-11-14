import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LibraryApplication{
	
	private static Book[] Bookarray=new Book[5];
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[]args) {
		
		int option;
		
		fillLibrary();
		
		option=showMenu();
		
		if (option==1) {
			showLibrary();
		}
		
		else if (option==2) {
			showBook();
		}
		
		else if (option==3) {
			showLibraryByTitle();
		}
		
		else if (option==4) {
			showLibraryByCost();
		}
		
		else if (option==5) {
			clearConsole();
		}
		
	} 
	
	public static void fillLibrary() {
		
		Bookarray[0]=new Book("Crow Winter","Karen McBride",336,2019,9780221076756L,22.99);
				
		Bookarray[1]=new Book("All the Quiet Places","Brian Thomas Isaac",288,2021,9781990071027L,22.00);
				
		Bookarray[2]=new Book("The Break","Katherena Vermette",360,2016,9781525264641L,23.99);
				
		Bookarray[3]=new Book("Fire Keepers Daughter","Angeline Boulley",496,2021,9781250866035L,24.20);
				
		Bookarray[4]=new Book("There There","Tommy Orange",304,2018,9780525436140L,21.00);
		
	}
	
	public static int showMenu() {
		
		int option2;
		
		System.out.println("1 show the library");
		
		System.out.println("2 Show book");
		
		System.out.println("3 Show library by Title");
		
		System.out.println("4 Show library by Cost");
		
		System.out.println("5 Exit");
		
		System.out.println("Which option do u choose");
		
		option2=input.nextInt();
		return option2;
	}
	
	public static void showLibrary() {
		
		for (int counter=0; counter<Bookarray.length; counter++) {
			
			System.out.println(Bookarray[counter]);
		}
		
	}
	
	public static void showBook() {
		
		String word;
		
		System.out.println("Enter a book keyword lmao bruh");
		word=input.next();
		
		for (int u=0; u<Bookarray.length; u++) {
			
			if (Bookarray[u].getTitle().contains(word)) {
				System.out.println(Bookarray[u]);
				
			}

		}
		
	}
	
	public static void showLibraryByTitle() {
		
		Arrays.sort(Bookarray,Comparator.comparing(Book::getTitle));
		
		for (int counter=0; counter<Bookarray.length; counter++) {
			
			System.out.println(Bookarray[counter]);
		}
		
	}
	
	public static void showLibraryByCost() {
		
		Arrays.sort(Bookarray,Comparator.comparing(Book::getCost));
		
		for (int counter=0; counter<Bookarray.length; counter++) {
			
			System.out.println(Bookarray[counter]);
		}
		
	}

	private static void clearConsole() {
		//
		for(int row = 1; row <= 50; row++)
			System.out.println();

	}

	
}
