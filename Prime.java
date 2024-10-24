
public class Prime{ //main class
	static int ii; 
	
	
	static int primecount=0;
	
	public static void main(String[]args) { //main method 
		
		for (int i=2; i<=10000; i++) {
			if (isPrime(i)==true){
				System.out.printf("%d is a prime no.",i);
				System.out.println();
			}
			
		}
		

		
		
	}
	
	private static boolean isPrime(int ii){
		
		int limit=(int)Math.sqrt(ii);
		
		for (int y=2; y<=limit; y++) {
			
			if (ii%y==0) { 
				
				return false;
				
			}
		
		
		}
		return true;
		
	}
	
}