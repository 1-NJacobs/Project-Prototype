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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
            statement.execute("INSERT INTO OrderTable VALUES (null, (SELECT MAX(customerID) FROM customerInfo));");
}       catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
    }
    public static void orderItems(LinkedList order) {
         //TODO code application logic here
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs",SQL_PASSWORD);) {
            Statement statement=conn.createStatement();
            for (int i=0; i < order.size() ; i++){
                statement.execute("INSERT INTO item VALUES("+order.get(i)+", (SELECT MAX(orderID) FROM OrderTable));");
        }
}       catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void resetDB(){
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs",SQL_PASSWORD);) {
            Statement statement=conn.createStatement();
            statement.execute("DELETE FROM OrderTable;");
            statement.execute("DELETE FROM customerInfo;");
            statement.execute("DELETE FROM item;");
}       catch (SQLException ex) {
            System.out.println(ex);
    }
    
}
    public static ArrayList<String[]> displaySearch (){
        ArrayList<String[]> toreturn = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs",SQL_PASSWORD);) {
            Statement statement=conn.createStatement();
            String sql = "SELECT * FROM customerInfo";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                String CustomerID = String.valueOf(rs.getInt("CustomerID"));
                String Name = String.valueOf(rs.getString("customername"));
                String Postcode = String.valueOf(rs.getString("postcode"));
                String HouseNum = String.valueOf(rs.getInt("housenumber"));
                String RoadName= String.valueOf(rs.getString("roadname"));
                String PhoneNum = String.valueOf(rs.getInt("phonenumber"));
                
                String[] tbData = {CustomerID, Name, Postcode, HouseNum, RoadName, PhoneNum};
                toreturn.add(tbData);
                
            }
            
            
} catch (SQLException ex) {
            System.out.println(ex);
    }
        return toreturn;
}
}
    


    
