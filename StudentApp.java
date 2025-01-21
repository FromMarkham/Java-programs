import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.util.Comparator;

public class StudentApp{
	
	private static Student[] studentArray=new Student[20];
	//private static Student[] studentArray=new Student[20]; //that was the only code mr fernandes had  around here

	public static void main(String[]args) {

	  
       readFile();
       showClass();
       double avgMark=averageMark(totalMark());
       aboveAverage(avgMark);
       searchStudent();
		
	}
	
	private static void readFile() {
		
		
		
		//try {
		//	Scanner inputFile=new Scanner(new File("Students.csv")); //
			
		//	inputFile.useDelimiter(",|\r\n");
			
		//	for (int counter=0; counter<studentArray.length; counter++) {
		//		String studentName=inputFile.next();
	//			int studentAge=inputFile.nextInt(); 
		//		int studentMark=inputFile.nextInt(); 
				
//				studentArray[counter]=new Student(studentName,studentAge,studentMark);

				//waitt, the error goes away if u use string instead of int
				//tell mr fernandes aboutit

	//		}
			
	//		inputFile.close();
			
//		} catch (FileNotFoundException e) {
//			
//			System.out.println("File not found");
//		}
		
		try {
			Scanner inputFile=new Scanner(new File("Students.csv"));
			inputFile.useDelimiter(",|\n");
			System.out.println(inputFile.nextLine());
			
			
			
			int index=0;
			
			while(inputFile.hasNext()){
				
				String name=inputFile.next();
				
				
				int year=inputFile.nextInt();
					
				double average = inputFile.nextDouble();
				studentArray[index]=new Student(name,year,average);
				index++;
				
			}
			inputFile.close();
		
		}catch (FileNotFoundException error) {
			System.out.println("file error"+error);
		}
		
	}

	public static void showClass() {
		Arrays.sort(studentArray,Comparator.comparing(Student::getAge));
		System.out.println("Students:");
		
		for (int index=0; index<studentArray.length; index++) {
			System.out.println(studentArray[index]);
		}
		
	}
	
	private static void searchStudent() {
		
		Scanner input=new Scanner(System.in);
		boolean found=false;
		
		System.out.println("Enter the of the student you are"+"looking for:");
		String studentName=input.next();
		
		for (int index=0; index<studentArray.length; index++) {
			if (studentArray[index].getStudentName().contains(studentName)) {
				System.out.println(studentArray[index]);
				found=true;
				break;
			}
		}
		
		if (!found) {
			System.out.println("no such student");
		}
		
	}
	
	public static double totalMark() {
		
		double totalMark = 0;
		
		for (int counter=0; counter<studentArray.length; counter++) {
			
			totalMark+=studentArray[counter].getMark();
			
		}
		
		return totalMark;
	}
	
	public static double averageMark(double totalMark) {
		double avgMark;
		avgMark=totalMark/studentArray.length;
		
		return avgMark;
	}
	
	public static void aboveAverage(double avgMark) {
		
		int aboveAvgCount=0;
		
		for (int counter=0; counter< studentArray.length; counter++) {
		if (studentArray[counter].getMark()>=avgMark) {
			aboveAvgCount+=1;
		}
			
		}
		System.out.printf("%d\n", aboveAvgCount);
		
	}
	
	//public void searchStudent() {
		
	///	Scanner input=new Scanner(System.in);
		//String inputName=input.next();
		
	//	for (int counter=0; counter<=21; counter++) {
	//	if (studentArray[counter].getStudentName()==inputName) {
	//		studentArray[counter].toString();
	//	}
		//else {
		//	studentArray[counter].toString();
	//	}
		
		
	//}
}
	

