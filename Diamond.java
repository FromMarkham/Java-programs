

public class Diamond{
	
	public static void main(String[]args) {
		
		int c=0;
		
		for (int a=0; a<=12; a+=2) {
			
			int i=6-c;
			c++;
			
			if (a<=6) {
				for (int b=0; b<=i; b++) {
					
					System.out.printf(" ");
					
				}
				
				for (int b=0; b<=a; b++) {
					
					System.out.printf("*");
					
				}
				
				System.out.println();
				
			}

			else {
				
				for (int b=0; b<=c-1; b++) {
					
					System.out.printf(" ");
					
				}
				
				for (int b=0; b<=12-a; b++) {
					
					System.out.printf("*");
					
				}
				
				System.out.println();
				
				
			}
			
		}
		//
		
	
	} 
}