import java.util.Scanner; //import scanner

import java.util.ArrayList; //import arraylist
//date: september 13 2024
//name: bob wang, negposzero.java
//description: Write an application that inputs five numbers and determines and prints the number of negative, positive and zero numbers that were input.

//skills: classes, imports, arraylist, if statements, inputs, scanner package

class NegPosZero{
	public static void main(String[]args) { //the main method
		
		System.out.println("Enter 5 integers");
		Scanner input=new Scanner(System.in); ///input 
		
		int number1,number2,number3,number4,number5;
		
		
		
		number1=input.nextInt();
		number2=input.nextInt();
		number3=input.nextInt();
		number4=input.nextInt();
		number5=input.nextInt();
		
		//declare variables 
		int positive=0;
		int negative=0;
		int zero=0;
		
		//declare the arraylist 
		ArrayList<Integer> numberlist = new ArrayList<Integer>();
		
		//adds input numbers to the arraylist 
		
		numberlist.add(number1);
		numberlist.add(number2);
		numberlist.add(number3);
		numberlist.add(number4);
		numberlist.add(number5);
		
		//if statements to check every element of the arraylist 
		
		if (numberlist.get(0)==0) {
			zero++;
		}
		
		else if (numberlist.get(0)<0) {
			negative++;
		}
		
		else {
			positive++;
		}
		
		
		if (numberlist.get(1)==0) {
			zero++;
		}
		
		else if (numberlist.get(1)<0) {
			negative++;
		}
		
		else {
			positive++;
		}
		
		if (numberlist.get(2)==0) {
			zero++;
		}
		
		else if (numberlist.get(2)<0) {
			negative++;
		}
		
		else {
			positive++;
		}
		
		if (numberlist.get(3)==0) {
			zero++;
		}
		
		else if (numberlist.get(3)<0) {
			negative++;
		}
		
		else {
			positive++;
		}
		
		if (numberlist.get(4)==0) {
			zero++;
		}
		
		else if (numberlist.get(4)<0) {
			negative++;
		}
		
		else {
			positive++;
		}

		
		System.out.printf(".\n There are this many positive numbers %d",positive); //prints out how many positive numbers
		System.out.printf(".\n There are this many negative numbers %d",negative); //prints out how many negative numbers 
		System.out.printf(".\n There are this many zeroes %d",zero); //prints out how many zeroes 
	}
}
