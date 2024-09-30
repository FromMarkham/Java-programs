import javax.swing.JButton; //import jbutton 
import javax.swing.JFrame; //import jframe 
import javax.swing.JLabel; //import jlabel 
import javax.swing.JOptionPane; //import JOPtionpane 
import javax.swing.JTextField; //import JTextField 

import java.awt.Color;  //Import color 
import java.awt.Font; //import font 
import java.awt.event.ActionEvent; //Import Actionevent 
import java.awt.event.ActionListener; //Import actionlistener 

//Date: September 28,2024
//Name: Bob Wang, BasicCalculatorGUI.java 
//Description: the GUI class for the calculator I am making. 
//Skills: imports, GUI, variables, classes, objects, Java syntax, math 


public class BasicCalculatorGUI extends JFrame implements ActionListener{
    JLabel numberTwo=new JLabel("Enter the 2nd#"); //Label prompting user to enter the 2nd number
    JLabel numberOne=new JLabel("Enter the 1st#"); //Label prompting user to enter the 1st number 
    JLabel Answer=new JLabel("Answer:"); //Redundant answer label 

    JTextField no1TextField=new JTextField(""); //Text entry field for the 1st number 
    JTextField no2TextField=new JTextField(""); //Text entry field for the 1st number 



    JButton plusButton=new JButton("+"); //Calculator button for the addition operation 
    JButton minusButton=new JButton("-"); //Calculator button for the subtraction operation 
    
    JButton multiplyButton=new JButton("x"); //Calculator button for the multiplication operation 
    JButton divideButton=new JButton("/"); //Calculator button for division operation
    JButton powerButton=new JButton("x^y"); //Calculator button for exponentiation operation
    
