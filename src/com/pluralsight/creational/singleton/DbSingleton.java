package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    // volatile will helps us to ensure that instance will
    // remain a singleton through any of the the changes inside the JVM
    private static volatile DbSingleton instance =null;
    // Lazy load singleton
    public static final String JDBC_DERBY_URL = "jdbc:derby:memory:codejava/webdb;create=true";

    private Connection connection = null;

    private DbSingleton() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // here we are converting a singleton eagerly instance to lazy loaded instance and aply threadsafe
    public static DbSingleton getInstance(){
        if (instance==null)
        {
            synchronized (DbSingleton.class) {
                if(instance==null)
                {
                    instance = new DbSingleton();
                }

            }
        }
        return instance;

    }
    public Connection getConnection() {
        if (connection == null) {
            synchronized (DbSingleton.class) {
                if (connection == null) {
                    try {
                        String dbUrl = JDBC_DERBY_URL;
                        connection = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return connection;
    }

}
