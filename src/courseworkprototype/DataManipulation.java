/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseworkprototype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 1-NJacobs
 */
public class DataManipulation {
    
    private static final String DB_NAME = "NJacobs_ChineseRestaurant";   // the final keyword is a constant (use uppercase)
    private static final String CONNECTION_STRING = "jdbc:mysql://computing.gfmat.org:3306/" + DB_NAME + "?user=NJacobs&useSSL=true";
    
    private static final String SQL_PASSWORD = "JLrpC62umv";
    
    public static void orderDetails(String customername, String postcode, String housenumber, String roadname, String phonenumber ) {
        // TODO code application logic here
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs",SQL_PASSWORD);
                ) {
            Statement statement=conn.createStatement();
            statement.execute("INSERT INTO customerInfo VALUES(null, '" +customername+"','"+postcode+"',"+housenumber+",'"+roadname+"',"+phonenumber+");");
            ResultSet results = statement.executeQuery("SELECT MAX(customerID) FROM customerInfo");
            statement.execute("INSERT INTO OrderTable VALUES ("+results+",null);");
}       catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
    }
   // public static void orderItems(String customername, String postcode, String housenumber, String roadname, String phonenumber ) {
        // TODO code application logic here
  //      try (Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs",SQL_PASSWORD);
   //             ) {
    //        Statement statement=conn.createStatement();
    //        statement.execute("INSERT INTO item VALUES(null, '" +customername+"','"+postcode+"',"+housenumber+",'"+roadname+"',"+phonenumber+");");
}   //    catch (SQLException ex) {
    //        System.out.println(ex);
    //    }
    //}

    
