package com.ocp.day20_thread;

public class JobB extends Thread {

    @Override
    public void run() { // 存放著給執行緒的工作
        work();
    }
    
    private void work() {
        String tName = Thread.currentThread().getName();
        // 走 1000 步迴圈
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 走了 %d 步\n", tName, i);
        }
    }
    
}
