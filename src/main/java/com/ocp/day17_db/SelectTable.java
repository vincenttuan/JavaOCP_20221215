package com.ocp.day17_db;

import com.sun.jdi.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Date;

public class SelectTable {
    // 抓取 student 資料表中的資訊
    public static void main(String[] args) throws Exception {
        // 1. 驅動程式建立(JDBC 4.0 此行可以不用寫)
        // 何謂 JDBC 4.0 ? mysql-connector-j-8.0.32.jar 檔中有此結構 MTEA-INF > services > java.sql.Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // 2. 透過 DriverManager 來建立 Connection
        String url = "jdbc:mysql://localhost:3306/demo?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password = "12345678";
        Connection conn = DriverManager.getConnection(url, user, password);
        
        // 3. 建立 sql 查詢語句
        String sql = "select id, name, score, birth from student";
        
        // 4. 建立 Statememt 物件
        Statement stmt = conn.createStatement();
        
        // 5. 在 stmt 中放入 sql 並回傳 ResultSet 物件
        ResultSet rs = stmt.executeQuery(sql);
        
        // 6. 透過 while 迴圈將資料依序取出
        ResultSetMetaData md = rs.getMetaData();
        for(int i=1;i<=md.getColumnCount();i++) {
            System.out.printf("%10s ", md.getColumnName(i));
        }
        System.out.println("\n------------------------------------------------------------------------");
        
        while (rs.next()) { // rs.next() 是否有資料列
            int id      = rs.getInt("id");
            String name = rs.getString("name");
            int score   = rs.getInt("score");
            Date birth  = rs.getDate("birth");
            
            System.out.printf("%10d %10s %10d %10s\n", id, name, score, birth);
        }
        
        // 7. 依序關閉資源連線
        rs.close();
        stmt.close();
        conn.close();
    }
    
}
