

public class Perfect{
	
	
	
	static int sumOfFactors=0;
	
	public static void main(String[]args) {
		

		
		perfect();
		

		
	}
	
	
	
	private static void perfect(){
		
		for (int i=1; i<=1000; i++) {
		sumOfFactors=0;
		//
		for (int k=1; k<=i; k++) {
			
			if (i%k==0) {
				
			sumOfFactors+=k;
			}
			
			if (sumOfFactors==i) {
					
				System.out.printf("%d is a perfect no.",i);
				System.out.println();
					
					
			}
				
			//System.out.println(k);
			
			}
			
		}
		//
	}
	
}
	

