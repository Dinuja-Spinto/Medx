package com.devStack.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/medex",
                "root",
                "Dinuj@5615011");
    }

    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        /*if (dbConnection==null){
            dbConnection= new DBConnection();
        }
        return dbConnection;*/
        return dbConnection == null ? (dbConnection = new DBConnection()) : dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
