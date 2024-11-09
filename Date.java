
public class Date {
	
	public int year;
	
	
	
	public int date;
	
	
	public int month;

	
	
	
	public Date(int year2,int date2,int month2) {
		
		checkyear(year2);
		checkdate(date2);
		checkmonth(month2);
	}
	
	public int checkyear(int year2) {
		
		if (year2<=0) {
			
			year=2024;
		}
		else {
			year=year2;
		}
		
		return year;
	}
	
	public int checkmonth(int month2) {
		if (month2<1) {
			
			month=1;
			
		}

		
		else if (month2>=13) {
			
			month=12;
		}
		
		else {
			
			month=month2;
		}
		return month;
	}
	
	public int checkdate(int date2) {
		if (month==4 || month==6 || month==9 || month==11) {
			
			if (date2>30) {
				
				date=1;
			}
			
		}
		
		else if (month==2){
			
			if (date2>28) {
				date=1;
			}
		}
		
		else if (date2<=0) {
			date=1;
		}
		
		else {
			
			date=date2;
		}
		return date2;
	}


	
	public void getdate() {
		
		System.out.printf("MMDDYYYY %d %d %d",month,date,year);
		
		System.out.println(" ");
	}
	
}
