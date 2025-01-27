
package bank.management.project;
import java.sql.*;

public class Conn 
{
    Connection c;
    Statement s;
    Conn()
    {
        try{
            String url="jdbc:mysql://localhost:3306/bankmanagementsystem";
            String username ="root";
            String password ="Avijit1999@";
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");
            c = DriverManager.getConnection(url,username,password);
            s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
                
    }        
}

