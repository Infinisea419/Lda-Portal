package org.o7planning.tutorial.javajasperreport.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class MySQLConnUtils {
 
    public static Connection getMySQLConnection()
            throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String dbName = "lda";
        String userName = "root";
        String password = "root";
        return getMySQLConnection(hostName, dbName, userName, password);
    }
 
    public static Connection getMySQLConnection(String hostName, String dbName,
            String userName, String password) throws SQLException,
            ClassNotFoundException {
 
        // Declare the class Driver for MySQL DB
        Class.forName("com.mysql.jdbc.Driver");
 
        // Database Connection
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        
        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        String query = "select * from lda1";
        return conn;
    }
}
