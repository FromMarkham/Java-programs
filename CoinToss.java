
import java.util.Scanner;
import java.lang.Math;

public class CoinToss{
	static int headscount;
	static int tailscount;
	
	public static void main(String[]args) {
		
		boolean tossornot;
		boolean trueorfalse;

		int headscount2;
		
		int tailscount2;
		
		tossornot=true;
		
		do {
		
		
		tossornot=coinflipornot();
		
		trueorfalse=flipthecoin();
		
		headscount2=countheads(trueorfalse);
		tailscount2=counttails(trueorfalse);
		
		headsortails(headscount2,tailscount2);
		
		}while(tossornot);
		
		
		
	}
	
	private static boolean coinflipornot() {
		
		String yesorno;
		Scanner input=new Scanner(System.in);
		
		yesorno=input.next();
		
		if (yesorno.equalsIgnoreCase("Toss")) {
			return true;
		}
		else {
			
			return false;
		}
	}
		
	private static boolean flipthecoin() {
		
		double randomno;
		
		int randomno2;
		
		randomno=Math.random();
		
		randomno2=(int) Math.ceil(randomno);
		
		if (randomno2==0) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
	}
	
	private static int counttails(boolean trueorfalse) {
		
		
		if (trueorfalse==false) {
			
			tailscount++;
		}
		
		return tailscount;
		
	}

	private static int countheads(boolean trueorfalse) {
		
		
		
		if (trueorfalse==true) {
			
			
			
			headscount++;
			
		}
		
		return headscount;
	
		
	}
	
	private static void headsortails(int headscount2,int tailscount2) {
		
			
		
			System.out.printf("%d heads, %d tails",headscount2,tailscount2);
		
			
		
	}
	
	
}