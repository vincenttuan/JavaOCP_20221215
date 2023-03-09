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
                URL url = new URL("https://www.whatismyip.com.tw/");
                String data = new Scanner(url.openStream()).useDelimiter("\\A").nextLine();
                System.out.println(data);
            } catch (Exception e) {
                System.out.println(e);
            }
        };
    }
}
