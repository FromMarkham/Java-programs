import java.util.Scanner;

public class e{
	public static void main(String[]args) {
		
		double E;
		double number;
		int factorial;
		int counter1;
		int counter2;
		int counter3;
		
		counter1=0;
		E=1;
		counter2=1;
		factorial=1;
		number=1;
		counter3=1;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter how many digits you want");
		number=input.nextInt();
		

		
		while(counter1<=number) {
			counter1++;
			counter2=1;
			factorial=1; 
			while (counter2<=counter1) {
				
				factorial=factorial*counter2; ////ohhhhhhh u must reset the factorial variable so that the multiplcation doesnt go endlessly
				
				counter2++;
				
				
			
				//if (fact)
				//ok so the overall algorithm is correct but there are just some things that a bit off lol 

			}
			E+=Math.pow(factorial, -1);
			System.out.println(E);
		
		
		}
		
		//System.out.printf("this is the value of %.1f",E);	
}		
}
		

		
	
