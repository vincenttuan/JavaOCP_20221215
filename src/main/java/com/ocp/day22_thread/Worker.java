package com.ocp.day22_thread;

public class Worker extends Thread {

    @Override
    public void run() {
        System.out.println("瓦斯工人送瓦斯");
        
        // 模擬瓦斯工人送瓦斯的時間
        for(long x=0;x<Long.MIN_VALUE;x++);
        
        System.out.println("瓦斯工人裝好瓦斯");
        
    }
    
}
