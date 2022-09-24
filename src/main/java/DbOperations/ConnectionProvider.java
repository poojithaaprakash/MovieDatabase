package DbOperations;

import java.sql.*;

public class ConnectionProvider {
public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/movies?useSSL=false", "root", "Universe_06");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
}

//public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con;
//            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/movies?useSSL=false", "root", "Universe_06");
//            System.out.println("Driver Loaded");
//
//        } catch (ClassNotFoundException e) {
//            System.out.println("Driver not Loaded");
//        } catch (SQLException e) {
//            System.out.println("connection not established");
//        }
//
//    }