package com.ocp.day17_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {
    // 根據指定 name 刪除該筆資料
    public static void main(String[] args) throws Exception {
        System.out.print("請輸入 name: ");
        String name = new Scanner(System.in).next();
        //-----------------------------------------------
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password = "12345678";
        Connection conn = DriverManager.getConnection(url, user, password);
        // 1. 建立危險的 sql 語句
        String sql = "delete from student where name = '" + name + "'";
        System.out.println(sql);
        // 2. 建立危險的 Statement
        Statement stmt = conn.createStatement();
        int rowcount = stmt.executeUpdate(sql);
        System.out.printf("刪除筆數: %d\n", rowcount);
        // 3. 關閉資源
        stmt.close();
        conn.close();
        
    }
}
