package com.package1;

import java.sql.*;
import java.sql.Connection;

public class Database {

    public static Connection getConnection(String dbUrl, String user, String password) throws SQLException {

        Connection connection = DriverManager.getConnection(dbUrl, user, password);
        connection.setAutoCommit(true);
        return connection;
    }

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        String dbUrl =  "jdbc:mariadb://localhost:3306/classicmodels";
        final String user = "root";
        final String password = "root";

        try {
            connection = Database.getConnection(dbUrl, user, password);
            System.out.println("Database connection successful");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }
}
