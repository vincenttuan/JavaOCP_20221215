package com.ocp.day21_runnable;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class JobDemo2 {
    public static void main(String[] args) {
        /* 我要建立二個執行緒工作
            1. 得到幸運數字
            2. 得到現在時間
            3. 得到我的外部 ip
            4. 取得今日台灣加權股價指數(^TWII)
            5. 匯率日幣(JPY)對台幣(TWD)
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
        // 透過 Java 8 Lambda
        Runnable r4 = () -> {
            try {
                Stock stock = YahooFinance.get("^TWII");
                BigDecimal price = stock.getQuote().getPrice(); // 指數/價格
                BigDecimal change = stock.getQuote().getChange(); // 漲跌
                BigDecimal changeInPercent = stock.getQuote().getChangeInPercent(); // 漲跌幅
                System.out.printf("台灣加權股價指數: %,.2f  %.2f(%.2f %%)\n", 
                        price.doubleValue(), change.doubleValue(), changeInPercent.doubleValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        // 透過 Java 8 Lambda
        Runnable r5 = () -> {
            try {
                String[] symbols = {"JPYTWD=X", "TWDJPY=X"};
                Map<String, Stock> stocks = YahooFinance.get(symbols); // x: eXchange
                System.out.println(stocks);
                System.out.println(stocks.keySet());
                BigDecimal price1 = stocks.get("JPYTWD=X").getQuote().getPrice(); // 指數/價格
                BigDecimal price2 = stocks.get("TWDJPY=X").getQuote().getPrice(); // 指數/價格
                System.out.printf("日幣(JPY)對台幣(TWD): %.2f\n", price1.doubleValue());
                System.out.printf("台幣(TWD)對日幣(JPY): %.2f\n", price2.doubleValue());
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        // 建立執行緒執行來指定工作
        Thread t1 = new Thread(r5);
        t1.start();
    }
}
