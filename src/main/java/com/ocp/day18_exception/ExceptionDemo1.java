package com.ocp.day18_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int apple = 10;
        System.out.print("蘋果有10顆, 請輸入要分的人數:");
        Scanner scanner = new Scanner(System.in);
        try {
            int people = scanner.nextInt(); // 取得使用者所輸入的人數
            int avg = apple / people;
            System.out.printf("每人可得蘋果 %d 顆\n", avg);
        } catch(InputMismatchException e1) {
            System.out.println("錯誤物件: " + e1);
            System.out.println("錯誤訊息: " + e1.getMessage());
            e1.printStackTrace(System.out); // 印出詳細錯誤
            System.out.println("輸入錯誤"); // 自訂錯誤訊息
            System.out.println("程式無法執行");
        }
        System.out.println("程式結束");
    }
}
