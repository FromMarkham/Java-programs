import java.util.Scanner;

public class Diamond{
	
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		//System.out.println("Enter a no.");
		//int numberOfStars=input.nextInt();
		
		//do{
			
			
		//System.out.println("Enter a no.");
		//numberOfStars=input.nextInt();
			
		//}while(numberOfStars<1 || numberOfStars<19 || numberOfStars%2==1);
		
		int c=0;
		
		int y=1;
		
		for (int a=0; a<=12; a+=2) {
			
			int i=3-c;
			c+=1;
			
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
				
			    
				
				
				for (int b=0; b<=y; b++) {
					
					System.out.printf(" ");
					
				}
				
				for (int b=0; b<=12-a; b++) {
					
					System.out.printf("*");
					
				}
				
				y=y+1;
				System.out.println();
		
	} 
	
}
	}
}
