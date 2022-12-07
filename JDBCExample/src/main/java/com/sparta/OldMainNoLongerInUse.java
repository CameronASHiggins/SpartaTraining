package com.sparta;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class OldMainNoLongerInUse {
    public static void main(String[] args) {
        //drivers job is to facilitate the connection
        //connections can have statements run within them once the driver is live
        Properties props = new Properties();
        try {
            props.load(new FileReader("dbconnect.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection(props.getProperty("url"),props.getProperty("user") ,props.getProperty("pass"))){
            // Standard type of statement
            //Flexible with the queries we can execute via this statement
            Statement statement = conn.createStatement();

//            statement.executeUpdate("INSERT INTO actor (first_name,last_name) VALUES ('Ali', 'Zahir')");
//            statement.executeUpdate("DELETE FROM actor WHERE last_name = 'Zahir'");
//            ResultSet rs = statement.executeQuery("SELECT * FROM actor WHERE last_name = 'Zahir'");


            //prepared statement
            // avoids possibility of SQL injection attacks
            // - more efficient
            // - can easily reuse the same format

            PreparedStatement preparedStatement = conn.prepareStatement(
                    "INSERT INTO actor(first_name, last_name) VALUES (?,?)");

            PreparedStatement preparedStatement2 = conn.prepareStatement(
                    "SELECT * FROM actor WHERE first_name = ? AND last_name = ?");

            preparedStatement.setString(1,"NICOLAS");
            preparedStatement.setString(2,"CAGE");
            preparedStatement.executeUpdate(); //For statements that do not return data, like INSERT AND DELETE, then we execute update not Query
            preparedStatement2.setString(1,"NICOLAS");
            preparedStatement2.setString(2,"CAGE");
            ResultSet rs = preparedStatement2.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString(2) + " " + rs.getString("last_name")); // You can use column index (starts from 1) or column Label
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}