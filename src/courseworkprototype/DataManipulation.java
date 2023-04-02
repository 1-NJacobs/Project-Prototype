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

    public static void orderDetails(String customername, String postcode, String housenumber, String roadname, String phonenumber, Float price) {
        // Enters all the customer details and order price int the database
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            statement.execute("INSERT INTO customerInfo VALUES(null, '" + customername + "','" + postcode + "'," + housenumber + ",'" + roadname + "'," + phonenumber + ");");
            statement.execute("INSERT INTO OrderTable VALUES (null, (SELECT MAX(customerID) FROM customerInfo), " + price + ");");
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void EnterOrder(LinkedList order) {
        // Enters all the items in the order into the database
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            for (int i = 0; i < order.size(); i++) {
                statement.execute("INSERT INTO item VALUES(" + order.get(i) + ", (SELECT MAX(orderID) FROM OrderTable));");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void resetDB() {
        // Reset the database, clear all values in all tables except the menu table as that holds the item names and prices and doesn't get added to
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            statement.execute("DELETE FROM OrderTable;");
            statement.execute("DELETE FROM customerInfo;");
            statement.execute("DELETE FROM item;");
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static ArrayList<String[]> displayOrders() {
        // Retrieve all of customer details and totaal price to be displayed in the search order table
        ArrayList<String[]> toreturn = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            String sql = "SELECT customerInfo.* , OrderTable.* FROM customerInfo, OrderTable WHERE customerInfo.customerID = OrderTable.customerID";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String CustomerID = String.valueOf(rs.getInt("CustomerID"));
                String Name = String.valueOf(rs.getString("customername"));
                String Postcode = String.valueOf(rs.getString("postcode"));
                String HouseNum = String.valueOf(rs.getInt("housenumber"));
                String RoadName = String.valueOf(rs.getString("roadname"));
                String PhoneNum = String.valueOf(rs.getInt("phonenumber"));
                String orderID = String.valueOf(rs.getInt("orderID"));
                String TotalPrice = String.valueOf(rs.getFloat("totalPrice"));

                String[] tbData = {CustomerID, Name, Postcode, HouseNum, RoadName, PhoneNum, orderID, TotalPrice};
                toreturn.add(tbData);

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return toreturn;
    }

    public static ArrayList<String[]> SearchCustomerID(String search) {
        // Search the database by customerID and retrieve all details matching that customerID
        ArrayList<String[]> toreturn = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            String sql = "SELECT customerInfo.* , OrderTable.* FROM customerInfo, OrderTable WHERE customerInfo.customerID = OrderTable.customerID AND OrderTable.customerID = " + search;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String CustomerID = String.valueOf(rs.getInt("CustomerID"));
                String Name = String.valueOf(rs.getString("customername"));
                String Postcode = String.valueOf(rs.getString("postcode"));
                String HouseNum = String.valueOf(rs.getInt("housenumber"));
                String RoadName = String.valueOf(rs.getString("roadname"));
                String PhoneNum = String.valueOf(rs.getInt("phonenumber"));
                String orderID = String.valueOf(rs.getInt("orderID"));
                String TotalPrice = String.valueOf(rs.getFloat("totalPrice"));

                String[] tbData = {CustomerID, Name, Postcode, HouseNum, RoadName, PhoneNum, orderID, TotalPrice};
                toreturn.add(tbData);

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return toreturn;
    }
    
    public static ArrayList<String> SelectedOrder(String search) {
        // Retrieve the order items and price from custoemrID
        ArrayList<String> toreturn = new ArrayList<>();
        ArrayList<String> menuID = new ArrayList<>();
        String orderID = "";
        String Totalprice = "";
        
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            
            String sql = "SELECT orderID, totalPrice FROM OrderTable WHERE customerID = " + search;
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()){
                orderID = String.valueOf(rs.getInt("orderID"));
                Totalprice = String.valueOf(rs.getFloat("totalprice"));
            }
            // gets the orderID and total price
            String sql2 = "SELECT menuID FROM item WHERE orderID = " + orderID;
            rs = statement.executeQuery(sql2);
            while (rs.next()) {
                String menu = String.valueOf(rs.getInt("menuID"));
                menuID.add(menu);
            }
            // Gets the menuID of all items in the order
            for (int i = 0; i < menuID.size(); i++) {
                String sql3 = "SELECT itemName FROM menu WHERE menuID = " + menuID.get(i);
                rs = statement.executeQuery(sql3);
                if (rs.next()){
                    String itemName = rs.getString("itemName");
                    toreturn.add(itemName);
                }
            }
            // retrieves all item names of items in order
            toreturn.add("\n £"+Totalprice);
            // adds the total price to the end of the array
            }

            catch (SQLException ex) {
            System.out.println(ex);
        }
        return toreturn;
    }

    public static ArrayList<String> OrderItems(LinkedList order) {
        // Retrieve the item names of the items selected in the order
        ArrayList<String> toreturn = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            for (int i = 0; i < order.size(); i++) {
                String sql = "SELECT itemName FROM menu WHERE menuID = " + order.get(i);
                ResultSet rs = statement.executeQuery(sql);
                if (rs.next()){
                    String itemName = rs.getString("itemName");
                    toreturn.add(itemName);
                }
                
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return toreturn;
    }
    
    public static Float TotalPrice(LinkedList order) {
        // Calculates the total price of items in the order
        Float Totalprice;
        Totalprice = 0.00f;
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            
            for (int i = 0; i < order.size(); i++) {
                String sql = "SELECT price FROM menu WHERE menuID = " + order.get(i);
                ResultSet rs = statement.executeQuery(sql);
                if (rs.next()){
                    Totalprice = Totalprice + rs.getFloat("price");

                }
                
            }
         //toreturn.add(Totalprice);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return Totalprice;
    }
    
    public static void DeleteSearch(String search) {
        // removes any records that match the search
        String orderID = "";
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            String sql = "SELECT orderID FROM OrderTable WHERE customerID = " + search;
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()){
                orderID = rs.getString("orderID");
            }
            statement.execute("DELETE FROM item WHERE orderID = "+ orderID +";");
            statement.execute("DELETE FROM OrderTable WHERE customerID = " + search + ";");
            statement.execute("DELETE FROM customerInfo WHERE customerID = " + search + ";");
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

}
