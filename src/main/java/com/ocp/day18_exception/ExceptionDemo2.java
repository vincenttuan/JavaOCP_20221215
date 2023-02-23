package com.ocp.day18_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 若發生 InputMismatchException 的錯誤請顯示訊息 -> "請輸入數字"
 * 不管是否有錯誤發生 "程式結束" 的字樣一定要最後出現 
*/
public class ExceptionDemo2 {
    public static void main(String[] args) {
        int banana = 10;
        System.out.printf("有香蕉 %d 個, 請輸入要分的人數: ", banana);
        Scanner scanner = new Scanner(System.in);
        try {
            int people = scanner.nextInt();
            int average = banana / people;
            System.out.printf("每人可以分得 %d 條\n", average);
        } catch(InputMismatchException e1) {
            System.out.println("請輸入數字");
        } catch(ArithmeticException e2) {
            System.out.println(e2);
            System.out.println(e2.getMessage());
            System.out.println("人數不可為 0");
        }
        System.out.println("程式結束");
    }
}

