

public class Triangles2{
	
	public static void main(String[]args) {
		
		int qqq=10;
		
		for (int e=0; e<=10; e++) {
			
			System.out.println("");
			qqq=qqq-1;

			for (int a=0; a<=e; a++) { //stars 
				
				System.out.printf("*");
				
			}
			
			
			for (int b=0; b<=qqq; b++) { //spaces
				
				System.out.printf(" ");
				
			}
			
			for (int c=0; c<=qqq; c++) { //stars 
				
				System.out.printf("*");
				
			}
			
			for (int d=0; d<=e*2; d++) { //spaces
				
				System.out.printf(" ");
				
			}
			
			for (int f=0; f<=qqq; f++) { //stars
				
				System.out.printf("*");
				
			}
			
			for (int g=0; g<=qqq; g++ ) { //spaces
				
				System.out.printf(" ");
				
			}
			
			for (int h=0; h<=e; h++) { //stars
				
				System.out.printf("*");
				
			}
			
		}
		

		
	}
	
}








//
//* 		********************         *
//** 		*********  *********        **
//*** 2	***3****    ****5***   6   ***
//**** 	*******      *******      ****
//***** 	******        ******     *****
//**1*** 	*****          *****    ******
//******* 	****      4     ****   ***7***
//******** 	***              ***  ********
//********* **                ** *********
//***********                  ***********
//
