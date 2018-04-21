/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viren
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {
    
    public static Connection connectDB(){
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","viren","viren");
        //JOptionPane.showMessageDialog(null,"Connection Successful!","Connection",JOptionPane.INFORMATION_MESSAGE);
        return conn;
        }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "Connection unsuccessful ->"+e.getMessage(), "Connection unsuccessful",JOptionPane.ERROR_MESSAGE); 
         
         return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usual Error Occured"+e.getMessage(), "Connection unsuccessful",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
   
}
