package com.ocp.day17_db;

import com.github.javafaker.Faker;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {
    // 修改 id = ? 該資料
    public static void main(String[] args) throws Exception {
        System.out.print("請輸入要修改的 id = ");
        int id = new Scanner(System.in).nextInt();
        //-----------------------------------------------
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password = "12345678";
        Connection conn = DriverManager.getConnection(url, user, password);
        // 1. 建立 sql 修改語句
        String sql = "update student set name=?, score=?, birth=? where id=?";
        // 2. 建立 PreparedStatement
        Faker faker = new Faker(); // 透過 faker 產出動態測試資料
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, faker.name().firstName());
        pstmt.setInt(2, faker.number().numberBetween(0, 100));
        pstmt.setDate(3, new Date(faker.date().birthday(15, 25).getTime()));
        pstmt.setInt(4, id);
        int rowcount = pstmt.executeUpdate();
        System.out.printf("修改資料筆數: %d\n", rowcount);
        // 3. 關閉資源
        pstmt.close();
        conn.close();
    }
}
