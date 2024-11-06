
import java.util.Scanner;

public class SalesTable{
	
	static Scanner input=new Scanner(System.in);
	
	static double[][] tableofsales=new double[5][6];
	
	public static void main(String[]args) {
		
		askuserfornumbers();
		
		crosstotalcalculate();
		
		displayresults();
		
	}
	
	private static void askuserfornumbers() {
		
		String yesorno;
		
		do {

			System.out.println("Enter da product no.");
			int productno=input.nextInt();
			
			System.out.println("Enter da salesperson no.");
			int salespersonno=input.nextInt();
			
			System.out.printf("Enter da value of product %d sold by the salesperson no. %d",productno,salespersonno);
			tableofsales[salespersonno-1][productno-1]=input.nextDouble();
			
			System.out.println("enter Y if u wanna continue");
			yesorno=input.next();
			
			
			
		}while(yesorno.equalsIgnoreCase("Y"));
		displayresults();

		
	}
	
	private static void crosstotalcalculate() {
		
		for (int uu=0; uu<=4; uu++ ) { //sum for the bottom rows 
			
			for (int yy=0; yy<=5; ) { //outta bounds
				
				tableofsales[yy][5]+=tableofsales[uu][yy]; 
				
			}
			
			
			
		}
		
		for (int jj=0; jj<=5; jj++ ) { //sum for the leftmost columns 
			
			for (int yyy=0; yyy<=4; yyy++) {
				
				tableofsales[5][yyy]+=tableofsales[jj][yyy];
			}
			
			
		}
		
	}
	
	private static void displayresults() {
		int ii=0;
		int kk=0;
		
		for (;ii<=4; ii++) {
			
			System.out.println(tableofsales[ii][5]);
			
		}
		
		for (;kk<=5; kk++) {
			
			System.out.println(tableofsales[4][kk]);
			
			
		}
	
	}
	
}
