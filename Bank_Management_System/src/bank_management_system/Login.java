package bank_management_system;

import javax.swing.*; // for GUI components like JFrame, JLabel, JButton
import java.awt.*; // for colors, fonts, image handling, etc.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    // Constants for frame size and colors
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 450;
    private static final Color PRIMARY_COLOR = new Color(45, 45, 45); // Dark color for buttons
    private static final Color BUTTON_TEXT_COLOR = Color.WHITE; // Text color on buttons
    private static final Font LABEL_FONT = new Font("Raleway", Font.BOLD, 24); // Font for labels
    private static final Font BUTTON_FONT = new Font("Arial", Font.BOLD, 16); // Font for buttons

    // Buttons and text fields are defined here so they can be used in other methods
    private JButton loginButton, clearButton, signupButton;
    private JTextField cardTextField;
    private JPasswordField pinTextField;

    // Constructor to initialize the Login frame
    public Login() {
        setupFrame();      // Sets up the main window/frame
        addComponents();   // Adds the various components like buttons, labels, etc.
    }

    // Sets up the main frame's properties
    private void setupFrame() {
        setTitle("Bishal Bank (ATM)");  // Title shown on top of the frame
        setLayout(null);  // No layout manager; we'll set positions manually
        setSize(FRAME_WIDTH, FRAME_HEIGHT); // Frame size
        setLocationRelativeTo(null);  // Centers the frame on the screen
        getContentPane().setBackground(new Color(240, 240, 240)); // Light background color for contrast
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the app when the frame is closed
        setVisible(true); // Makes the frame visible
    }

    // Adds all components (buttons, labels, text fields) to the frame
    private void addComponents() {
        addBankLogo(); // Adds bank logo at the top
        addWelcomeText(); // Adds welcome text under the logo
        addCardInput(); // Adds "Card No." label and text field for card number input
        addPinInput(); // Adds "Pin" label and password field for PIN input
        addButtons(); // Adds login, clear, and signup buttons
    }

    // Adds the bank logo image to the frame
    private void addBankLogo() {
        // Loads an icon image from the specified path
        ImageIcon originalLogo = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        // Scales the logo image to fit the frame dimensions
        Image scaledLogo = originalLogo.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(scaledLogo)); // Creates a JLabel to display the logo
        logoLabel.setBounds((FRAME_WIDTH - 80) / 2, 10, 80, 80); // Centers the logo horizontally
        add(logoLabel); // Adds the logo to the frame
    }

    // Adds the welcome text label
    private void addWelcomeText() {
        JLabel welcomeLabel = new JLabel("Welcome to Bishal ATM"); // Creates a welcome text label
        welcomeLabel.setFont(new Font("Osward", Font.BOLD, 26)); // Sets font and size for the text
        welcomeLabel.setBounds((FRAME_WIDTH - 400) / 2, 100, 400, 40); // Centers the text horizontally
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER); // Centers the text within its label
        add(welcomeLabel); // Adds the welcome label to the frame
    }

    // Adds label and text field for card number input
    private void addCardInput() {
        JLabel cardLabel = new JLabel("Card No.:"); // Creates label for card number
        cardLabel.setFont(LABEL_FONT); // Sets font style and size
        cardLabel.setBounds(80, 160, 150, 30); // Positions the label
        add(cardLabel); // Adds label to the frame

        cardTextField = new JTextField(); // Creates a text field for card number input
        cardTextField.setBounds(230, 160, 230, 30); // Positions the text field next to the label
        cardTextField.setFont(new Font("Arial", Font.PLAIN, 18)); // Sets font style and size for text input
        cardTextField.setToolTipText("Enter your Card Number"); // Tooltip shown when hovering over the field
        add(cardTextField); // Adds text field to the frame
    }

    // Adds label and password field for PIN input
    private void addPinInput() {
        JLabel pinLabel = new JLabel("Pin:"); // Creates label for PIN
        pinLabel.setFont(LABEL_FONT); // Sets font style and size
        pinLabel.setBounds(80, 210, 150, 30); // Positions the label
        add(pinLabel); // Adds label to the frame

        pinTextField = new JPasswordField(); // Creates a password field for PIN input
        pinTextField.setBounds(230, 210, 230, 30); // Positions the password field next to the label
        pinTextField.setToolTipText("Enter your PIN"); // Tooltip for PIN field
        add(pinTextField); // Adds password field to the frame
    }

    // Adds and customizes the buttons for login, clear, and sign up actions
    private void addButtons() {
        // Creates and positions login, clear, and sign-up buttons
        loginButton = createButton("Sign in", (FRAME_WIDTH - 220) / 2, 270, 100, 30);
        clearButton = createButton("Clear", (FRAME_WIDTH - 220) / 2 + 110, 270, 100, 30);
        signupButton = createButton("Sign Up", (FRAME_WIDTH - 230) / 2, 320, 230, 30);

        // Adds the buttons to the frame
        add(loginButton);
        add(clearButton);
        add(signupButton);
    }

    // Helper method to create a button with specific properties
    private JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text); // Creates a button with specified text
        button.setBounds(x, y, width, height); // Sets button size and position
        button.setBackground(PRIMARY_COLOR); // Sets button background color
        button.setForeground(BUTTON_TEXT_COLOR); // Sets text color
        button.setFont(BUTTON_FONT); // Sets font style and size for button text
        button.setFocusPainted(false); // Removes focus border for cleaner look
        button.addActionListener(this); // Adds an action listener for button clicks
        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Changes cursor to hand icon when hovering
        return button; // Returns the created button
    }

    // Handles button click events
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton) { // If login button is clicked
            System.out.println("Login button is clicked");
        } else if (ae.getSource() == signupButton) { // If signup button is clicked
            System.out.println("Signup button is clicked");
        } else if (ae.getSource() == clearButton) { // If clear button is clicked
            System.out.println("Clear button is clicked");
            cardTextField.setText(""); // Clears card number field
            pinTextField.setText(""); // Clears PIN field
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new); // Launches the login frame using SwingUtilities
    }
}
