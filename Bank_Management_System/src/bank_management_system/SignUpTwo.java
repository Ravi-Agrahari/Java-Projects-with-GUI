package bank_management_system;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class SignUpTwo extends JFrame implements ActionListener{
     // Global variables
     
    JTextField  panNumberTextField  , adharNumberTextField ;
    JComboBox chooseReligion , chooseCategory , chooseIncome , chooseeduQual , chooseOccupation ; 
    JButton next ;
    JRadioButton accYes , accNo , seniorYes , seniorNo;
    
    
    // Constructor for setting up the UI of SignUpOne page
    SignUpTwo(){
        
      
       
        setLayout(null); // Use absolute positioning for custom layout
        
        setTitle("New Account Application Form - Page 2") ; 
        

        

        // Add page title
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 600, 80);
        add(additionalDetails);

        // Label and text field for user's name
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 150, 100, 30);
        add(religion);
        
        String []valReligion = {"Hindu", "Muslim" , "Sikh" , "Buddhist", "others"} ;
        chooseReligion = new JComboBox(valReligion); 
        chooseReligion.setBounds(300, 150, 100, 30);
        add(chooseReligion) ; 

        
        // Label and text field for father's name
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 200, 200, 30);
        add(category);
        
        String []valCategory = {"General", "OBC" , "st" , "others"} ;
        chooseCategory = new JComboBox(valCategory); 
        chooseCategory.setBounds(300, 200, 100, 30);
        add(chooseCategory)  ; 
        
        
        // Label and date picker for date of birth
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 250, 200, 30);
        add(income);
        
        String []valIncome = {"NULL", "<1,50,000" , "<5,00,000" , ">5,00,000"} ;
        chooseIncome = new JComboBox(valIncome); 
        chooseIncome.setBounds(300, 250, 100, 30);
        add(chooseIncome)  ; 

        // Label and radio buttons for gender selection
        JLabel eduQual = new JLabel("Educational Qualification:");
        eduQual.setFont(new Font("Raleway", Font.BOLD, 20));
        eduQual.setBounds(100, 300, 300, 30);
        add(eduQual);

        String []valeduQual = {"non-graduate", "Graduate" , "Doctored" , "others"} ;
        chooseeduQual = new JComboBox(valeduQual); 
        chooseeduQual.setBounds(400, 300, 100, 30);
        add(chooseeduQual)  ; 
        

        // Label and text field for email address
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 350, 200, 30);
        add(occupation);
        
        String []valOccupation = {"Salaried", "self-employed" , "Bussiness" ,"Student" , "others"} ;
        
        chooseOccupation = new JComboBox(valOccupation); 
        chooseOccupation.setBounds(300, 350, 100, 30);
        add(chooseOccupation)  ; 

        

        // Label and radio buttons for marital status
        JLabel panNumber = new JLabel("Pan Number:");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        panNumber.setBounds(100, 400, 200, 30);
        add(panNumber);

        panNumberTextField = new JTextField();
        panNumberTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        panNumberTextField.setBounds(300, 400, 400, 30);
        add(panNumberTextField);

        

        // Label and text field for address
        JLabel adharNumber = new JLabel("Adhar Number:");
        adharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        adharNumber.setBounds(100, 450, 200, 30);
        add(adharNumber);

        adharNumberTextField = new JTextField();
        adharNumberTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        adharNumberTextField.setBounds(300, 450, 400, 30);
        add(adharNumberTextField);

        // Label and text field for city
        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 500, 200, 30);
        add(seniorCitizen);

        seniorYes = new JRadioButton("Yes");
        seniorYes.setBounds(300, 500, 100, 30);
        seniorYes.setBackground(Color.white);
        add(seniorYes);

        seniorNo = new JRadioButton("No");
        seniorNo.setBounds(420, 500, 100, 30);
        seniorNo.setBackground(Color.white);
        add(seniorNo);
        
        ButtonGroup seniorCitizenbtns = new ButtonGroup(); // Group marital status options
        seniorCitizenbtns.add(seniorYes);
        seniorCitizenbtns.add(seniorNo);
        
        // Label and text field for state
        JLabel existingAcc = new JLabel("Existing Account:");
        existingAcc.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAcc.setBounds(100, 550, 200, 30);
        add(existingAcc);

        accYes = new JRadioButton("Yes");
        accYes.setBounds(300, 550, 100, 30);
        accYes.setBackground(Color.white);
        add(accYes);

        accNo = new JRadioButton("No");
        accNo.setBounds(420, 550, 100, 30);
        accNo.setBackground(Color.white);
        add(accNo);
        
        ButtonGroup existingAccbtns = new ButtonGroup(); // Group marital status options
        existingAccbtns.add(accYes);
        existingAccbtns.add(accNo);

        // "Next" button for submitting the form
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 650, 100, 30);
        next.addActionListener(this);
        add(next);

        // Set frame properties
        getContentPane().setBackground(Color.white); // White background
        setSize(880, 800); // Frame size
        setLocation(350, 10); // Initial position
        setVisible(true); // Make frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){ // here there is only next button , so need to use if-else and check which button is pressed 
        
        
        
       
    }
    
    // Main method to run the application
    public static void main(String[] args){
        new SignUpTwo();
    }
}
