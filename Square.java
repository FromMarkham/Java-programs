import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter how big u want ur square to be");
		int size;
		size = input.nextInt();

		int counter1;
		int counter2;
		int counter3;
		int counter4;
		counter1 = 0;
		counter2 = 0;
		counter3 = 0;
		counter4 = 0;

//https://classroom.google.com/u/1/c/NzA1NDAxNDQ2NjAx/m/NzA1NDAxNDQ2NzI3/details		

		while (counter2 <= size - 1) {
			counter2++;
			System.out.printf("* ");

		}

		System.out.printf("\n");
		while (counter4 <= size - 3) {
			counter4++;

			System.out.printf("* ");

			while (counter1 <= size - 3) {

				counter1++;
				System.out.printf("  ");


			}
			counter1=0;
			System.out.printf("*\n");
		}

		while (counter3 <= size - 1) {
			System.out.printf("* ");
			counter3++;

		}

	} //ok so the general algorithm is: print 5 asterisks
	//Jump to a new line
	///Print 1 asterisk on the new line
	//print size-2 spaces after the new line with 1 asterisk on the left 
	//print 1 asterisk, now on the very right of the space, then skip to the new line and repeat 
}