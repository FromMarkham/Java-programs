
public class Invoice{

public String partnumber2;

public String partdescription2;

public int quantity2;

public double price2; 

public Invoice(String partnumber, String partdescription, int quantity, double price) {
	
	partnumber2=partnumber;
	partdescription2=partdescription;
	
	if (quantity>=0) {
		quantity2=quantity;
		
	}
	
	else {
		quantity2=0;
		
	}
	
	if (price>=0) {
		price2=price;
		
	}
	
	else {
		
		price2=0.0;
		
	}
	
	
}

public String getpartnumber() {
	
	return partnumber2;
	
}

public String getpartdescription() {
	
	return partdescription2;
}

public int getquantity() {
	
	return quantity2;
	
}

public double getpartprice() {
	
	return price2;
	
}


public void setpartprice(double price3) {
	
	price2=price3;
	
}

public void setpartnumber(String partnumber3) {
	
	partnumber2=partnumber3;
	
}

public void setpartdescription(String partdescription3) {
	
	partdescription2=partdescription3;
}

public void setquantity(int quantity3) {
	
	quantity2=quantity3;
	
}
	
}
