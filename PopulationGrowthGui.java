import javax.swing.JButton; //import jbutton 
import javax.swing.JComboBox;
import javax.swing.JFrame; //import jframe 
import javax.swing.JLabel; //import jlabel 

import javax.swing.JOptionPane; //import JOPtionpane 
import javax.swing.JTextField; //import JTextField 

import java.awt.Color;  //Import color 
import java.awt.Font; //import font 

import java.awt.event.ActionEvent; //Import Actionevent 
import java.awt.event.ActionListener; //Import actionlistener 


public class PopulationGrowthGui extends JFrame implements ActionListener{
	
    JLabel numberOne=new JLabel("Enter the 1st#"); //Label prompting user to enter the 1st number 
    
    JTextField no2TextField=new JTextField(""); //Text entry field for the 1st number 
    
    JButton plusButton=new JButton("+"); //Calculator button for the addition operation 
    
    JComboBox countriesList=new JComboBox();
    
	public PopulationGrowthGui(){ 
		
	    
		setSize(550,500); //Sets the window size
		
    	setTitle("Enhanced calculator"); //Title that goes onto the window 
    	setLayout(null); //Makes the setlayout=null
    	
    	no2TextField.setBounds(75,275,100,50); //Set the location of the entry field for the 2nd number 
    	add(no2TextField); //Add the text field for the entry field of the 2nd number 
    	

        
    	countriesList.setBounds(75,275,100,50); //Set the location of the entry field for the 2nd number 
    	add(countriesList); //Add the text field for the entry field of the 2nd number   
    	
    	countriesList.addItem("Canada");
    	
    	plusButton.setBounds(150,350,100,50); //Sets the location of the addition operation button
    	plusButton.addActionListener(this); //Adds an action listener to plus button
    	add(plusButton); //Adds the plus button
    	setVisible(true); //makes the plus button visible
    	
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		
		
		}
	}