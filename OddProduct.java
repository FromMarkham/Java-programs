
public class OddProduct{
	public static void main(String[]args) {
		
		int oddproduct;
		oddproduct=1;
		
		for (int i = 1; i < 17; i=i+2) {
			  oddproduct=oddproduct*i;
			  System.out.println(oddproduct);
			}
	}
}