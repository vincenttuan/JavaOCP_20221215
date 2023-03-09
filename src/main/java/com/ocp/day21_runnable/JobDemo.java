package com.ocp.day21_runnable;

public class JobDemo {
    public static void main(String[] args) {
        // 要做的工作有...
        JobA jobA = new JobA();
        JobB jobB = new JobB();
        // 建立執行緒來執行指定工作
        Thread t1 = new Thread(jobA, "小明");
        Thread t2 = new Thread(jobB, "小華");
        // 開始工作
        t1.start();
        t2.start();
        
    }
}
