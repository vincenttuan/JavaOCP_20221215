package com.ocp.day03_basic;

// 捐款程式
public class Donate {
    static int total; // 總捐款金額
    int cash; // 捐款者的捐款金額
    String name; // 捐款者姓名
    
    void submit(int amount) { // 捐款提交
        cash = amount; // 將捐款金額記錄起來
        total = total + amount; // 累計捐款金額
    }
}
