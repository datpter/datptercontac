package com.class1.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() throws Exception {
        Connection conn = null;
        try {
            //Dang ky sql Driver voi DriverManager
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Tao ket noi
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Contact","sa","12345678");
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
        return conn;
    }

    // Dong ket noi
    public static void closeConnection(Connection conn){
        //kiem tra connection co ton tai hay ko
        try {
            if(conn!=null){
                conn.close();
            }

        }catch (Exception e ){
            e.printStackTrace();
        }

    }
}
