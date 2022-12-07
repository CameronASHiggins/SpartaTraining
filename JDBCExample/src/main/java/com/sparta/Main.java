package com.sparta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        //drivers job is to facilitate the connection
        //connections can have statements run within them once the driver is live
        Properties props = new Properties();
        try {
            props.load(new FileReader("dbconnect.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Connection conn = DriverManager.getConnection(props.getProperty("url"),props.getProperty("user") ,props.getProperty("pass"))){
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM actor");
            while(rs.next()){
                System.out.println(rs.getString(2) + " " + rs.getString("last_name")); // You can use column index (starts from 1) or column Label
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}