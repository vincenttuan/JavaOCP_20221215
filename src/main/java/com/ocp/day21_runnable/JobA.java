package com.ocp.day21_runnable;

public class JobA implements Runnable {

    @Override
    public void run() {
        
        String tName = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑了 %d 步\n", tName, i);
        }
        
    }
    
}
