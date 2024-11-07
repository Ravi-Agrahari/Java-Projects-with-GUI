
/*
 Steps involve in jdbc connectivity 
------------------------------------

1. Register the driver
2. Create a connection 
3. Create a statement
4. execute a statement 
5. Close the connection 

*/

package bank_management_system;

import java.sql.* ; 

public class Conn {
    
    Connection c ;
    Statement s ;
    
    public Conn(){
        try{
//            Class.forName(com.mysql.cj.jdbc.Driver); // register the driver // in latest java , this is automatically done by compiler
            
            // create a connection 
            
            String url = "jdbc:mysql://localhost:3308/bank_management_system" ;
            String username = "root" ; 
            String password = "root" ; 
            c = DriverManager.getConnection(url , username , password) ; 
            
            // create a statement 
            s = c.createStatement() ; 
            
        }
        catch(Exception e){
            System.out.println(e);
         }
    }
}
