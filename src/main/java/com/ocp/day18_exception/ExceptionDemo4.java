package com.ocp.day18_exception;

// 必須使用 try-catch 錯誤處理

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        // 動態載入驅動程式
        try {
            String className = "com.mysql.cj.jdbc.Driver";
            Class.forName(className); // 會拋出 ClassNotFoundException
            // 建立連線
            String url = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
            String user = "root";
            String password = "12345678";
            Connection conn = DriverManager.getConnection(url, user, password); // 會拋出 SQLException
            conn.close();
            System.out.println("任務完成");
        } catch(ClassNotFoundException | SQLException e1) {
            System.out.println("錯誤內容: " + e1);
        }
        System.out.println("程式結束");
    }
}
