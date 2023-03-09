package com.ocp.day21_runnable;

import java.net.URL;
import java.util.Date;
import java.util.Scanner;

public class JobDemo2 {
    public static void main(String[] args) {
        /* 我要建立二個執行緒工作
            1. 得到幸運數字
            2. 得到現在時間
            3. 得到我的外部 ip
        
            @FunctionalInterface
            public interface Runnable { 
                public abstract void run();
            }
        */
        // 透過匿名內部類別來實作
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                int luckyNumber = (int)(Math.random() * 100);
                System.out.println(luckyNumber);
            }
        };
        // 透過 Java 8 Lambda
        Runnable r2 = () -> System.out.println(new Date());
        // 透過 Java 8 Lambda
        Runnable r3 = () -> {
            try {
                URL url = new URL("http://www.j4.com.tw/james/remoip.php");
                String data = new Scanner(url.openStream()).useDelimiter("\\A").next();
                //System.out.println(data);
                String ip = data.substring(data.indexOf(":")+1, data.indexOf("<br>")).trim();
                System.out.println(ip);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        // 建立執行緒執行來指定工作
        Thread t1 = new Thread(r3);
        t1.start();
    }
}
