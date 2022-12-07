package com.sparta;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection connection = null;
    public static Connection getConnection(){
        if (connection == null){
            Properties props = new Properties();
            try {
                props.load(new FileReader("dbconnect.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                connection = DriverManager.getConnection(props.getProperty("url"),props.getProperty("user") ,props.getProperty("pass"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private ConnectionFactory(){};

}
