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
        // TODO code application logic here
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            statement.execute("INSERT INTO customerInfo VALUES(null, '" + customername + "','" + postcode + "'," + housenumber + ",'" + roadname + "'," + phonenumber + ");");
            statement.execute("INSERT INTO OrderTable VALUES (null, (SELECT MAX(customerID) FROM customerInfo), " + price + ");");
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public static void EnterOrder(LinkedList order) {
        //TODO code application logic here
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
        ArrayList<String> toreturn = new ArrayList<>();
        ArrayList<String> menuID = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(CONNECTION_STRING, "NJacobs", SQL_PASSWORD);) {
            Statement statement = conn.createStatement();
            
            String sql = "SELECT orderID, totalPrice FROM OrderTable WHERE customerID = " + search;
            ResultSet rs = statement.executeQuery(sql);
            String orderID = String.valueOf(rs.getInt("orderID"));
            String Totalprice = String.valueOf(rs.getFloat("totalprice"));
            
            String sql2 = "SELECT menuID FROM item WHERE orderID = " + orderID;
            ResultSet rs2 = statement.executeQuery(sql2);
            while (rs2.next()) {
                String menu = String.valueOf(rs2.getFloat("menuID"));
                menuID.add(menu);
            }
            
            for (int i = 0; i < menuID.size(); i++) {
                String sql3 = "SELECT itemName FROM menu WHERE menuID = " + menuID.get(i);
                ResultSet rs3 = statement.executeQuery(sql3);
                if (rs3.next()){
                    String itemName = rs.getString("itemName");
                    toreturn.add(itemName);
                }
            }
            toreturn.add(Totalprice);
            
            }

            catch (SQLException ex) {
            System.out.println(ex);
        }
        return toreturn;
    }

    public static ArrayList<String> OrderItems(LinkedList order) {
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

}
