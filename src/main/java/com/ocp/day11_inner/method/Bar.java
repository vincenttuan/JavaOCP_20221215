package com.ocp.day11_inner.method;

public class Bar {
    int a = 100; // 物件變數
    public void foo() {
        int b = 200; // 區域變數
        int c = 300; // 區域變數
        c = 301;
        // 方法內部類別
        class Inner {
            void print() {
                System.out.println(a);
                System.out.println(b);
                //System.out.println(c); // 不可以使用 c , 因為 c 可以變動
            }
        }
        // 建立方法內部類別實體
        Inner inner = new Inner();
        inner.print();
    }
}
