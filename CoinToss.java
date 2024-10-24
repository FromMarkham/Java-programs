//Date: october 23 2024 
//Description: program that simulates a coin toss
//Skills: modules, methods, imports, inputs,  java syntax,  math.random
//Name: bob Wang, CoinToss.java

import java.util.Scanner;

public class CoinToss {
	static int headscount;
	static int tailscount;

	public static void main(String[] args) {

		boolean tossornot;
		boolean trueorfalse;

		int headscount2;

		int tailscount2;

		tossornot = true;

		do {

			tossornot = coinflipornot();
			

			trueorfalse = flipthecoin();

			// pass in whether theree was a heads or not into the head counter
			headscount2 = countheads(trueorfalse);

			// pass in whether there was a tails or not into the tails counter
			tailscount2 = counttails(trueorfalse);

			// keep count of the heads and tails
			headsortails(headscount2, tailscount2);

			// keep doing all of the above whilst the user says yes
		} while (tossornot);

	}

	private static boolean coinflipornot() {

		String yesorno;
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.printf("Do you wanna flip the coin? If yes, type Toss");
		yesorno = input.next();
		

		if (yesorno.equalsIgnoreCase("Toss")) {
			return true;
		} else {

			return false;
		}
	}

	private static boolean flipthecoin() {

		double randomno;

		int randomno2;

		randomno = Math.random();

		randomno2 = (int) Math.round(randomno);

		if (randomno2 == 0) {

			return true;
		}

		else {

			return false;
		}

	}

	private static int counttails(boolean trueorfalse) {

		if (trueorfalse == false) {

			tailscount++;
		}

		return tailscount;

	}

	private static int countheads(boolean trueorfalse) {

		if (trueorfalse == true) {

			headscount++;

		}

		return headscount;

	}

	private static void headsortails(int headscount2, int tailscount2) {

		System.out.printf("%d heads, %d tails", headscount2, tailscount2);

	}

}