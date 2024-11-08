
public class Account{
	
	private double thebalance;
	
	private double balance;
	
	private double amount;
	
	public Account(double thebalance) {
		
		setthebalance(thebalance);
		
	
	}
	
	public void setthebalance(double thebalance) {
		
		if (thebalance<0.0) {
			
			balance=0.0;
			
		}
		
		else {
			balance=thebalance;
			
		}
		
	}
	
	public void returnthebalance() {
				
	System.out.printf("This is ur balance %f", balance);
	
	}
	
	public void debit(double amount) {
		
		if (amount>=balance) {
			System.out.println("u r spending too much money pls stop😭");
		}
		
		else {
			balance-=amount;
			System.out.println("u sucked money outta ur account");
		}
	}
	
	public void credit(double amount) {
		
		if (amount>0) {
			thebalance+=amount;
			System.out.println("u put money in ur account");
			
		}
		else {
			System.out.println("Invalid credit no.");
			
			
		}
		
	}
	
}
