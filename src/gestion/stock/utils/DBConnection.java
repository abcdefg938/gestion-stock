package gestion.stock.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_stock";
    private static final String LOGIN = "root";
    private static final String PWD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, LOGIN, PWD);
    }
}