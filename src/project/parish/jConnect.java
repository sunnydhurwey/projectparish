/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.parish;

/**
 *
 * @author sunny
 */
import java.sql.*;
import javax.swing.*;
public class jConnect {
    
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:cpp.sdb");
            //JOptionPane.showMessageDialog(null, "Connected to Project Parish database.");
            return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e,"ConnectDB() Exception",JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }
}
