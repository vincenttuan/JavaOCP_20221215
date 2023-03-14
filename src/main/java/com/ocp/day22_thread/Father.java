package com.ocp.day22_thread;

public class Father extends Thread {

    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯了");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯");
        
        // 建立 Worker 執行緒
        Worker worker = new Worker();
        worker.start();
        try {
            worker.join(3000);
        } catch(InterruptedException e) {
            System.out.println(e);
        }    
        
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
    
    
}
