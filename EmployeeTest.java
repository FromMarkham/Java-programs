
public class EmployeeTest{
	
	
	public static void main(String[]args) {
		
		Employee elonmusk=new Employee("Elon","Musk",80000000);
		
		Employee jeffbezos=new Employee("Jeff","Bezos",90000000);
		
		System.out.println(elonmusk.getmonthlysalary());
		
		System.out.println(elonmusk.getfirstname());
		
		System.out.println(elonmusk.getlastname());
		
		elonmusk.setmonthlysalary(-5);
		
		System.out.println(elonmusk.getmonthlysalary());
		
		elonmusk.setfirstname("Elongated");
		
		elonmusk.setlastname("Muskrat");

		System.out.println(elonmusk.getfirstname());
		
		System.out.println(elonmusk.getlastname());
		
	}
	

}
