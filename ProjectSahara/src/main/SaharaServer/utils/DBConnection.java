package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection connection = null;

    public DBConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:D:/Project/Project-Sahara/Externals/SaharaDB.db");
        } catch (SQLException se){
            se.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void close(){
        try {
            connection.close();
        } catch (SQLException se){
            se.printStackTrace();
        }
    }
}
