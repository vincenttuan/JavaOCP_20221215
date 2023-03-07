package com.ocp.day20_thread;

public class HelloMainThread {
    public static void main(String[] args) {
        
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
        // 取得執行緒名稱
        String tName = Thread.currentThread().getName();
        System.out.println("執行緒名稱: " + tName);
    }
}