    JButton RootButton=new JButton("n√"); //Calculator button to calculate the nth root of a number
    JButton sinButton=new JButton("sin"); //Calculator button to calculate the sine of a number (in degrees)
    JButton cosButton=new JButton("cos"); //Calculator button to calculate the cosine of a number (in degrees)
    
    
	public BasicCalculatorGUI(){ //Calculator constructor method 
		setSize(550,500); //Sets the window size
    	setTitle("Enhanced calculator"); //Title that goes onto the window 
    	setLayout(null); //Makes the setlayout=null
    	
    	getContentPane().setBackground(Color.RED); //Makes the background red 
    	Font labelfont=new Font("Arial",Font.PLAIN,15); //Plain arial font size 15 
    	numberOne.setFont(labelfont); //Makes the label prompting the user to enter the 1st number of be of the font labelfont
    	numberTwo.setFont(labelfont); //Makes the label prompting the user to enter the 2nd number of be of the font labelfont
    	
    	no2TextField.setBounds(75,275,100,50); //Set the location of the entry field for the 2nd number 
    	add(no2TextField); //Add the text field for the entry field of the 2nd number 
    	
    	no1TextField.setBounds(75,125,100,50); //Set the location of the entry field for the 1st number 
    	add(no1TextField); //Add the entry field for the 1st number
    	
    	numberTwo.setBounds(50,200,100,50); //Set the location of  the label prompting the user to enter the 2nd number
    	add(numberTwo); //Adds the label prompting the user to enter the 2nd number
    	
    	numberOne.setBounds(50,50,100,50); //Set the location of the label prompting the user to enter the 1st number
    	add(numberOne); //Add the label prompting the user to enter the 1st number

    	Answer.setBounds(250,250,100,50); //Set the location of the redundant answer label
    	add(Answer); //Add a redundant answer label 
    	
    	
    	plusButton.setBounds(150,350,100,50); //Sets the location of the addition operation button
    	plusButton.addActionListener(this); //Adds an action listener to plus button
    	add(plusButton); //Adds the plus button
    	setVisible(true); //makes the plus button visible
    	
    	minusButton.setBounds(250,350,100,50); //Sets the location of the minus operation button
    	minusButton.addActionListener(this); //Adds an action listener to the minus operation button
    	add(minusButton); //Adds the minus operation button
    	setVisible(true);
    	
    	multiplyButton.setBounds(350,350,100,50); //Sets the location of the calculate BMI button 
    	multiplyButton.addActionListener(this); //Adds an action listener to help the program know when its clicked
    	add(multiplyButton); //Adds the calculate button
    	setVisible(true); //makes the minus button visible
    	
    	divideButton.setBounds(450,350,100,50); //Sets the location of the division button 
    	divideButton.addActionListener(this); //Adds an action listener to the division button
    	add(divideButton); //Adds the division button
    	setVisible(true); //makes the division button visible 

    	powerButton.setBounds(450,400,100,50); //Sets the location of the exponentiation button 
    	powerButton.addActionListener(this); //Adds an action listener to exponentiation button
    	add(powerButton); //Adds the exponentiation button
    	setVisible(true); //Makes the exponentiation button visible
    	
    	RootButton.setBounds(350,400,100,50); //Sets the location of the nth root button
    	RootButton.addActionListener(this); //Adds an action listener to the nth root button
    	add(RootButton); //adds the nth root button
    	setVisible(true);
    	
    	sinButton.setBounds(250,400,100,50); //Sets the location the sine button
    	sinButton.addActionListener(this); //Adds an action listener to sine button
    	add(sinButton); //Adds thesine button
    	setVisible(true); //makes the sine button visible 
    	
    	cosButton.setBounds(150,400,100,50); //Sets the location of the Cosine button 
    	cosButton.addActionListener(this); //Adds an action listener cosine button
    	add(cosButton); //Adds the cosine button
    	setVisible(true); //makes the cosine button visible 
    	
    	
    	
		
	}
	@Override
	public void actionPerformed(ActionEvent event) { //Actionperformed method 
		if (event.getSource()==plusButton) { //check if the plus button has been clicked
			
			double sum; //variable to store the sum
			double numberOne; //variable to store the first no.
			double numberTwo; //variable to store the second no.
			
			numberOne=Double.valueOf(no1TextField.getText()); //make the variable equal to the no. from the first entry field 
			numberTwo=Double.valueOf(no2TextField.getText()); //make the variable equal to the no. second entry field 
			sum=numberOne+numberTwo; //add the numbers from the entry fields 
			
			JOptionPane.showMessageDialog(this,sum); //display the answer in the form of a popup window 
			
		}
		
		if (event.getSource()==minusButton) { //check if the plus button has been clicked
			
			double difference; //variable to store the difference between 2 numbers
			double numberOne; //variable to store the 2nd no.
			double numberTwo; //variable to store the 1st no.
			
			numberOne=Double.valueOf(no1TextField.getText()); //make the variable equal to the no. from the first entry field 
			numberTwo=Double.valueOf(no2TextField.getText()); //make the variable equal to the no. from the 2nd entry field 
			
			difference=numberOne-numberTwo;
			JOptionPane.showMessageDialog(this,difference);
		}
		
		if (event.getSource()==multiplyButton) { //check if the multiply button has been clicked
			
			
			double product; //variable to store the product of 2 numbers
			double numberOne; //variable to store the 1st no.
			double numberTwo; //variable to store the 2nd no.
			
			
			numberOne=Double.valueOf(no1TextField.getText()); //make the variable equal to the no. from the first entry field 
			numberTwo=Double.valueOf(no2TextField.getText()); //make the variable equal to the no. from the 2nd entry field 
			product=numberOne*numberTwo; //make the variable equal to the product of the 2 no.
			
			
			JOptionPane.showMessageDialog(this,product);	//display the answer in the form of a popup window 
			
			
		}
		
		if (event.getSource()==divideButton) { //check if the division button has been clicked
			
			
			double quotient; //variable to store the quotient of 2 numbers
			double numberOne; //variable to store the 1st no.
			double numberTwo; //variable to store the 2nd no.
			
			
			numberOne=Double.valueOf(no1TextField.getText());  //make the variable equal to the no. from the first entry field 
			numberTwo=Double.valueOf(no2TextField.getText()); //make the variable equal to the no. from the 2nd entry field 
			
			
			quotient=numberOne/numberTwo; //make the variable equal to the quotient of the 2 no.
			JOptionPane.showMessageDialog(this,quotient);	//display the answer in the form of a popup window 
			
			
		}
		if (event.getSource()==powerButton) { //check if the exponentiation button has been clicked
			
			double exponent;  //variable to store the value of the base rasied to the exponent 
			double base; //variable to store the base 
			double power;   //variable to store the power
			
			base=Double.valueOf(no1TextField.getText()); //make the variable equal to the no. from the 1st entry field 
			power=Double.valueOf(no2TextField.getText()); //make the variable equal to the no. from the 2nd entry field 
			exponent=Math.pow(base, power);
			JOptionPane.showMessageDialog(this,exponent); //display the answer in the form of a popup window 
			
		}
		
		if (event.getSource()==RootButton) { //check if the nth root button has been clicked
			
			double exponent; //variable to store the degree of the root
			double base; //variable to store the base
			double power; 
			double root;
			
			base=Double.valueOf(no1TextField.getText()); //make the variable equal to the no. from the 1st entry field 
			power=Double.valueOf(no2TextField.getText()); //make the variable equal to the no. from the 2nd entry field 
			root=Math.pow(power, -1);
			exponent=Math.pow(base, root);
			
			JOptionPane.showMessageDialog(this,exponent); //display the answer in the form of a popup window 
			
		}
		
		if (event.getSource()==sinButton) { //check if the sine button has been clicked
			
			double input; //input variable (degrees)
			double answer; //answer variable for the sine operation
			double radians; //Variable to store the value of the input which is in degrees in radians

			input=Double.valueOf(no1TextField.getText()); //make the variable equal to the no. from the 1st entry field only
			radians=Math.toRadians(input); //convert the input in degrees to radians
			answer=Math.sin(radians); //do the sine on the input that went from degrees to radians 

			JOptionPane.showMessageDialog(this,answer); //display the answer in the form of a popup window 
		}
		
		if (event.getSource()==cosButton) { //check if the cosine button has been clicked
			
			double input; //input variable (degrees)
			double answer; //answer variable for the cosine operation
			double radians; //Variable to store the value of the input which is in degrees in radians
			
			input=Double.valueOf(no1TextField.getText()); //make the variable equal to the no. from the 1st entry field only
			radians=Math.toRadians(input);//convert the input in degrees to radians
			answer=Math.cos(radians); //do the cosine on the input that went from degrees to radians 

			JOptionPane.showMessageDialog(this,answer);	 //display the answer in the form of a popup window 
		} 
}}
