
public class Invoicetest{
	
	public static void main(String[]args) {
		
		Invoice hammer=new Invoice("0121","Hammer",4,10.99);
		
		Invoice drill=new Invoice("0141","drill",2,30.79);
		
		Invoice screw=new Invoice("0271","screw",20,0.79);
		
		System.out.println(hammer.getpartdescription());
		
		System.out.println(hammer.getpartnumber());
		
		System.out.println(hammer.getquantity());
		
		System.out.println(hammer.getpartprice());
		
		screw.setpartdescription("Screws & Screws");
		
		screw.setpartnumber("0191");
		
		screw.setpartprice(0.50);
		
		screw.setquantity(54);
		
		System.out.println(screw.getpartdescription());
		
		System.out.println(screw.getpartnumber());
		
		System.out.println(screw.getpartprice());
		
		System.out.println(screw.getquantity());

	}

	
}
