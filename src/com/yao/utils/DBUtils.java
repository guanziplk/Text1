package com.yao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtils {
    private static String username = "root";
    private static String password = "762486";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.DriverManager获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/text",username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}