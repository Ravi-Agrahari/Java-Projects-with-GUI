
package bank_mangaement_system;

import javax.swing.* ;

public class Login extends JFrame {
    // Login constructor 
    
    Login(){
        
       // for making frame .. .
        setTitle("Bishal Bank (ATM) ") ; // Title of frame
       
        setSize(800 , 480) ;  // size of frame 
        setVisible(true) ;   // to make frame visible
        setLocation(350 , 150) ;  // starting location for frame 
    }
    
    public static void main(String[] args){
        new Login();
        
    }
}
