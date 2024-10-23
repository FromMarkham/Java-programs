

import java.util.Scanner;
//This program converts fahrenheit to celsius or celsius to fahrenheit
public class Temperature{
	
	public static void main(String[]args) {

		
	boolean tempUnitDecision;
	
	tempUnitDecision=FahrenheitOrCelsius();
	double temp;
	
	String forc;

	
	forc="";

	
	double output;
	
    do {
		
	temp=TempInputCelsius();
		
	output=Fahrenheit(temp);
	
	forc="Celsius";
	
	result(forc,temp,output);
		
		
	}while (tempUnitDecision==true);
	
	
 	do {

 		temp=TempInputFahrenheit();
		
 		output=Celsius(temp);
 		
 		forc="Fahrenheit";
 		
 		result(forc,temp,output);
		
	}while (tempUnitDecision==false);	}
	
	

	
	
	//ask the user if they wanna go from f->c or c->f
	private static boolean FahrenheitOrCelsius(){
		
		String decision;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter C if u wanna go from fahrenheit to celsius. Enter F if u wanna go from celsius to fahrenheit");
		
		decision=input.next();
		
		if (decision.equalsIgnoreCase("C")){
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
		
		
	}


	//ask user for fahrenheit
	private static double TempInputFahrenheit(){
		
		double fahrenheitt;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the temp. in fahrenheit");
		
		fahrenheitt=input.nextDouble();
		
		return fahrenheitt;
		
		
	}
	
	//ask user for celsius
	
	private static double TempInputCelsius() {
		
		double fahrenheitt;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter da temp in celsius");
		
		fahrenheitt=input.nextDouble();
		return fahrenheitt;
	}
	

	


	//calculate c->f
	private static double Fahrenheit(double temp) {
		double celsius;
		
		celsius=(temp*1.8)+32;
		
		return celsius;
		
	
		
	}
	
	//convert f to c
	private static double Celsius(double temp) {
	
		double fahrenheit;
	
		fahrenheit=(0.5556)*(temp-32);
	
		return fahrenheit;
	
}
	//display the answer 
	private static void result(String forc, double temp, double output){
		
		if (forc=="Fahrenheit") {
			
			System.out.printf("%.1f in fahrenheit is %.1f in celsius",temp,output);
			
		}
		
		
		
		else {
			
			System.out.printf("%.1f in Celsius is %.1f in fahrenheit",temp,output);
			
		}
	
	}

}
