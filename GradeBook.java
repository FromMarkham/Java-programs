
import java.util.Scanner;

public class GradeBook{
	
	private String coursename;
	private String courseteachername;
	private String teachername;
	
	public GradeBook(String coursename,String teachername){
		this.coursename=coursename;
		courseteachername=teachername;
		
	}
	
	public void setthecoursename(String name) {
		
		coursename=name;
		
	}
	
	public void settheteachername(String name) {
		
		courseteachername=name;
		
	}
	
	
	public String findcoursename() {
		
		return coursename; 
		
	}
	
	public String findteachername() {
		
		return courseteachername;
		
	}
	
	public void displayinfo() {
		
		System.out.printf("This is the course: %s", findcoursename());
		
		System.out.println(" ");
		
		System.out.printf("This is the teacher: %s", findteachername());
		
		System.out.println(" ");
		
	}
	

}

