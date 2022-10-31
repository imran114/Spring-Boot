package com.evampSaanga.RehanTasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtilities {
    private static Connection con  = null;
    public String str;

    private DBUtilities() {
        str = "I am in DBUtilies";
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String uname = "root";
        String pass = "password";
        if(con == null) {
            con = DriverManager.getConnection(url,uname,pass);
        }
        return con;
    }

}
