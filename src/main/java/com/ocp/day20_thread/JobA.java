package com.ocp.day20_thread;

public class JobA {
    
    public void work() {
        String tName = Thread.currentThread().getName();
        // 跑 1000 次迴圈
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑了 %d 次\n", tName, i);
        }
    }
    
}
