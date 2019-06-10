package com.bankproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "SIRKO";
        String password = "S5116951169";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
