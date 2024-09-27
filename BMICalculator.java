//Name: Bob wang, frame.java
//Description: Create a BMI Calculator application that reads the user’s weight and height (either Metric or Imperial system) and then calculates and displays the user’s BMI.
//date: September 22,2024
//Skills: imports, GUI, variables, classes, objects, Java syntax 

import javax.swing.JButton; //import jbutton 
import javax.swing.JFrame; //import jframe 
import javax.swing.JLabel; //import jlabel 
import javax.swing.JOptionPane; //import JOPtionpane 
import javax.swing.JTextField; //import JTextField 

import java.awt.Color;  //Import color 

import java.awt.event.ActionEvent; //Import Actionevent 
import java.awt.event.ActionListener; //Import actionlistener 


public class frame extends JFrame implements ActionListener {

    JLabel heightLabel=new JLabel("Height"); //Height label 
    JLabel weightLabel=new JLabel("Weight"); //Weight label 
    JLabel metersLabel=new JLabel("Meters"); //Meters label 
    JLabel kgLabel=new JLabel("Kilograms"); //Kilograms label 
    
    JTextField kgTextField=new JTextField("Kilograms"); //Kilograms text field 
    JTextField metersTextField=new JTextField("Meters"); //Meters text 

    JButton calculateButton=new JButton("Calculate"); //Creates a calculate button 
    
    public frame() { //Frame constructor class 
    	setSize(550,500); //Default window size 
    	
    	setTitle("Bmi Calculator(adult)"); //Title that goes onto the window 
    	setLayout(null);
    	
    	//These comments are for my future reference 
    	//getContentPane().setBackground(Color.RED);
    	//Color thecolor=new Color(10,10,10);
    	//getContentPane().setBackground(thecolor);
    	//Font labelfont=new font("Arial",Font.BOLD,24);
    	//heightlabel.setFont(labelfont)
    	
    	heightLabel.setBounds(50,50,100,50); //Set the location of the height label 
    	add(heightLabel); //Adds a heightlabel 
    	
    	weightLabel.setBounds(50,200,100,50); //Set the location of the weight label 
    	add(weightLabel); //Add a weight label 
    	
    	metersLabel.setBounds(75,75,100,50); //Set the location of the meters label 
    	add(metersLabel); //adds a meters label 
    	
    	kgLabel.setBounds(75,225,100,50); //Set the location of the kilograms label 
    	add(kgLabel); //Adds the kilograms label 
    	
    	kgTextField.setBounds(75,275,100,50); //Set the location of the kilogram entry field 
    	add(kgTextField); //Adds a kilograms text field 
    	
    	metersTextField.setBounds(75,125,100,50); //Set the location of the meters text field 
    	add(metersTextField); //Add a meters text field 
    	
    	calculateButton.setBounds(200,350,100,50); //Sets the location of the calculate BMI button 
    	calculateButton.addActionListener(this); //Adds an action listener to help the program know when its clicked
    	add(calculateButton); //Adds the calculate button
    	setVisible(true);

    }
    
    //this method run every time an action occur on the frame 

	@Override
	public void actionPerformed(ActionEvent event) { //Method that performs the BMI calculation and displays it
		//formula source: centers for disease control 
		
		if (event.getSource()==calculateButton) { 
			double bmi; //BMI variable 
			
			double weight=Double.valueOf(kgTextField.getText()); //Weight variable 
			
			double height=Double.valueOf(metersTextField.getText()); //Height variable 
			
			
			bmi=weight/Math.pow(height,2); //Calculates the BMI using the metric BMI formula
			
			JOptionPane.showMessageDialog(this,bmi); //Displays a popup telling the user what the BMI value is 
			
			
			//JOptionPane.showMessageDialog(this,String.format("%.1f",bmi));
			
			//string category;
			//if (bmi<18.5){
			//category="underweight"}
			//if (bmi>18.5 && bmi<25{
			// category="healthy"}
			//else:
			//{category="obese"}
			
			
		}
	}
}
