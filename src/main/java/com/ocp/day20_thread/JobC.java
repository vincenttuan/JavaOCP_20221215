package com.ocp.day20_thread;

public class JobC extends Thread {

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        // 背景音樂
        for(int i=1;i<=1500;i++) {
            System.out.printf("%s 播放中..time: %d\n", tName, i);
        }
    }
    
}
