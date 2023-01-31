package com.ocp.java11_lambda;

public class PrinterTest {
    public static void main(String[] args) {
        // 利用 Lambda
        Printer p1 = (data) -> System.out.println(data); 
        p1.print("Hello");
        
        // 透過 Lambda + :: 方法參考
        Printer p2 = System.out::println;
        p2.print("Hello2");
        
    }
}
