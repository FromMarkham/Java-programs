

public class PythagoreanTriples{
	
	public static void main(String[]args) {
		
		int count=0;
		
		for (int sideA=0; sideA<=500; sideA++) {
			
		
			
			for (int sideB=sideA+1; sideB<=500; sideB++) {
				
				
				
				for (int hypotenuse=sideB+1; hypotenuse<=500; hypotenuse++) {
					
					
					if (Math.pow(sideA, 2)+Math.pow(sideB, 2)==Math.pow(hypotenuse, 2)) {
						
						
					System.out.printf("This is side A: %d,This is side B: %d, This is the hypotenuse: %d",sideA,sideB,hypotenuse);
						
						System.out.println();
						System.out.println();
						
					}
				
					
				}
				
			}
			count++;
		}
		System.out.printf("This is how many pythagorean triples there are %d",count);
	}
	
}