package com.backend.integrador;

import java.sql.Connection;
import java.sql.DriverManager;

public class aplicacion {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/test'", "sa", "sa");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
