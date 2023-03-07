package com.ocp.day20_thread;

public class LuckyNumber extends Thread {

    @Override
    public void run() {
        int ans = 777;
        String tName = Thread.currentThread().getName();
        for(int i=1;true;i++) {
            int x = (int)(Math.random() * 1000); //0~999
            // 印出每一次所取到的資料
            System.out.printf("%s 取了第 %d 次得到 %d\n", tName, i, x);
            if(x == ans) {
                System.out.printf("%s 共取了 %d 次才得到 %d\n", tName, i, ans);
                break;
            }
        }
        
    }
    
}
