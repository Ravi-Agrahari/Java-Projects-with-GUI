package bank_management_system;

import javax.swing.*; // Importing Swing library for GUI components like JFrame, JLabel, JButton
import java.awt.*; // Importing AWT library for colors, fonts, and images
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    // Frame dimensions and color constants
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 450;
    private static final Color PRIMARY_COLOR = new Color(45, 45, 45); // Dark button background color
    private static final Color BUTTON_TEXT_COLOR = Color.WHITE; // Button text color
    private static final Font LABEL_FONT = new Font("Raleway", Font.BOLD, 24); // Font for label text
    private static final Font BUTTON_FONT = new Font("Arial", Font.BOLD, 16); // Font for button text

    // Declaring buttons and text fields for easy access in other methods
    private JButton loginButton, clearButton, signupButton;
    private JTextField cardTextField;
    private JPasswordField pinTextField;

    // Constructor to initialize the Login window
    public Login() {
        setupFrame();      // Set up window properties (size, layout, etc.)
        addComponents();   // Add labels, buttons, and input fields to the window
    }

    // Sets up frame properties like title, size, background color, and closing behavior
    private void setupFrame() {
        setTitle("Bishal Bank (ATM)");  // Title shown in the window title bar
        setLayout(null);  // Disables layout manager; manual positioning of elements
        setSize(FRAME_WIDTH, FRAME_HEIGHT); // Frame dimensions
        setLocationRelativeTo(null);  // Centers frame on screen
        getContentPane().setBackground(new Color(240, 240, 240)); // Background color for contrast
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the app on frame close
        setVisible(true); // Makes frame visible when initialized
    }

    // Adds all main components (logo, labels, text fields, buttons) to the frame
    private void addComponents() {
        addBankLogo();    // Adds the bank logo image at the top
        addWelcomeText(); // Adds a welcome text label under the logo
        addCardInput();   // Adds label and text field for card number entry
        addPinInput();    // Adds label and password field for PIN entry
        addButtons();     // Adds login, clear, and signup buttons
    }

    // Loads and adds the bank logo image to the frame at a fixed position
    private void addBankLogo() {
        ImageIcon originalLogo = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); // Loads logo image
        Image scaledLogo = originalLogo.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH); // Resizes image
        JLabel logoLabel = new JLabel(new ImageIcon(scaledLogo)); // Creates JLabel to hold image
        logoLabel.setBounds((FRAME_WIDTH - 80) / 2, 10, 80, 80); // Horizontally centers logo
        add(logoLabel); // Adds logo label to the frame
    }

    // Adds a centered welcome label to greet the user
    private void addWelcomeText() {
        JLabel welcomeLabel = new JLabel("Welcome to Bishal ATM"); // Welcome text label
        welcomeLabel.setFont(new Font("Osward", Font.BOLD, 26)); // Font style and size
        welcomeLabel.setBounds((FRAME_WIDTH - 400) / 2, 100, 400, 40); // Positioning to center horizontally
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center-align text within label
        add(welcomeLabel); // Adds welcome text to frame
    }

    // Adds label and text field for card number entry
    private void addCardInput() {
        JLabel cardLabel = new JLabel("Card No.:"); // Label for card number
        cardLabel.setFont(LABEL_FONT); // Font style and size for label
        cardLabel.setBounds(80, 160, 150, 30); // Positioning label
        add(cardLabel); // Adding label to the frame

        cardTextField = new JTextField(); // Text field for card number input
        cardTextField.setBounds(230, 160, 230, 30); // Positioning text field
        cardTextField.setFont(new Font("Arial", Font.PLAIN, 18)); // Text field font style
        cardTextField.setToolTipText("Enter your Card Number"); // Tooltip for additional guidance
        add(cardTextField); // Adding text field to frame
    }

    // Adds label and password field for PIN entry
    private void addPinInput() {
        JLabel pinLabel = new JLabel("Pin:"); // Label for PIN input
        pinLabel.setFont(LABEL_FONT); // Font style and size
        pinLabel.setBounds(80, 210, 150, 30); // Positioning label
        add(pinLabel); // Adds label to frame

        pinTextField = new JPasswordField(); // Password field for secure PIN entry
        pinTextField.setBounds(230, 210, 230, 30); // Positioning password field
        pinTextField.setToolTipText("Enter your PIN"); // Tooltip for PIN field
        add(pinTextField); // Adds password field to frame
    }

    // Adds the login, clear, and signup buttons with appropriate styling
    private void addButtons() {
        // Login button
        loginButton = createButton("Sign in", (FRAME_WIDTH - 220) / 2, 270, 100, 30);
        // Clear button
        clearButton = createButton("Clear", (FRAME_WIDTH - 220) / 2 + 110, 270, 100, 30);
        // Signup button
        signupButton = createButton("Sign Up", (FRAME_WIDTH - 230) / 2, 320, 230, 30);

        // Adding all buttons to the frame
        add(loginButton);
        add(clearButton);
        add(signupButton);
    }

    // Helper method to create a button with given text, size, color, and action listener
    private JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text); // Creates button with specified label text
        button.setBounds(x, y, width, height); // Sets button size and location
        button.setBackground(PRIMARY_COLOR); // Background color for button
        button.setForeground(BUTTON_TEXT_COLOR); // Text color
        button.setFont(BUTTON_FONT); // Font style and size for button text
        button.setFocusPainted(false); // Hides focus outline for a cleaner look
        button.addActionListener(this); // Registers action listener for button click events
        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Changes cursor to hand icon on hover
        return button; // Returns the created button
    }

    // Handles button click events to provide functionality for each button
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton) { // Handles login button click
            System.out.println("Login button is clicked");
        } else if (ae.getSource() == signupButton) { // Handles signup button click
            System.out.println("Signup button is clicked");
            setVisible(false); // Hides the current window
            new SignUpOne().setVisible(true); // Opens SignUpOne frame
        } else if (ae.getSource() == clearButton) { // Handles clear button click
            System.out.println("Clear button is clicked");
            cardTextField.setText(""); // Clears card number field
            pinTextField.setText(""); // Clears PIN field
        }
    }

    // Main method to run the application and display the login window
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new); // Ensures GUI creation on the event-dispatch thread
    }
}
