package com.ocp.day18_exception;

import java.util.Scanner;


public class ExceptionDemo3 {
    public static void main(String[] args) {
        int orange = 10;
        System.out.printf("有橘子 %d 個, 請輸入要分的人數: ", orange);
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        // 1. 驗證 data 是否都是數字 ?
        boolean checkNumeric = isNumeric(data);
        if(checkNumeric) {
            int people = Integer.parseInt(data); // 將字串轉數字
            // 2. 判斷 people 是否 >= 0
            if(people > 0) {
                int average = orange / people;
                System.out.printf("每人可以分得 %d 條\n", average);
            } else {
                System.out.println("人數必須 > 0");
            }
        } else {
            System.out.println("人數必須是數字");
        }
        System.out.println("程式結束");
    }
    
    public static boolean isNumeric(String data) {
        for(int i=0;i<data.length();i++) {
            if(!Character.isDigit(data.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
