
import java.util.Scanner;

public class PrimeSieve{
	
	static boolean[] theprimes=new boolean[1000];
	
	public static void main(String[]args) {
		
		initialisearray();
		labeltheprimes();
		displaytheprimes();
		
	}
	
	private static void initialisearray() {
		
		for (int hh=0; hh<=999; hh++) {
			
			theprimes[hh]=true;
		}
		
	}
	
	private static void labeltheprimes(){
		
		for (int cc=2; cc<=500; cc++) {
		
			if (theprimes[cc]==true) {
				
				int kk=cc*2;
				
				while (kk<1000) {
					
					theprimes[kk]=false;
					kk+=cc;
					
				}
					
				
			}

		}		
		
	}
	
	private static void displaytheprimes() {
		
		int numberofprimes;
		numberofprimes=0;
		
		for (int u=0; u<=1000; u++) {
			
			if (theprimes[u]==true) {
				System.out.printf("%d",u);
				System.out.println(" ");
				
			}
			
		}
		
	}
	
}
