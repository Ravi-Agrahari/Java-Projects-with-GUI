package bank_management_system;

import java.awt.*; // For GUI components and layout management
import javax.swing.*; // For JFrame, JTextField, JButton, etc.
import java.util.*; // For Random number generation
import com.toedter.calendar.JDateChooser; // For date selection

// SignUpOne class represents the first page of a user signup form
public class SignUpOne extends JFrame {
    
    // Constructor for setting up the UI of SignUpOne page
    SignUpOne(){
        
        // Generate a random application form number
        Random ran = new Random(); 
        int random = ran.nextInt(1000, 9999);
       
        setLayout(null); // Use absolute positioning for custom layout

        // Display application form number
        JLabel formno = new JLabel("Application form no.: " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(160, 20, 600, 80);
        add(formno);

        // Add page title
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 600, 80);
        add(personalDetails);

        // Label and text field for user's name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 150, 100, 30);
        add(name);
        
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        nameTextField.setBounds(300, 150, 400, 30);
        add(nameTextField);

        // Label and text field for father's name
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 200, 200, 30);
        add(fname);
        
        JTextField fathernameTextField = new JTextField();
        fathernameTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        fathernameTextField.setBounds(300, 200, 400, 30);
        add(fathernameTextField);

        // Label and date picker for date of birth
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 250, 200, 30);
        add(dob);
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 250, 400, 30);
        add(dateChooser);

        // Label and radio buttons for gender selection
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 300, 200, 30);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300, 300, 60, 30);
        male.setBackground(Color.white);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(400, 300, 100, 30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup(); // Group gender options
        genderGroup.add(male);
        genderGroup.add(female);

        // Label and text field for email address
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 350, 200, 30);
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        emailTextField.setBounds(300, 350, 400, 30);
        add(emailTextField);

        // Label and radio buttons for marital status
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 400, 200, 30);
        add(marital);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300, 400, 100, 30);
        married.setBackground(Color.white);
        add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(420, 400, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);

        ButtonGroup maritalGroup = new ButtonGroup(); // Group marital status options
        maritalGroup.add(married);
        maritalGroup.add(unmarried);

        // Label and text field for address
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 450, 200, 30);
        add(address);

        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        addressTextField.setBounds(300, 450, 400, 30);
        add(addressTextField);

        // Label and text field for city
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 500, 200, 30);
        add(city);

        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        cityTextField.setBounds(300, 500, 400, 30);
        add(cityTextField);

        // Label and text field for state
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 550, 200, 30);
        add(state);

        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        stateTextField.setBounds(300, 550, 400, 30);
        add(stateTextField);

        // Label and text field for pincode
        JLabel pincode = new JLabel("PinCode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 600, 200, 30);
        add(pincode);

        JTextField pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        pinTextField.setBounds(300, 600, 400, 30);
        add(pinTextField);

        // "Next" button for submitting the form
        JButton next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 650, 100, 30);
        add(next);

        // Set frame properties
        getContentPane().setBackground(Color.white); // White background
        setSize(880, 800); // Frame size
        setLocation(350, 10); // Initial position
        setVisible(true); // Make frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
    }
    
    // Main method to run the application
    public static void main(String[] args){
        new SignUpOne();
    }
}
