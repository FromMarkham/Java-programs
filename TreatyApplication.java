
import java.util.Arrays;

import java.util.Comparator;

import java.util.Scanner;

public class TreatyApplication{
	
	private static Treaty[] Treatyarray=new Treaty[7];
	
	static Scanner input =new Scanner(System.in);
	
	public static void main(String[]args) {
		
		int kkk;
		
		fillArray();
		
		displayTitle();
		
		displayArray();
		
		kkk=getYear();
		
		displayNumTreatyGroups(kkk);
		
	}
	
	public static void fillArray() {
		
		Treatyarray[0]=new Treaty("Robinson Treaties",2,1850,1850);
				
		Treatyarray[1]=new Treaty("Maritime Peace and Friendship Treaties",8,1725,1779);
		
		Treatyarray[2]=new Treaty("Numbered Treaties",11,1871,1921);
				
		Treatyarray[3]=new Treaty("Douglas Treaties",14,1850,1854);
		
		Treatyarray[4]=new Treaty("Peace & Neutrality Treaties",3,1701,1760);
				
		Treatyarray[5]=new Treaty("Upper Canada Land Surrenders",30,1781,1862);
		
		Treatyarray[6]=new Treaty("Williams Treaties",2,1923,1923);
						
		
	}
	
	
	public static void displayTitle() {
		
		System.out.println("HISTORIC TREATIES IN CANADA");	
		
		System.out.println("===========================");
		
	}
	
	public static void displayArray() {
		
		Arrays.sort(Treatyarray,Comparator.comparing(Treaty::getNumber));
		
		for (int ii=0; ii<Treatyarray.length; ii++) {
			
			System.out.println(Treatyarray[ii]); 
			
		}
		
	}
	
	public static int getYear() {
		
		int year;
		
		System.out.println("enter a year lmao bruh");
		
		year=input.nextInt();
		
		return year;
	
	}
	
	public static void displayNumTreatyGroups(int theinputyear) {
		
		int thenumtreatygroups;
		
		thenumtreatygroups=0;
		
		for (int i=0; i<=6; i++) {
			
			if (Treatyarray[i].getEndYear()==theinputyear) {
				thenumtreatygroups++;
				
			}
			
			if (Treatyarray[i].getStartYear()==theinputyear) {
				thenumtreatygroups++;
				
			}
		}
		
		if (thenumtreatygroups==0) {
			System.out.printf("No treaty groups were signed in %d",theinputyear);
			
		}
		else {
			
			System.out.println(" ");
			
			System.out.printf("In %d , %d treaty groups were signed",theinputyear,thenumtreatygroups);		
			
		}

		
	}
	
}
