package com.ocp.day18_exception;

// 必須使用 try-catch 錯誤處理

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        Connection conn = null;
        // 動態載入驅動程式
        try {
            String className = "com.mysql.cj.jdbc.Driver";
            Class.forName(className); // 會拋出 ClassNotFoundException
            // 建立連線
            String url = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
            String user = "root1";
            String password = "12345678";
            conn = DriverManager.getConnection(url, user, password); // 會拋出 SQLException
            System.out.println("任務完成");
        } catch(ClassNotFoundException | SQLException e1) {
            System.out.println("錯誤內容: " + e1);
            return;
        } finally { // 保證一定會執行
            if(conn != null) {
                try {
                    conn.close();
                    System.out.println("連線關閉");
                } catch(SQLException e2) {
                    System.out.println("連線關閉失敗");
                }
            }
            System.out.println("程式結束");
        }
    }
}
