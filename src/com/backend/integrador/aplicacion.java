package com.backend.integrador;

import java.sql.Connection;
import java.sql.DriverManager;

public class aplicacion {
    //recuerden que las clases siempre se escriben en UpperCamelCase
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            //falto correr el script del create
            connection = DriverManager.getConnection("jdbc:h2:~/test3", "sa", "");
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
