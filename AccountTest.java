
public class AccountTest{
	
	public static void main(String[]args) {
		
		Account youraccount =new Account(121.0);
		
		youraccount.credit(90);
		
		Account youraccount1 =new Account(121.0);
		
		youraccount1.debit(100);
		
		youraccount1.returnthebalance();
		
		
		
	}

}
