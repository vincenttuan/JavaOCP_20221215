package com.ocp.day20_thread;

public class JobMain {
    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.println(tName);
        JobA jobA = new JobA();
        JobB jobB = new JobB();
        jobA.setName("兔子");
        jobB.setName("烏龜");
        //jobA.run();
        //jobB.run();
        // 權限設定 1~10 (預設是 5)
        // 數字越大表示越容易先做完
        jobB.setPriority(10);
        jobA.setPriority(1);
        
        jobA.start();
        jobB.start();
        
    }
}
