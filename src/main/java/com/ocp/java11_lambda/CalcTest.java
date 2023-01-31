package com.ocp.java11_lambda;

public class CalcTest {
    public static void main(String[] args) {
        // 1. 透過匿名內部類別
        Calc calc = new Calc() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };
        System.out.println(calc.add(10, 20));
        // 2. 利用 Lambda 語法 I
        Calc calc2 = (int x, int y) -> {
            return x + y;
        };
        System.out.println(calc2.add(10, 20));
        
        // 3. 利用 Lambda 語法 II
        Calc calc3 = (x, y) -> {
            return x + y;
        };
        System.out.println(calc3.add(10, 20));
        
        // 4. 利用 Lambda 語法 III
        Calc calc4 = (x, y) -> x + y;
        System.out.println(calc4.add(10, 20));
        
    }
}
