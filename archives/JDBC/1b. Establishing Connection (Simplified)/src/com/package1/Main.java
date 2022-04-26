package com.package1;

import java.sql.*;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels", "root", "root");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from student");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstname"));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}