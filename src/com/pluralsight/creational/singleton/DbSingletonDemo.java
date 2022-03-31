package com.pluralsight.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class DbSingletonDemo {

    public static void main(String[] args) {
        com.pluralsight.singleton.DbSingleton dbSingleton = com.pluralsight.singleton.DbSingleton.getInstance();
        Connection connection = dbSingleton.getConnection();

        Statement statement;
        try {
            statement = connection.createStatement();
            int count = statement.executeUpdate("CREATE TABLE Users (ID INT, name VARCHAR(20), adresse VARCHAR(20))");
            System.out.println("table was created");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
