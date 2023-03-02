package com.ocp.day19_exception;

public class ExceptionDemo1 {
    
    public static void main(String[] args) throws InterruptedException{
        // 呼叫 bar() : Unchecked Exception
        bar();
        
        // 呼叫 foo() : Checked Exception
        try {
            foo();
        } catch(InterruptedException e) {
            
        }
        
        foo();
    }
    
    public static void bar() throws RuntimeException {
        System.out.println("bar...");
        // ...
    }
    
    public static void foo() throws InterruptedException {
        System.out.println("foo...");
        // ...
    }
}
