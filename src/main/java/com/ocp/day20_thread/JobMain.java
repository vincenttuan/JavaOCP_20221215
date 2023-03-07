package com.ocp.day20_thread;

public class JobMain {
    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.println(tName);
        JobA jobA = new JobA();
        JobB jobB = new JobB();
        JobC jobC = new JobC();
        
        // 將 jobC 設定為背景執行緒
        jobC.setDaemon(true);
        
        jobA.setName("兔子");
        jobB.setName("烏龜");
        jobC.setName("背景音樂");
        //jobA.run();
        //jobB.run();
        // 權限設定 1~10 (預設是 5)
        // 數字越大表示越容易先做完
        jobB.setPriority(Thread.MAX_PRIORITY); // 10
        jobA.setPriority(Thread.MIN_PRIORITY); // 1
        jobC.setPriority(Thread.MIN_PRIORITY); // 1
        
        jobA.start();
        jobB.start();
        jobC.start();
        
    }
}
