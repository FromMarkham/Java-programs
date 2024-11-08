
public class Employee{
	
	public String firstname2;
	
	public String lastname2;
	
	public double monthlysalary2;
	
	public Employee(String firstname, String lastname, double monthlysalary){
		
		firstname2=firstname;
		
		lastname2=lastname;
		
		if (monthlysalary>0) {
			
			monthlysalary2=monthlysalary;
		}
		else {
			monthlysalary2=0.0;
		}
		
	}
	
	public String getfirstname() {
		
		return firstname2;
		
	}
	
	public String getlastname() {
		
		return lastname2;
	}
	
	public double getmonthlysalary() {
		
		return monthlysalary2;
	}
	
	public void setfirstname(String firstname3) {
		firstname2=firstname3;
		
		
	}
	
	public void setlastname(String lastname3) {
		lastname2=lastname3;
		
	}
	
	public void setmonthlysalary(double monthlysalary3) {
		
		if (monthlysalary3>0) {
			
			monthlysalary2=monthlysalary3;
			
		}
		
		else {
			monthlysalary2=0.0;
		}
		
		
	}
	
}