package com.ocp.day17_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateRecord {
    // 在 student 資料表中建立一筆紀錄
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password = "12345678";
        Connection conn = DriverManager.getConnection(url, user, password);
        // 1. 建立 sql 新增語句
        String sql = "insert into student(name, score, birth) values(?, ?, ?)";
        // 2. 建立 PreparedStatement
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "Bob");
        pstmt.setInt(2, 75);
        pstmt.setString(3, "2002-4-4");
        int rowcount = pstmt.executeUpdate(); // 執行更新
        System.out.printf("新增資料筆數: %d\n", rowcount);
        // 3. 關閉資源
        pstmt.close();
        conn.close();
    }
}
